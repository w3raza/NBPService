package zoo.NBPCurrency.model;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

public interface FeignNbpClient {

    @RequestLine("GET /tables/a/last/5")
    @Headers("Accept: application/json")
    ArrayList<Currency> getCurrency();

    @RequestLine("GET /last/14")
    @Headers("Accept: application/json")
    ArrayList<Gold> getGoldAvarage();
}
