package com.skaari;

public enum Brand {
    BRAND1(1), BRAND2(2), BRAND3(3), BRAND4(2), BRAND5(3), BRAND6(1);
    private int costMultiplierByBrand;



    Brand(int costMultiplierByBrand) {
        this.costMultiplierByBrand = costMultiplierByBrand;
    }

    public int getCostMultiplierByBrand() {
        return costMultiplierByBrand;
    }

    public boolean worthBuying() {
        switch (this) {
            case BRAND1:
                return true;
            case BRAND2:
                return true;
            case BRAND3:
                return false;
            case BRAND4:
                return true;
            case BRAND5:
                return false;
            case BRAND6:
                return true;
            default:
                return false;
        }
    }
}
