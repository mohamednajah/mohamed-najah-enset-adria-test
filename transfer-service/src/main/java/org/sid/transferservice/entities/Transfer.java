package org.sid.transferservice.entities;

import org.sid.transferservice.enums.Etat;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;



public class Wallet {
    private Long id;
    private Date date;
    private double montant;
    // Autres champs de Wallet
    // Getters, setters, constructeurs, etc.
}
public class Transfer {
    private Long id;
    private Date date;
    private Wallet source;
    private Wallet destination;
    private double montant;
    private Etat etat;

    @FeignClient(name = "wallet-service") // Specify the name of the first microservice
    public interface WalletServiceClient {
        @GetMapping("/wallets/{id}")
        Wallet getWalletById(@PathVariable("id") String id);
    }



}
