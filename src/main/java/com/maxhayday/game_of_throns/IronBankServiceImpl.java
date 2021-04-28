package com.maxhayday.game_of_throns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class IronBankServiceImpl implements IronBankService {

    @Autowired
    private MoneyRepo moneyRepo;

    @Override
    public double getMoney() {
        return moneyRepo.findAll().iterator().next().getAmount();
    }

    @Override
    public void decreaseMoney(int amount) {
        Bank bank = moneyRepo.findAll().iterator().next();
        bank.setAmount(bank.getAmount() - amount);
    }
}
