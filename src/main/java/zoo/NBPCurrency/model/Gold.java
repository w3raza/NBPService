package zoo.NBPCurrency.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Gold {
    private  Date data;
    private Double cena;

    private Date effectiveDateStart;
    private Date effectiveDateEnd;
    private Double avarageGoldPrice;

    public Gold(Date effectiveDateStart, Date effectiveDateEnd, Double avarageGoldPrice) {
        this.effectiveDateStart = effectiveDateStart;
        this.effectiveDateEnd = effectiveDateEnd;
        this.avarageGoldPrice = avarageGoldPrice;
    }

    @Override
    public String toString() {
        return "Gold{" +
                "effectiveDateStart=" + effectiveDateStart +
                ", effectiveDateEnd=" + effectiveDateEnd +
                ", avarageGoldPrice=" + avarageGoldPrice +
                '}';
    }
}
