package zoo.NBPCurrency.model;

import lombok.Data;

import java.util.List;

@Data
public class Currency {
    private String currency;
    private String code;
    private List<RatesNbp> rates;
}
