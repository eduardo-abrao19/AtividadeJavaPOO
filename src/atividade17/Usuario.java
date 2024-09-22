package atividade17;

import java.util.ArrayList;
import java.util.List;

class Usuario {
    private String nome;
    private List<Usuario> amigos;
    private List<String> posts;

    public Usuario(String nome) {
        this.nome = nome;
        this.amigos = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public List<String> getPosts() {
        return posts;
    }

    public void adicionarAmigo(Usuario amigo) {
        if (!amigos.contains(amigo)) {
            amigos.add(amigo);
            amigo.getAmigos().add(this);
        }
    }

    public void publicarMensagem(String mensagem) {
        posts.add(mensagem);
    }

    public void comentarPost(Usuario usuario, int postIndex, String comentario) {
        if (postIndex >= 0 && postIndex < usuario.getPosts().size()) {
            String post = usuario.getPosts().get(postIndex);
            usuario.getPosts().set(postIndex, post + "\nComentário: " + comentario);
        }
    }
}
