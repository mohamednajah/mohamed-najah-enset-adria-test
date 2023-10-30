package com.sid.adria_test;

import com.sid.adria_test.entities.Wallet;
import com.sid.adria_test.entities.client;
import com.sid.adria_test.repositories.ClientRepository;
import com.sid.adria_test.repositories.WalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class AdriaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdriaTestApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ClientRepository clientRepository, WalletRepository walletRepository){
		return args -> {
		 client client1=clientRepository.save(new client(null,"mohamed","mohamed@gmail.com",null));
		walletRepository.save(new Wallet(UUID.randomUUID().toString(),Math.random()*10000,new Date(),"DH",client1));

			client client2=clientRepository.save(new client(null,"rachid","rachid@gmail.com",null));
			walletRepository.save(new Wallet(UUID.randomUUID().toString(),Math.random()*10000,new Date(),"DH",client2));


			client client3=clientRepository.save(new client(null,"allami","allami@gmail.com",null));
			walletRepository.save(new Wallet(UUID.randomUUID().toString(),Math.random()*10000,new Date(),"DH",client3));
		};
	}

}
