package facades;

import javax.ejb.Local;

@Local
public interface FacadeCalculatorLocal {
    
    public double add(double a, double b);
}
