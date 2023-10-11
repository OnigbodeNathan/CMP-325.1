package test;

import org.junit.*;
import test.Maths;

public class MathsTest {
    Maths maths;
    @Before
    public void setUpInstance(){
        maths = new Maths();
    }
    @Test
    public void checkTheSumOfTwoNumbersEqualsThree(){
        Assert.assertEquals(3,maths.addTwoNumbers(9,7));
    }

    @Test
    public void checkTheSumOfTwoNumbersEqualsThreeAgain(){
        Assert.assertEquals(0,maths.addTwoNumbers(10,6));
    }
    @Test
    public void checkIfANumberIsPrime(){
        Assert.assertTrue("true", maths.primeNumbers(5));
    }

}
