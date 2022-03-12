package zoo.NBPCurrency.service;

import feign.Feign;
import feign.gson.GsonDecoder;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import zoo.NBPCurrency.model.FeignNbpClient;
import zoo.NBPCurrency.model.Gold;
import zoo.NBPCurrency.model.GoldView;

import java.util.List;

@Service
@AllArgsConstructor
public class GoldAvarageService {
    private final String NBP_URL = "http://api.nbp.pl/api/cenyzlota";

    public GoldView getAvarageGoldPrice() {
        var feignClient = getFeignNbpClient();
        List<Gold> goldList = feignClient.getGoldAvarage();
        System.out.println(goldList);

        return new GoldView(goldList.get(0).getData(), goldList.get(goldList.size()-1).getData(),goldList.stream()
                .mapToDouble(Gold::getCena)
                .average()
                .orElse(0.0));
    }

    private FeignNbpClient getFeignNbpClient() {
        return Feign.builder()
                .decoder(new GsonDecoder())
                .target(FeignNbpClient.class, NBP_URL);
    }
}
