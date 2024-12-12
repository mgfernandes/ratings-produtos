package org.rathing.dto;

public class ProdutoDTO {

    private String produto;
    private String marca;
    private int quantidade;
    private String medida;


    public ProdutoDTO(String produto, String marca, int quantidade, String medida) {
        this.produto = produto;
        this.marca = marca;
        this.quantidade = quantidade;
        this.medida = medida;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }
}
