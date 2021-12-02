package unit_test;

import Calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest extends BaseTest{

    private Calculator calculator = new Calculator();

    private final double FIRST_NUM = 10;
    private final double SECOND_NUM = 5;

    @Test(priority = 2)
    public void checkAdd(){
        double expectedResult = FIRST_NUM + SECOND_NUM;
        double actualResult = calculator.add(FIRST_NUM,SECOND_NUM);

        Assert.assertEquals(actualResult,expectedResult,"Result is not corrected for adding");
    }

    @Test(priority = 1)
    public void checkSecondMult(){
        double expectedResult = FIRST_NUM * SECOND_NUM;
        double actualResult = calculator.errorMult(FIRST_NUM,SECOND_NUM);

        Assert.assertEquals(actualResult,expectedResult,"Result is not corrected for mult");
    }
}
