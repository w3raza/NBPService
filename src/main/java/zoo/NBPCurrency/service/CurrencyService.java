package zoo.NBPCurrency.service;

import feign.Feign;
import feign.gson.GsonDecoder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import zoo.NBPCurrency.model.Currency;
import zoo.NBPCurrency.model.FeignNbpClient;
import zoo.NBPCurrency.model.RatesNbp;

import java.util.ArrayList;

@Service
@AllArgsConstructor
public class CurrencyService {
    private final String NBP_URL = "http://api.nbp.pl/api/exchangerates";

    public ArrayList<Currency> getCurrencyFromNbp(String currencyCode) {
        var feignClient = getFeignNbpClient();

        ArrayList<Currency> listOfLastFiveDay = feignClient.getCurrency();

        ArrayList<Currency> listCurrency= new ArrayList<>();

        for (Currency currency : listOfLastFiveDay) {
            ArrayList<RatesNbp> newOne = new ArrayList<>();
            for (var el : currency.getRates()) {
                if (el.getCode().equals(currencyCode)) {
                    newOne.add(el);
                    listCurrency.add(new Currency(currency.getEffectiveDate(), newOne));
                }
            }
        }

        return listCurrency;
    }

    private FeignNbpClient getFeignNbpClient() {
        return Feign.builder()
                .decoder(new GsonDecoder())
                .target(FeignNbpClient.class, NBP_URL);
    }
}
