package services;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import facades.FacadeCalculatorLocal;

@WebService(serviceName = "WSCalculator")
@Stateless()
public class WSCalculator {

    @EJB
    private FacadeCalculatorLocal facadeCalculatorReference;

    @WebMethod(operationName = "add")
    public double add(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        System.out.println("Recieved: " + a + " , " + b + " to add");
        return facadeCalculatorReference.add(a, b);
    }
    
}
