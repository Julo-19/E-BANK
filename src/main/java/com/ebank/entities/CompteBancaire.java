package com.ebank.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data

public abstract class CompteBancaire implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double balance ;
    private String numCompte;
    private String devis = "CFA";
}
