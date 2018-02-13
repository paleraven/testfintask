package sample.data.jpa.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sample.data.jpa.domain.Account;
import sample.data.jpa.repository.AccountRepository;

import java.util.List;

@Component("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountByName(String accountName) {
        return accountRepository.getAccountByNameAccount(accountName);
    }
}
