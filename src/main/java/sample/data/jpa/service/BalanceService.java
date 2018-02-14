package sample.data.jpa.service;

import sample.data.jpa.domain.Balance;

import java.util.List;

public interface BalanceService {
    List<Balance> getAllBalances();

    Balance getBalanceById(Long id);

    Balance insert(Balance balance);

    List<Balance> saveAll(List<Balance> balances);
}
