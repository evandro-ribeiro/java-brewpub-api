package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Cervejas cervejas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cervejas getCervejas() {
        return cervejas;
    }

    public void setCervejas(Cervejas cervejas) {
        this.cervejas = cervejas;
    }

}
