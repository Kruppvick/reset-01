package Acervo;



import Dominio.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioAcervo {

    private static int contador = +1;
    private static final List<Usuario> usuarios = new ArrayList<>();

    public Usuario salvar (Usuario usuario){

        usuario.setId(contador++);
        usuarios.add(usuario);
        return usuario;
    }
    public Usuario editar (Usuario usuarioParaEditar, Usuario usuarioAtualizado){

        usuarioParaEditar.setNome(usuarioAtualizado.getNome());
        usuarioParaEditar.setEmail(usuarioAtualizado.getEmail());
        usuarioParaEditar.setTelefone(usuarioAtualizado.getTelefone());
        usuarioParaEditar.setGenero(usuarioAtualizado.getGenero());
        usuarioParaEditar.setDataDeNascimento(usuarioAtualizado.getDataDeNascimento());
        usuarioParaEditar.setBio(usuarioAtualizado.getBio());
        usuarioParaEditar.setLatitude(usuarioAtualizado.getLatitude());
        usuarioParaEditar.setLongitude(usuarioAtualizado.getLongitude());
        usuarioParaEditar.setUrlFoto(usuarioAtualizado.getUrlFoto());


        return usuarioParaEditar;
    }

    public List<Usuario> listar () {
        return usuarios;
    }
    public Usuario procurar (int id) {
        for (Usuario usuario : usuarios){
            if (usuario.getId () == id){
                return usuario;

            }
        }
        return null;
    }
    public boolean deletar (int id){
        Usuario usuarioParaDeletar = procurar(id);
        if (usuarioParaDeletar != null){
            return usuarios.remove(usuarioParaDeletar);
        }
        return false;
    }
}

