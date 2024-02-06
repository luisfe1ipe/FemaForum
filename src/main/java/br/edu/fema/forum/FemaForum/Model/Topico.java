package br.edu.fema.forum.FemaForum.Model;

import br.edu.fema.forum.FemaForum.Enum.StatusTopico;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Topico {
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private StatusTopico status = StatusTopico.NAO_RESPONDIDO;
    private Usuario autor;
    private Curso curso;
    private List<Resposta> respostas = new ArrayList<>();

    public Topico(String titulo, String mensagem, Curso curso)
    {
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.curso = curso;
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
