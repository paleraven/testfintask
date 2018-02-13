package sample.data.jpa.repository;

import org.springframework.data.repository.Repository;
import sample.data.jpa.domain.Account;

import java.util.List;

public interface AccountRepository extends Repository<Account, Long> {
    List<Account> findAll();

    Account getAccountByNameAccount(String accountName);
}
