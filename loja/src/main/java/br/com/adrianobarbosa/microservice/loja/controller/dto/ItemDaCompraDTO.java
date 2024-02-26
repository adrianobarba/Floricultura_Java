package br.com.adrianobarbosa.microservice.loja.controller.dto;

import java.util.logging.LogManager;

public class ItemDaCompraDTO {

    private Long id;
    private int quantidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
