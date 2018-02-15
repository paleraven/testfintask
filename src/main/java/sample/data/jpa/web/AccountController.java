package sample.data.jpa.web;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sample.data.jpa.domain.Balance;
import sample.data.jpa.domain.IncomeReport;
import sample.data.jpa.service.*;

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

    @PostMapping("/balance/to_xml")
    public String balanceToXml(Balance balance, Model model) {

        Calendar calendar = Calendar.getInstance();

        balance.setCreated(calendar.getTime());
        balance.setYear(String.valueOf(calendar.get(Calendar.YEAR)));
        balance.setPeriod(LocalDate
                .of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH))
                .get(IsoFields.QUARTER_OF_YEAR));
        balance.incrementVersion();

        ToXMLServiceImpl.commonToXML(balance, "balance.xml");

        model.addAttribute("newBalance", balance);
        return "redirect:/balance";
    }

    @ResponseBody
    @GetMapping("/balance/calculate/row1200")
    public Map<String, ? extends Object> sum1200(@RequestParam String row1210,
                                                 @RequestParam String row1220,
                                                 @RequestParam String row1230,
                                                 @RequestParam String row1240,
                                                 @RequestParam String row1250,
                                                 @RequestParam String row1260) {
        Balance balance = new Balance();
        balance.setRow1210(new BigDecimal(row1210));
        balance.setRow1220(new BigDecimal(row1220));
        balance.setRow1230(new BigDecimal(row1230));
        balance.setRow1240(new BigDecimal(row1240));
        balance.setRow1250(new BigDecimal(row1250));
        balance.setRow1260(new BigDecimal(row1260));
        this.countingService.setBalance(balance).ruleSumof1200();
        Map<String, String> map = Maps.newHashMap();
        map.put("row1200", String.valueOf(balance.getRow1200()));
        return map;
    }

    @ResponseBody
    @GetMapping("/balance/calculate/row1300")
    public Map<String, ? extends Object> sum1300(@RequestParam String row1310,
                                                 @RequestParam String row1320,
                                                 @RequestParam String row1340,
                                                 @RequestParam String row1350,
                                                 @RequestParam String row1360,
                                                 @RequestParam String row1370) {
        Balance balance = new Balance();
        balance.setRow1310(new BigDecimal(row1310));
        balance.setRow1320(new BigDecimal(row1320));
        balance.setRow1340(new BigDecimal(row1340));
        balance.setRow1350(new BigDecimal(row1350));
        balance.setRow1360(new BigDecimal(row1360));
        balance.setRow1370(new BigDecimal(row1370));
        this.countingService.setBalance(balance).ruleSumof1300();
        Map<String, String> map = Maps.newHashMap();
        map.put("row1300", String.valueOf(balance.getRow1300()));
        return map;
    }

    @ResponseBody
    @GetMapping("/balance/calculate/row1400")
    public Map<String, ? extends Object> sum1400(@RequestParam String row1410,
                                                 @RequestParam String row1420,
                                                 @RequestParam String row1430,
                                                 @RequestParam String row1450) {
        Balance balance = new Balance();
        balance.setRow1410(new BigDecimal(row1410));
        balance.setRow1420(new BigDecimal(row1420));
        balance.setRow1430(new BigDecimal(row1430));
        balance.setRow1450(new BigDecimal(row1450));
        this.countingService.setBalance(balance).ruleSumof1400();
        Map<String, String> map = Maps.newHashMap();
        map.put("row1400", String.valueOf(balance.getRow1400()));
        return map;
    }

    @ResponseBody
    @GetMapping("/balance/calculate/row1500")
    public Map<String, ? extends Object> sum1500(@RequestParam String row1510,
                                                 @RequestParam String row1520,
                                                 @RequestParam String row1530,
                                                 @RequestParam String row1540,
                                                 @RequestParam String row1550) {
        Balance balance = new Balance();
        balance.setRow1510(new BigDecimal(row1510));
        balance.setRow1520(new BigDecimal(row1520));
        balance.setRow1530(new BigDecimal(row1530));
        balance.setRow1540(new BigDecimal(row1540));
        balance.setRow1550(new BigDecimal(row1550));
        this.countingService.setBalance(balance).ruleSumof1500();
        Map<String, String> map = Maps.newHashMap();
        map.put("row1500", String.valueOf(balance.getRow1500()));
        return map;
    }

    @ResponseBody
    @GetMapping("/balance/calculate/row1600")
    public Map<String, ? extends Object> sum1600(@RequestParam String row1100,
                                                 @RequestParam String row1200) {
        Balance balance = new Balance();
        balance.setRow1100(new BigDecimal(row1100));
        balance.setRow1200(new BigDecimal(row1200));
        this.countingService.setBalance(balance).ruleSumof1600();
        Map<String, String> map = Maps.newHashMap();
        map.put("row1600", String.valueOf(balance.getRow1600()));
        return map;
    }

    @ResponseBody
    @GetMapping("/balance/calculate/row1700")
    public Map<String, ? extends Object> sum1700(@RequestParam String row1300,
                                                 @RequestParam String row1400,
                                                 @RequestParam String row1500) {
        Balance balance = new Balance();
        balance.setRow1300(new BigDecimal(row1300));
        balance.setRow1400(new BigDecimal(row1400));
        balance.setRow1500(new BigDecimal(row1500));
        this.countingService.setBalance(balance).ruleSumof1700();
        Map<String, String> map = Maps.newHashMap();
        map.put("row1700", String.valueOf(balance.getRow1700()));
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

    @PostMapping("/income_report/to_xml")
    public String incomeReportToXml(IncomeReport incomeReport, Model model) {

        Calendar calendar = Calendar.getInstance();

        incomeReport.setCreated(calendar.getTime());
        incomeReport.setYear(String.valueOf(calendar.get(Calendar.YEAR)));
        incomeReport.setPeriod(LocalDate
                .of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH))
                .get(IsoFields.QUARTER_OF_YEAR));
        incomeReport.incrementVersion();

        ToXMLServiceImpl.commonToXML(incomeReport, "income_report.xml");

        model.addAttribute("newIncomeReport", incomeReport);
        return "redirect:/income_report";
    }

    @PostMapping("/income_report")
    public String receiveIncomeReport(IncomeReport incomeReport) {
        return "redirect:/income_report";
    }

}
