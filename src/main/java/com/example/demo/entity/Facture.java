package com.example.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "facture")
    private Set<LigneFacture> ligneFacture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set getLigneFacture() {
        return ligneFacture;
    }

    public void setLigneFacture(Set ligneFacture) {
        this.ligneFacture = ligneFacture;
    }
}