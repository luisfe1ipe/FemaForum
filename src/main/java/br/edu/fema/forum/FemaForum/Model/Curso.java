package br.edu.fema.forum.FemaForum.Model;

public class Curso {

    private Long id;
    private String nome;
    private String categoria;


    public Curso(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
}
