package com.maxhayday.game_of_throns;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@Slf4j
public class LoanService {

    @Autowired
    private IronBankService ironBankService;

    @Autowired
    private PredictionService predictionService;


    public String loan(  String name,   int amount) {
        if (ironBankService.getMoney()> amount && predictionService.willSurvive(name)){
            log.info(amount + " was transfered");
            ironBankService.decreaseMoney(amount);
            return "loan accepted";
        }else {
            return "loan rejected, you will die";
        }
    }
}
