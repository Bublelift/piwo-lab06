package pwo.seq;

import java.math.BigDecimal;

/**
 * Mocium panie, wziąć w sposobie
 * @author kleszko1
 */
public class LucasGenerator extends FibonacciGenerator {
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
 }
}
