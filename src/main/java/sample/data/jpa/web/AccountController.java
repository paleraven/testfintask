package sample.data.jpa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sample.data.jpa.domain.Fields;
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

    @RequestMapping("/form")
    public String getForm(Model model) {
        model.addAttribute("fields", new Fields());
        return "form";
    }

    @PostMapping("/form")
    public String calculate(Fields fields) {

        // принимаем поля с формы

        System.out.println();
        // тут вызываем сервис и отправлям данные в бд

        return "redirect:/form";
    }

}
