package br.edu.fema.forum.FemaForum.Model;

import java.time.LocalDateTime;

public class Resposta {
    private Long id;
    private String mensagem;
    private Topico topico;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private Boolean solucao = false;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
}
