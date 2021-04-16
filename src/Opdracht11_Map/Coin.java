package Opdracht11_Map;

import java.math.BigDecimal;

public enum Coin {
    ONECENT(0.01),
    TWOCENT(0.02),
    FIVECENT(0.05),
    TENCENT(0.1);


    double v;

    Coin(double v) {
        this.v = v;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }
}
