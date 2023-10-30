package com.sid.adria_test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Entity @NoArgsConstructor @AllArgsConstructor
public class Wallet {
    @Id
    private String id;
    private double solde;
    private Date dateCreation;
    private String Devise;
    @OneToOne
    private com.sid.adria_test.entities.client client;
}
