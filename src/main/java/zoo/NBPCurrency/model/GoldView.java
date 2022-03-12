package zoo.NBPCurrency.model;

import lombok.Data;

@Data
public class GoldView {
    private String effectiveDateStart;
    private String effectiveDateEnd;
    private Double avarageGoldPrice;

    public GoldView(String effectiveDateStart, String effectiveDateEnd, Double avarageGoldPrice) {
        this.effectiveDateStart = effectiveDateStart;
        this.effectiveDateEnd = effectiveDateEnd;
        this.avarageGoldPrice = avarageGoldPrice;
    }
}
