package org.sid.transferservice.Feign;

import org.sid.transferservice.models.Wallet;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name = "wallet-service")
public interface WalletServiceClient {
    @GetMapping("/wallets/{id}")
    Wallet getWalletById(@PathVariable("id") String id);
}



