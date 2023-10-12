package test;

import Unit.Fib;
import org.junit.*;

public class FibTest {
    Fib fib;
    @Before
    public void setUpInstance(){
        fib = new Fib();
    }
    @Test
    public void fibonacciTest(){
        Assert.assertEquals(34,fib.Fibo(10));
    }

}
