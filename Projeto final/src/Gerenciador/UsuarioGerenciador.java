package Gerenciador;



import Acervo.UsuarioAcervo;
import Dominio.Usuario;


import java.util.List;

public class UsuarioGerenciador {

    private UsuarioAcervo acervo = new UsuarioAcervo();

    public Usuario salvar(Usuario usuario) {

        List<Usuario> usuarios = acervo.listar();


        for (Usuario usuarioExistente : usuarios) {
            if (usuario.getEmail().equals(usuarioExistente.getEmail())) {
                return usuarioExistente;
            }

        }
/* Parâmetro para que menores de 18 anos não possam fazer o cadastro */

        if (usuario.idadeAtual() < 18) {
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
}
