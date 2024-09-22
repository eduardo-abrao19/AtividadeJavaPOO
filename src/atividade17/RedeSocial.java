package atividade17;

import java.util.ArrayList;
import java.util.List;

class RedeSocial {
    private List<Usuario> usuarios;

    public RedeSocial() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuario(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        return null;
    }

    public void adicionarAmigo(String nomeUsuario, String nomeAmigo) {
        Usuario usuario = buscarUsuario(nomeUsuario);
        Usuario amigo = buscarUsuario(nomeAmigo);
        if (usuario != null && amigo != null) {
            usuario.adicionarAmigo(amigo);
        }
    }

    public void publicarMensagem(String nomeUsuario, String mensagem) {
        Usuario usuario = buscarUsuario(nomeUsuario);
        if (usuario != null) {
            usuario.publicarMensagem(mensagem);
        }
    }

    public void comentarPost(String nomeUsuario, String nomeAmigo, int postIndex, String comentario) {
        Usuario usuario = buscarUsuario(nomeUsuario);
        Usuario amigo = buscarUsuario(nomeAmigo);
        if (usuario != null && amigo != null) {
            usuario.comentarPost(amigo, postIndex, comentario);
        }
    }
}
