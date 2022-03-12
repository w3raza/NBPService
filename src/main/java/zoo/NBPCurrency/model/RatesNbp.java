package zoo.NBPCurrency.model;

import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Data
public class RatesNbp {
    private String currency;
    private String code;
    private BigDecimal mid;
}

