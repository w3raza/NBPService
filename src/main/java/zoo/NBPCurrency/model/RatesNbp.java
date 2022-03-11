package zoo.NBPCurrency.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class RatesNbp {
    private Date effectiveDate;
    private BigDecimal mid;
}

