package zoo.NBPCurrency.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;

@Data
@Getter
@AllArgsConstructor
public class Currency {
    private String effectiveDate;
    private ArrayList<RatesNbp> rates;
}
