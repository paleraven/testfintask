package sample.data.jpa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sample.data.jpa.domain.Balance;
import sample.data.jpa.domain.IncomeReport;
import sample.data.jpa.service.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.IsoFields;
import java.util.Calendar;

@Controller
public class AccountController {

    private AccountService accountService;

    private BalanceService balanceService;

    private IncomeReportService incomeReportService;

    private CountingServiceImpl countingService;

    @Autowired
    public AccountController(AccountService accountService,
                             BalanceService balanceService,
                             IncomeReportService incomeReportService,
                             CountingServiceImpl countingService) {
        this.accountService = accountService;
        this.balanceService = balanceService;
        this.incomeReportService = incomeReportService;
        this.countingService = countingService;
    }

    @RequestMapping("/balance")
    public String getBalance(Model model) {
        model.addAttribute("balance", new Balance());
        model.addAttribute("accounts", this.accountService.getAllAccounts());
        return "balance";
    }

    @PostMapping("/balance/insert")
    public Model insertBalance(Balance balance, Model model) {

        Calendar calendar = Calendar.getInstance();

        balance.setCreated(calendar.getTime());
        balance.setYear(String.valueOf(calendar.get(Calendar.YEAR)));
        balance.setPeriod(LocalDate
                .of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH))
                .get(IsoFields.QUARTER_OF_YEAR));
        balance.incrementVersion();

        this.balanceService.insert(balance);

        model.addAttribute("newBalance", balance);
        return model;
    }

    @PostMapping("/balance/calculate")
    public Model sum1100(HttpServletRequest req, Model model) {
        Balance balance = new Balance();
        balance.setRow1110((BigDecimal) req.getAttribute("row1110"));
        balance.setRow1120((BigDecimal) req.getAttribute("row1120"));
        balance.setRow1130((BigDecimal) req.getAttribute("row1130"));
        balance.setRow1140((BigDecimal) req.getAttribute("row1140"));
        balance.setRow1120((BigDecimal) req.getAttribute("row1120"));
        balance.setRow1120((BigDecimal) req.getAttribute("row1120"));
        balance.setRow1120((BigDecimal) req.getAttribute("row1120"));
        balance.setRow1120((BigDecimal) req.getAttribute("row1120"));
        balance.setRow1120((BigDecimal) req.getAttribute("row1120"));
        this.countingService.setBalance(balance).ruleSumof1100();
        BigDecimal sum = balance.getRow1100();
        model.addAttribute("row1100", sum);
        return model;
    }

    @PostMapping("/balance")
    public String receiveBalance(Balance balance) {
        return "redirect:/balance";
    }

    @RequestMapping("/income_report")
    public String getIncomeReport(Model model) {
        model.addAttribute("fields", new IncomeReport());
        model.addAttribute("accounts", this.accountService.getAllAccounts());
        return "income_report";
    }

    @PostMapping("/income_report/insert")
    public String insertIncomeReport(IncomeReport incomeReport, Model model) {

        Calendar calendar = Calendar.getInstance();

        incomeReport.setCreated(calendar.getTime());
        incomeReport.setYear(String.valueOf(calendar.get(Calendar.YEAR)));
        incomeReport.setPeriod(LocalDate
                .of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH))
                .get(IsoFields.QUARTER_OF_YEAR));
        incomeReport.incrementVersion();

        this.incomeReportService.insert(incomeReport);

        model.addAttribute("newIncomeReport", incomeReport);
        return "redirect:/income_report";
    }

    @PostMapping("/income_report")
    public String receiveIncomeReport(IncomeReport incomeReport) {
        return "redirect:/income_report";
    }

}
