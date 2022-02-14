package com.bootcamp.deposit.service;

import com.bootcamp.deposit.model.dto.Deposit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IDepositService {

    Flux<Deposit> getAllDeposits();

    //Mono<Deposit> getDeposit();
    Flux<Deposit> getDepositsForAccount(String numAccount);

    Mono<Deposit> saveDeposit(Deposit deposit);

    Mono<Deposit> updateDeposit(Deposit deposit);

    Mono<Deposit> deleteDeposit(String id);
}
