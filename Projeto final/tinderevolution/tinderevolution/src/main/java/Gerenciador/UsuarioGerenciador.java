package Gerenciador;

import Acervo.UsuarioAcervo;
import Dominio.*;

import java.util.ArrayList;
import java.util.List;

public class UsuarioGerenciador {
    private UsuarioAcervo acervo = new UsuarioAcervo();

    public Usuario salvar(Usuario usuario) {

        List<Usuario> usuarios = acervo.listar();

        if (usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getTelefone().isEmpty() || usuario.getDataDeNascimento()== null ||
                usuario.getBio().isEmpty() || usuario.getLatitude().isNaN() || usuario.getLongitude().isNaN())
            System.out.println("Campos obrigatórios");


        for (Usuario usuarioExistente : usuarios) {
            if (usuario.getEmail().equals(usuarioExistente.getEmail())) {
                return usuarioExistente;
            }

        }
        /* Parâmetro para que menores de 18 anos não possam fazer o cadastro */

        if (usuario.idadeAtual(usuario.getDataDeNascimento()) < 18) {
            System.out.println("App somente para maiores de 18 anos.");
            return null;
        }
        return acervo.salvar(usuario);
    }

    public Usuario editar(int id, Usuario usuarioAtualizado) {
        Usuario usuarioParaEditar = procurar(id);

        if (usuarioParaEditar == null) {
            return null;
        } else {
            return acervo.editar(usuarioParaEditar, usuarioAtualizado);
        }
    }

    public List<Usuario> listar() {
        return acervo.listar();
    }

    public Usuario procurar(int id) {
        if (id > 0) {
            return acervo.procurar(id);
        }

        return null;
    }

    public boolean deletar(int id) {
        if (id > 0) {
            return acervo.deletar(id);
        }
        return false;
    }

    public boolean curtirUsuario (int idUsuarioAvaliado, int idUsuarioAvaliador){
        if (this.procurar(idUsuarioAvaliador) != null) {
            Usuario usuario = this.procurar(idUsuarioAvaliado);
            return usuario.curtirUsuario(idUsuarioAvaliador);
        }
        return false;
    }
    public boolean dislikeUsuario (int idUsuarioAvaliado, int idUsuarioAvaliador){
        if (this.procurar(idUsuarioAvaliado) != null) {
            Usuario usuario = this.procurar(idUsuarioAvaliado);
            return usuario.dislikeUsuario(idUsuarioAvaliador);
        }
        return false;
    }

    public Integer deletarCurtidaUsuario (int idUsuarioAvaliado, int idUsuarioAvaliador){
        if (this.procurar(idUsuarioAvaliador) !=null) {
            Usuario usuario = this.procurar(idUsuarioAvaliado);
            return usuario.deletarDislikeUsuario(idUsuarioAvaliador);
        }
        return null;
    }
    public Usuario ranking (int idUsuario){
        Usuario usuarioAvaliado = this.procurar(idUsuario);
        if (usuarioAvaliado == null){
            return null;
        }
        UsuarioAcervo usuarioAcervo = new UsuarioAcervo();
        List<Usuario> listarUsuarios = usuarioAcervo.listar();
        listarUsuarios.remove(usuarioAvaliado);
        Usuario usuario = null;
        int melhorPontuacao = 0;
        for (Usuario listaUsuario : listarUsuarios){
            int pontuacao = 0;
            if (!usuarioAvaliado.curtidasUsuario.contains(listaUsuario.getId()) && !usuarioAvaliado.dislikesUsuario.contains(listaUsuario.getId()))
            {
                for (Integer musicaAvaliada : usuarioAvaliado.getCurtidasMusicas()) {
                    for (Integer musicaListaUsuario : listaUsuario.getCurtidasMusicas()) {
                        if (musicaAvaliada.equals(musicaListaUsuario)) {
                            pontuacao++;
                        }
                    }
                }
                for (Integer filmeAvaliado : usuarioAvaliado.getCurtidasFilmes()) {
                    for (Integer filmeListaUsuario : listaUsuario.getCurtidasFilmes()) {
                        if (filmeAvaliado.equals(filmeListaUsuario)) {
                            pontuacao++;
                        }
                    }
                }
                for (Integer serieAvaliado : usuarioAvaliado.getCurtidasSeries()) {
                    for (Integer serieListaUsuario : listaUsuario.getCurtidasSeries()) {
                        if (serieAvaliado.equals(serieListaUsuario)) {
                            pontuacao++;
                        }
                    }
                }
                for (Integer jogoAvaliado : usuarioAvaliado.getCurtidasJogos()) {
                    for (Integer jogoListaUsuario : listaUsuario.getCurtidasJogos()) {
                        if (jogoAvaliado.equals(jogoListaUsuario)) {
                            pontuacao++;
                        }
                    }
                }
                for (Integer esporteAvaliado : usuarioAvaliado.getCurtidasEsporte()) {
                    for (Integer esporteListaUsuario : usuarioAvaliado.getCurtidasEsporte()) {
                        if (esporteAvaliado.equals(esporteListaUsuario)) {
                            pontuacao++;
                        }
                    }
                }
                if (pontuacao > melhorPontuacao) {
                    usuario = listaUsuario;
                    melhorPontuacao = pontuacao;
                }
            }
        }
        return usuario;
    }

    public List<Usuario> formarMatches (int idUsuarioAvaliado) {
        Usuario usuarioAvaliado = this.procurar(idUsuarioAvaliado);
        if (usuarioAvaliado == null) {
            return null;
        }
        List<Usuario> listaMaches = new ArrayList<>();
        UsuarioAcervo usuarioAcervo = new UsuarioAcervo();
        List<Usuario> listarUsuarios = usuarioAcervo.listar();
        for (Usuario usuario : listarUsuarios) {
            if (usuarioAvaliado.curtidasUsuario.contains(usuario.getId()) && usuario.curtidasUsuario.contains(usuarioAvaliado.getId())) {
                listaMaches.add(usuario);
            }
        }
        return listaMaches;
    }
    public List<Musica> listarMusicasCurtidas (int idUsuario) {
        Usuario usuario = this.procurar(idUsuario);
        MusicaGerenciador musicaGerenciador = new MusicaGerenciador();
        List<Musica> listaMusicasCurtidas = new ArrayList<>();
        for (Integer id : usuario.getCurtidasMusicas()) {
            Musica musicaCurtida = musicaGerenciador.procurar(id);
            listaMusicasCurtidas.add(musicaCurtida);
        }
        return listaMusicasCurtidas;
    }
    public boolean curtirMusica (int idMusica, int idUsuario) {
        MusicaGerenciador musicaGerenciador = new MusicaGerenciador();
        if (musicaGerenciador.procurar(idMusica) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.curtirMusica(idMusica);
        }
        return false;
    }

    public Integer dislikeMusica (int idMusica, int idUsuario) {
        MusicaGerenciador musicaGerenciador = new MusicaGerenciador();
        if (musicaGerenciador.procurar(idMusica) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.dislikeMusica(idMusica);
        }
        return null;
    }
    public List<Filme> listarFilmesCurtidos (int idUsuario) {
        Usuario usuario = this.procurar(idUsuario);
        FilmeGerenciador filmeGerenciador = new FilmeGerenciador();
        List<Filme> listaFilmesCurtidos = new ArrayList<>();
        for (Integer id : usuario.getCurtidasFilmes()) {
            Filme filmeCurtidos = filmeGerenciador.procurar(id);
            listaFilmesCurtidos.add(filmeCurtidos);
        }
        return listaFilmesCurtidos;
    }
    public boolean curtirFilme (int idFilme, int idUsuario) {
        FilmeGerenciador filmeGerenciador = new FilmeGerenciador();
        if (filmeGerenciador.procurar(idFilme) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.curtirFilme(idFilme);
        }
        return false;
    }

    public Integer dislikeFilme (int idFilme, int idUsuario) {
        FilmeGerenciador filmeGerenciador = new FilmeGerenciador();
        if (filmeGerenciador.procurar(idFilme) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.dislikeFilme(idFilme);
        }
        return null;
    }

    public List<Serie> listarSerieCurtida (int idUsuario) {
        Usuario usuario = this.procurar(idUsuario);
        SerieGerenciador serieGerenciador = new SerieGerenciador();
        List<Serie> listaSerieCurtida = new ArrayList<>();
        for (Integer id : usuario.getCurtidasSeries()) {
            Serie serieCurtida = serieGerenciador.procurar(id);
            listaSerieCurtida.add(serieCurtida);
        }
        return listaSerieCurtida;
    }

    public boolean curtirSerie (int idSerie, int idUsuario) {
        SerieGerenciador serieGerenciador = new SerieGerenciador();
        if (serieGerenciador.procurar(idSerie) !=null){
            Usuario usuario = this.procurar(idUsuario);
            return usuario.curtirSerie(idSerie);
        }
        return false;
    }

    public Integer dislikeSerie (int idSerie, int idUsuario) {
        SerieGerenciador serieGerenciador = new SerieGerenciador();
        if (serieGerenciador.procurar(idSerie) !=null){
            Usuario usuario = this.procurar(idUsuario);
            return usuario.dislikeSerie(idSerie);
        }
        return null;
    }

    public List<Jogo> listaJogosCurtidos (int idUsuario) {
        Usuario usuario = this.procurar(idUsuario);
        JogoGerenciador jogoGerenciador = new JogoGerenciador();
        List<Jogo> listaJogosCurtidos = new ArrayList<>();
        for (Integer id : usuario.getCurtidasJogos()) {
            Jogo jogosCurtidos = jogoGerenciador.procurar(id);
            listaJogosCurtidos.add(jogosCurtidos);
        }
        return listaJogosCurtidos;
    }
    public boolean curtirJogo (int idJogo, int idUsuario) {
        JogoGerenciador jogoGerenciador = new JogoGerenciador();
        if (jogoGerenciador.procurar(idJogo) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.curtirJogo(idJogo);
        }
        return false;
    }

    public Integer dislikejogo (int idJogo, int idUsuario){
        JogoGerenciador jogoGerenciador = new JogoGerenciador();
        if (jogoGerenciador.procurar(idJogo) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.dislikeJogo(idJogo);
        }
        return null;

    }

    public List<Esporte> listarEsporteCurtidos (int idUsuario) {
        Usuario usuario = this.procurar(idUsuario);
        EsporteGerenciador esporteGerenciador = new EsporteGerenciador();
        List<Esporte> listarEsportesCurtidos = new ArrayList<>();
        for (Integer id : usuario.getCurtidasEsporte()) {
            Esporte esporteCurtido = esporteGerenciador.procurar(id);
            listarEsportesCurtidos.add(esporteCurtido);
        }
        return listarEsportesCurtidos;
    }

    public boolean curtirEsporte (int idEsporte, int idUsuario) {
        EsporteGerenciador esporteGerenciador = new EsporteGerenciador();
        if (esporteGerenciador.procurar(idEsporte) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.curtirEsporte(idEsporte);
        }
        return false;
    }

    public Integer dislikeEsporte (int idEsporte, int idUsuario){
        EsporteGerenciador esporteGerenciador = new EsporteGerenciador();
        if (esporteGerenciador.procurar(idEsporte) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.dislikeEsporte(idEsporte);
        }
        return null;
    }

    public List<Curiosidade> listarCuriosidade (int idUsuario) {
        Usuario usuario = this.procurar(idUsuario);
        CuriosidadeGerenciador curiosidadeGerenciador = new CuriosidadeGerenciador();
        List<Curiosidade> listaCuriosidades = new ArrayList<>();
        for (Integer id : usuario.getCuriosidades()) {
            Curiosidade curiosidadeListada = curiosidadeGerenciador.procurar(id);
            listaCuriosidades.add(curiosidadeListada);
        }
        return listaCuriosidades;
    }

    public boolean CadastrarCuriosidade (int idCuriosidade, int idUsuario) {
        CuriosidadeGerenciador curiosidadeGerenciador = new CuriosidadeGerenciador();
        if (curiosidadeGerenciador.procurar(idCuriosidade) != null) {
            Usuario usuario = this.procurar(idUsuario);
            return usuario.cadastrarCuriosidade(idCuriosidade);
        }
        return false;
    }


}
