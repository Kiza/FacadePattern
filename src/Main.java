
import myPackage.MyFacade;
import myPackage.impl.SomeInterfaceAnotherImpl;
import myPackage.interf.SomeInterface;

/**
 *
 * @author kiza
 */
public class Main
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // create facade object
        MyFacade facade = new MyFacade();
        
        // create a new object for implementation of interface 
        SomeInterface anotherInterf = new SomeInterfaceAnotherImpl();
        
        // set a new implementation of interface for facade
        facade.setInterf(anotherInterf);
        
        // do the action
        facade.someFunction();
    }
}
