package sample.data.jpa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sample.data.jpa.domain.Balance;
import sample.data.jpa.domain.IncomeReport;
import sample.data.jpa.service.AccountService;
import sample.data.jpa.service.BalanceService;
import sample.data.jpa.service.IncomeReportService;

@Controller
public class AccountController {

    private AccountService accountService;

    private BalanceService balanceService;

    private IncomeReportService incomeReportService;

    @Autowired
    public AccountController(AccountService accountService,
                             BalanceService balanceService,
                             IncomeReportService incomeReportService) {
        this.accountService = accountService;
        this.balanceService = balanceService;
        this.incomeReportService = incomeReportService;
    }

    @RequestMapping("/balance")
    public String getBalance(Model model) {
        model.addAttribute("balance", new Balance());
        model.addAttribute("accounts", this.accountService.getAllAccounts());
        return "balance";
    }

    @PostMapping("/balance")
    public String receiveBalance(Balance balance) {

        // принимаем поля с формы

        System.out.println();
        // тут вызываем сервис и отправлям данные в бд

        return "redirect:/balance";
    }

    @RequestMapping("/income_report")
    public String getIncomeReport(Model model) {
        model.addAttribute("fields", new IncomeReport());
        return "income_report";
    }

    @PostMapping("/income_report")
    public String receiveIncomeReport(IncomeReport fields) {

        // принимаем поля с формы

        System.out.println();
        // тут вызываем сервис и отправлям данные в бд

        return "redirect:/income_report";
    }

}
