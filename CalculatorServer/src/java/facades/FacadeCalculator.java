package facades;

import javax.ejb.Stateless;
import logic.Calculator;

@Stateless
public class FacadeCalculator implements FacadeCalculatorLocal {

    @Override
    public double add(double a, double b) {
        return Calculator.add(a, b);
    }
}
