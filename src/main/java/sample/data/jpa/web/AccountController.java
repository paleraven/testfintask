package sample.data.jpa.web;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sample.data.jpa.domain.Balance;
import sample.data.jpa.domain.IncomeReport;
import sample.data.jpa.service.AccountService;
import sample.data.jpa.service.BalanceService;
import sample.data.jpa.service.CountingServiceImpl;
import sample.data.jpa.service.IncomeReportService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.IsoFields;
import java.util.Calendar;
import java.util.Map;

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

    @ResponseBody
    @GetMapping("/balance/calculate/row1100")
    public Map<String, ? extends Object> sum1100(@RequestParam String row1110,
                                                 @RequestParam String row1120,
                                                 @RequestParam String row1130,
                                                 @RequestParam String row1140,
                                                 @RequestParam String row1150,
                                                 @RequestParam String row1160,
                                                 @RequestParam String row1170,
                                                 @RequestParam String row1180,
                                                 @RequestParam String row1190) {
        Balance balance = new Balance();
        balance.setRow1110(new BigDecimal(row1110));
        balance.setRow1120(new BigDecimal(row1120));
        balance.setRow1130(new BigDecimal(row1130));
        balance.setRow1140(new BigDecimal(row1140));
        balance.setRow1150(new BigDecimal(row1150));
        balance.setRow1160(new BigDecimal(row1160));
        balance.setRow1170(new BigDecimal(row1170));
        balance.setRow1180(new BigDecimal(row1180));
        balance.setRow1190(new BigDecimal(row1190));
        this.countingService.setBalance(balance).ruleSumof1100();
        Map<String, String> map = Maps.newHashMap();
        map.put("row1100", String.valueOf(balance.getRow1100()));
        return map;
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
