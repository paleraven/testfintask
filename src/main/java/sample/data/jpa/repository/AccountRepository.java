package sample.data.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import sample.data.jpa.domain.Account;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long> {
    List<Account> findAll();

    Account getAccountByNameAccount(String accountName);

    Account save(Account account);

    List<Account> save(List<Account> accounts);
}
