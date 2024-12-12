package org.rathing.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Produtos {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String produto;

@Column(nullable = false)
private int quantidade;



    @OneToMany
    @JoinColumn(name="id", referencedColumnName="id_medida")
    private Set<Medida> medidas = new HashSet<>();

    @OneToMany
    @JoinColumn(name="id", referencedColumnName="id_medida")
    private Set<Marca> marcas = new HashSet<>();

    private int id_medida;
    private int id_marca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Set<Marca> getMarcas() {
        return marcas;
    }

    public void setMarcas(Set<Marca> marcas) {
        this.marcas = marcas;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Set<Medida> getMedidas() {
        return medidas;
    }

    public void setMedidas(Set<Medida> medidas) {
        this.medidas = medidas;
    }

    public int getId_medida() {
        return id_medida;
    }

    public void setId_medida(int id_medida) {
        this.id_medida = id_medida;
    }
}
