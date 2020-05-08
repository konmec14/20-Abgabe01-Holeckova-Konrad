package at.fhj.iit;

/**
 * Class inherits from Class Exception
 * Will be thrown in Class Longdrink constructor if Longdrink does not contain alcohol
 *
 * @author Melinda Konrad, Lydia Holeckova
 */
public class ZeroPercentAlcoholException extends Exception{
    /**
     * When Exception is thrown, constructor will be called and thus
     * the super Exception Class will be called
     */
    public ZeroPercentAlcoholException(){
        super();
    }
}
