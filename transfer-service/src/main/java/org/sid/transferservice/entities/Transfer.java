package org.sid.transferservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.transferservice.enums.Etat;
import org.sid.transferservice.models.Wallet;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;




@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Transfer {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @Transient
    private Wallet source;
    @Transient
    private Wallet destination;
    private double montant;
    private Etat etat;





}
