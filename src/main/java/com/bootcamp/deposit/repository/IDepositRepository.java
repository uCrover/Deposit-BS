package com.bootcamp.deposit.repository;

import com.bootcamp.deposit.model.dto.Deposit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface IDepositRepository  extends ReactiveMongoRepository<Deposit,String> {

    Flux<Deposit> findByNumAccount(String numAccount);
}
