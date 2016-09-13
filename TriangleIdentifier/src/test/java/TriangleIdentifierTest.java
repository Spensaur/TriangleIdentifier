
import com.spencer.TriangleIdentifier;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by spank on 9/12/16.
 */
/**
 * Created by spank on 9/12/16.
 */
public class TriangleIdentifierTest {
    String[] threeArgs = {"grag", "eage", "ino4"};
    String[] fourArgs = {"grag", "eage", "ino4", "egae"};
    String[] twoArgs = {"grag", "eage"};
    String[] zeroArgs = {};

    String[] threeArgsInt = {"3", "4", "5"};
    String[] fourArgsInt = {"6", "7", "8", "9"};
    String[] twoArgsInt = {"3", "4"};

    String[] threeArgsDouble = {"3.45", "4.76", "5.57"};
    String[] fourArgsDouble = {"6.00", "7.56", "8.99", "9.34"};
    String[] twoArgsDouble = {"3.46", "4.00"};

    String[] triangleIntScalene1 = {"3", "4", "5"};
    String[] triangleIntIsosceles1 = {"4", "4", "5"};
    String[] triangleIntEquilateral1 = {"4", "4", "4"};
    String[] triangleFalse1 = {"4", "4", "10"};

    String[] triangleIntScalene2 = {"3", "4", "5"};
    String[] triangleIntIsosceles2 = {"4", "4", "5"};
    String[] triangleIntEquilateral2 = {"4", "4", "4"};
    String[] triangleFalse2 = {"10", "4", "3"};

    String[] triangleIntScalene3 = {"3", "4", "5"};
    String[] triangleIntIsosceles3 = {"4", "4", "5"};
    String[] triangleIntEquilateral3 = {"999e999999999999999999999999999999999999999999", "999e999999999999999999999999999999999999999999", "999e999999999999999999999999999999999999999999"};
    String[] triangleFalse3 = {"0", "0", "0"};

    String[] triangleDoubleScalene1 = {"3.64", "4.77", "5.54"};
    String[] triangleDoubleIsosceles1 = {"4.65", "4.65", "5"};
    String[] triangleDoubleEquilateral1 = {"4.44", "4.44", "4.44"};
    String[] triangleDoubleFalse1 = {"4.34", "4.12", "10.67"};

    String[] triangleDoubleScalene2 = {"3", "4", "5"};
    String[] triangleDoubleIsosceles2 = {"4.64", "4.65", "5"};
    String[] triangleDoubleEquilateral2 = {"4.55", "4.55", "4.55"};
    String[] triangleDoubleFalse2 = {"0.00", "0.00", "10.0"};

    String[] triangleDoubleScalene3 = {".03", ".04", ".05"};
    String[] triangleDoubleIsosceles3 = {".04", ".04", ".05"};
    String[] triangleDoubleEquilateral3 = {".0400", ".0400", ".0400"};
    String[] triangleDoubleFalse3 = {".00", ".0", ".00"};

    String[] triangleDoubleFalse4 = {".01", ".01", ".9"};

    String[] triangleDoubleScaleneNeg = {"-.03", "-.04", "-.05"};
    String[] triangleDoubleIsoscelesNeg = {"-.04", "-.04", "-.05"};
    String[] triangleDoubleEquilateralNeg = {"-.0400", "-.0400", "-.0400"};
    String[] triangleDoubleFalseNeg = {"-.00", "-.0", "-.00"};

    String[] triangleIntScaleneNeg = {"-3", "-4", "-5"};
    String[] triangleIntIsoscelesNeg = {"-4", "-4", "-5"};
    String[] triangleIntEquilateralNeg = {"-4", "-4", "-4"};
    String[] triangleFalseNeg = {"-4", "-4", "-10"};

    @Test
    public void hasThreeArgsTest() {
        try {
            Assert.assertFalse(TriangleIdentifier.hasThreeArgs(zeroArgs));
        } catch (Exception e){

        }
        try {
            Assert.assertFalse(TriangleIdentifier.hasThreeArgs(twoArgs));
        } catch ( Exception e){

        }
        try {
            Assert.assertFalse(TriangleIdentifier.hasThreeArgs(fourArgs));
        } catch (Exception e){

        }
        try {
            Assert.assertTrue(TriangleIdentifier.hasThreeArgs(threeArgs));
        } catch (Exception e){

        }
        try {
            Assert.assertFalse(TriangleIdentifier.hasThreeArgs(twoArgsInt));
        } catch (Exception e){

        }

        try {
            Assert.assertFalse(TriangleIdentifier.hasThreeArgs(fourArgsInt));
        } catch (Exception e){

        }
        try {
            Assert.assertTrue(TriangleIdentifier.hasThreeArgs(threeArgsInt));
        } catch (Exception e){

        }

        try {
            Assert.assertFalse(TriangleIdentifier.hasThreeArgs(twoArgsDouble));
        } catch (Exception e){

        }
        try {
            Assert.assertFalse(TriangleIdentifier.hasThreeArgs(fourArgsDouble));
        } catch (Exception e){

        }
        try {
            Assert.assertTrue(TriangleIdentifier.hasThreeArgs(threeArgsDouble));
        } catch (Exception e){

        }
    }

    @Test
    public void hasValidArgsTest(){
        try {
            Assert.assertTrue(TriangleIdentifier.hasValidArgs(zeroArgs));
        } catch (Exception e){

        }
        try {
            Assert.assertFalse(TriangleIdentifier.hasValidArgs(twoArgs));
        } catch (Exception e){

        }
        try {
            Assert.assertFalse(TriangleIdentifier.hasValidArgs(fourArgs));
        } catch (Exception e){

        }
        try {
            Assert.assertFalse(TriangleIdentifier.hasValidArgs(threeArgs));
        } catch (Exception e){

        }
        try {
            Assert.assertTrue(TriangleIdentifier.hasValidArgs(twoArgsInt));
        } catch (Exception e){

        }
        try {
            Assert.assertTrue(TriangleIdentifier.hasValidArgs(fourArgsInt));
        } catch (Exception e){

        }
        try {
            Assert.assertTrue(TriangleIdentifier.hasValidArgs(threeArgsInt));
        } catch (Exception e){

        }
        try {
            Assert.assertTrue(TriangleIdentifier.hasValidArgs(twoArgsDouble));
        } catch (Exception e){

        }
        try {
            Assert.assertTrue(TriangleIdentifier.hasValidArgs(fourArgsDouble));
        } catch (Exception e){

        }
        try {
            Assert.assertTrue(TriangleIdentifier.hasValidArgs(threeArgsDouble));
        } catch (Exception e){

        }
    }

//    @Test
//    public void isTriangleTest(){
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleIntEquilateral1));
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleIntIsosceles1));
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleIntScalene1));
//        Assert.assertFalse(TriangleIdentifier.isTriangle(triangleFalse1));
//
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleIntEquilateral2));
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleIntIsosceles2));
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleIntScalene2));
//        Assert.assertFalse(TriangleIdentifier.isTriangle(triangleFalse2));
//
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleIntEquilateral3));
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleIntIsosceles3));
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleIntScalene3));
//        Assert.assertFalse(TriangleIdentifier.isTriangle(triangleFalse3));
//
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleDoubleEquilateral1));
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleDoubleIsosceles1));
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleDoubleScalene1));
//        Assert.assertFalse(TriangleIdentifier.isTriangle(triangleDoubleFalse1));
//
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleDoubleEquilateral2));
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleDoubleIsosceles2));
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleDoubleScalene2));
//        Assert.assertFalse(TriangleIdentifier.isTriangle(triangleDoubleFalse2));
//
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleDoubleEquilateral3));
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleDoubleIsosceles3));
//        Assert.assertTrue(TriangleIdentifier.isTriangle(triangleDoubleScalene3));
//        Assert.assertFalse(TriangleIdentifier.isTriangle(triangleDoubleFalse3));
//
//        Assert.assertFalse(TriangleIdentifier.isTriangle(triangleDoubleFalse4));
//    }

    @Test
    public void isValidInputTest(){
        try {
            Assert.assertFalse(TriangleIdentifier.isValidInput(zeroArgs));
        } catch (Exception e){

        }
        try {
            Assert.assertFalse(TriangleIdentifier.isValidInput(twoArgs));
        } catch (Exception e){

        }
        try {
            Assert.assertFalse(TriangleIdentifier.isValidInput(fourArgs));
        } catch (Exception e){

        }
        try {
            Assert.assertFalse(TriangleIdentifier.isValidInput(threeArgs));
        } catch (Exception e){

        }
        try {
            Assert.assertFalse(TriangleIdentifier.isValidInput(twoArgsInt));
        } catch (Exception e){

        }
        try {
            Assert.assertFalse(TriangleIdentifier.isValidInput(fourArgsInt));
        } catch (Exception e){

        }
        try {
            Assert.assertTrue(TriangleIdentifier.isValidInput(threeArgsInt));
        } catch (Exception e){

        }
        try {
            Assert.assertFalse(TriangleIdentifier.isValidInput(twoArgsDouble));
        } catch (Exception e){

        }
        try {
            Assert.assertFalse(TriangleIdentifier.isValidInput(fourArgsDouble));
        } catch (Exception e){

        }
        try {
            Assert.assertTrue(TriangleIdentifier.isValidInput(threeArgsDouble));
        } catch (Exception e){

        }

        try {
            Assert.assertTrue(TriangleIdentifier.isValidInput(triangleIntEquilateral1));
        } catch (Exception e){

        }
        try {
            Assert.assertTrue(TriangleIdentifier.isValidInput(triangleIntIsosceles1));
        } catch (Exception e){

        }
    }

}
