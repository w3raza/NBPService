package zoo.NBPCurrency.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zoo.NBPCurrency.model.Currency;
import zoo.NBPCurrency.model.GoldView;
import zoo.NBPCurrency.service.CurrencyService;
import zoo.NBPCurrency.service.GoldAvarageService;

import java.util.ArrayList;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class CurrencyController {
    private final CurrencyService currencyService;
    private final GoldAvarageService goldAvarageService;

    @GetMapping("/exchange-rates/{currencyCode}")
    public ArrayList<Currency> getCurrencyFor(@PathVariable String currencyCode)  {
        return currencyService.getCurrencyFromNbp(currencyCode);
    }

    @GetMapping("/gold-price/avarage")
    public GoldView getAvaragePrice() {
        return goldAvarageService.getAvarageGoldPrice();
    }
}
