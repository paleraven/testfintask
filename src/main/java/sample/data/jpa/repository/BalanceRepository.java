package sample.data.jpa.repository;

import org.springframework.data.repository.Repository;
import sample.data.jpa.domain.Balance;

import java.util.List;

public interface BalanceRepository extends Repository<Balance, Long> {
    List<Balance> findAll();

    Balance getBalanceByBalanceId(Long id);
}
