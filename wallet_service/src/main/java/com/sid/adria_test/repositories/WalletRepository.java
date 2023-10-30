package com.sid.adria_test.repositories;

import com.sid.adria_test.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface WalletRepository extends JpaRepository<Wallet,String> {
}
