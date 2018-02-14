package sample.data.jpa.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("fields", Fields.asList());
        return "form";
    }

//    @RequestMapping("product/{id}")
//    public String showProduct(@PathVariable Integer id, Model model){
//        model.addAttribute("product", productService.getProductById(id));
//        return "productshow";
//    }
//
//    @RequestMapping("product/edit/{id}")
//    public String edit(@PathVariable Integer id, Model model){
//        model.addAttribute("product", productService.getProductById(id));
//        return "productform";
//    }
//
//    @RequestMapping("product/new")
//    public String newProduct(Model model){
//        model.addAttribute("product", new Product());
//        return "productform";
//    }
//
//    @RequestMapping(value = "product", method = RequestMethod.POST)
//    public String saveProduct(Product product){
//        productService.saveProduct(product);
//        return "redirect:/product/" + product.getId();
//    }
//
//    @RequestMapping("product/delete/{id}")
//    public String delete(@PathVariable Integer id){
//        productService.deleteProduct(id);
//        return "redirect:/products";
//    }

}
