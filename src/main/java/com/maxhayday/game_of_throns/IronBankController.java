package com.maxhayday.game_of_throns;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/iron-bank")
public class IronBankController {

    @Autowired
    private LoanService loanService;

    @Autowired
    private IronBankService ironBankService;

    @GetMapping("/loan")
    public String loan(@RequestParam String name, @RequestParam int amount) {
       return loanService.loan(name, amount);
    }

    @GetMapping("/balance")
    public double seeBalance(){
        return ironBankService.getMoney();
    }

}
