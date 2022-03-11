package zoo.NBPCurrency.model;

import feign.Headers;
import feign.RequestLine;

import java.util.ArrayList;

public interface FeignNbpClient {
    @RequestLine("GET /rates/a/usd")
    @Headers("Accept: application/json")
    Currency getUsdCurrency();

    @RequestLine("GET /rates/a/eur")
    @Headers("Accept: application/json")
    Currency getEurCurrency();

    @RequestLine("GET /last/14")
    @Headers("Accept: application/json")
    ArrayList<Gold> getGoldAvarage();
}
