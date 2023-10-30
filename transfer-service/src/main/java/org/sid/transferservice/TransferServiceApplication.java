package org.sid.transferservice;

import org.sid.transferservice.Feign.WalletServiceClient;
import org.sid.transferservice.entities.Transfer;
import org.sid.transferservice.enums.Etat;
import org.sid.transferservice.models.Wallet;
import org.sid.transferservice.repositories.TransferRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@EnableFeignClients

@SpringBootApplication
public class TransferServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransferServiceApplication.class, args);


	}

	@Bean
CommandLineRunner commandLineRunner(TransferRepository transferRepository, WalletServiceClient walletServiceClient){
		return args -> {
			Wallet walletsource=walletServiceClient.getWalletById("1440e1c9-7dd5-4f95-8c29-76209bf7d1dd");
			Wallet walletdestination=walletServiceClient.getWalletById("3d9ce5fc-29e4-4883-b25f-4413d509b3b4");
			transferRepository.save(new Transfer(null,new Date(),walletsource,walletdestination,1500, Etat.PENDIND));

		};
	}
}
