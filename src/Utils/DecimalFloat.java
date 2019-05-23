package Utils;

import java.math.BigDecimal;

public class DecimalFloat {

    public DecimalFloat() {
    }


     public float round(float number, int decimalPlace) {
        BigDecimal bd = new BigDecimal(number);
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }

}
