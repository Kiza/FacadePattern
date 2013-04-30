/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import myPackage.impl.SomeInterfaceImpl;
import myPackage.interf.SomeInterface;

/**
 *
 * The entry point and only entry point to your package
 * 
 */
public class MyFacade
{
    /**
     *  using  adapter pattern
     *  default implementation of interface 
     */
    private SomeInterface interf = new SomeInterfaceImpl();
    
    /**
     * using  adapter pattern
     * Allow the user of your package to choose the implementation of interface 
     * 
     */
    public void setInterf(SomeInterface interf)
    {
        this.interf = interf;
    }
    
    /**
     *  the function will be called by the user of your package
     */
    public void someFunction()
    {
        this.interf.foo_1();
        this.interf.foo_2();
        this.interf.foo_3();
    }
}
