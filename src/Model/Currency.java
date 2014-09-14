package Model;

import java.math.BigDecimal;

/**
 *
 * @author vivalaklask
 */
public enum Currency {

    DKK("100.00"), EUR("744.37"), GBP("934.43"), USD("575.65");

    private final BigDecimal value;

    Currency(String value) {
        this.value = new BigDecimal(value);
    }

    public BigDecimal getValue() {
        return value;
    }
}
