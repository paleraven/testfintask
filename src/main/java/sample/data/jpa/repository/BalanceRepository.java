package sample.data.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import sample.data.jpa.domain.Balance;

import java.util.List;

public interface BalanceRepository extends CrudRepository<Balance, Long> {
    List<Balance> findAll();

    Balance getBalanceByBalanceId(Long id);

    Balance save(Balance balance);

    List<Balance> save(List<Balance> balances);
}
