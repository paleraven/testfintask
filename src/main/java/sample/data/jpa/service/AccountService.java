package sample.data.jpa.service;

import sample.data.jpa.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();

    Account getAccountByName(String accountName);

    Account insert(Account account);

    List<Account> saveAll(List<Account> accounts);
}
