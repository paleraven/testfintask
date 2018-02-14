package sample.data.jpa.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sample.data.jpa.domain.Balance;
import sample.data.jpa.repository.BalanceRepository;

import java.util.List;

@Component("balanceService")
@Transactional
public class BalanceServiceImpl implements BalanceService {

    private BalanceRepository balanceRepository;

    public BalanceServiceImpl(BalanceRepository balanceRepository) {
        this.balanceRepository = balanceRepository;
    }

    @Override
    public List<Balance> getAllBalances() {
        return balanceRepository.findAll();
    }

    @Override
    public Balance getBalanceById(Long id) {
        return balanceRepository.getBalanceByBalanceId(id);
    }

    @Override
    public Balance insert(Balance balance) {
        return balanceRepository.save(balance);
    }

    @Override
    public List<Balance> saveAll(List<Balance> balances) {
        return balanceRepository.save(balances);
    }
}
