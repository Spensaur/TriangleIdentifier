
import com.spencer.InvalidArgumentsException;
import com.spencer.InvalidTriangleSidesException;
import com.spencer.Strings;
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
    String[] hexThree = {"%040x", "%040x", "%040x"};

    String[] threeArgsInt = {"3", "4", "5"};
    String[] fourArgsInt = {"6", "7", "8", "9"};
    String[] twoArgsInt = {"3", "4"};

    String[] threeArgsDouble = {"3.45", "4.76", "5.57"};
    String[] fourArgsDouble = {"6.00", "7.56", "8.99", "9.34"};
    String[] twoArgsDouble = {"3.46", "4.00"};

    String[] triangleIntEquilateral3 = {"999e999999999999999999999999999999999999999999", "999e999999999999999999999999999999999999999999", "999e999999999999999999999999999999999999999999"};


    @Test(expected = InvalidArgumentsException.class)
    public void hasThreeArgsTestZeroArgs() throws InvalidArgumentsException {
        TriangleIdentifier.hasThreeArgs(zeroArgs);
    }

    @Test(expected = InvalidArgumentsException.class)
    public void hasThreeArgsTestFourArgsInt() throws InvalidArgumentsException {
        TriangleIdentifier.hasThreeArgs(fourArgsInt);
    }

    @Test(expected = InvalidArgumentsException.class)
    public void hasThreeArgsTestTwoArgsDouble() throws InvalidArgumentsException {
        TriangleIdentifier.hasThreeArgs(twoArgsDouble);
    }

    @Test(expected = InvalidArgumentsException.class)
    public void hasThreeArgsTestFourArgsDouble() throws InvalidArgumentsException {
        TriangleIdentifier.hasThreeArgs(fourArgsDouble);
    }

    @Test(expected = InvalidArgumentsException.class)
    public void hasValidArgsTestZeroArgs() throws InvalidArgumentsException {
        TriangleIdentifier.hasValidArgs(threeArgs);
    }

    @Test(expected = InvalidArgumentsException.class)
    public void hasValidArgsTestFourArgsInt() throws InvalidArgumentsException {
        TriangleIdentifier.hasValidArgs(fourArgs);
    }

    @Test(expected = InvalidArgumentsException.class)
    public void hasValidArgsTestTwoArgsDouble() throws InvalidArgumentsException {
        TriangleIdentifier.hasValidArgs(twoArgs);
    }


    @Test
    public void hasThreeArgsTest() {
        try {
            TriangleIdentifier.hasThreeArgs(threeArgs);
        } catch (Exception e) {
            Assert.fail(Strings.exceptionTestString);
        }
        try {
            TriangleIdentifier.hasThreeArgs(threeArgsDouble);
        } catch (Exception e) {
            Assert.fail(Strings.exceptionTestString);
        }
        try {
            TriangleIdentifier.hasThreeArgs(hexThree);
        } catch (Exception e) {
            Assert.fail(Strings.exceptionTestString);
        }

        try {
            TriangleIdentifier.hasThreeArgs(triangleIntEquilateral3);
        } catch (Exception e) {
            Assert.fail(Strings.exceptionTestString);
        }
    }

    @Test
    public void hasValidArgsTest() {
        try {
            TriangleIdentifier.hasValidArgs(zeroArgs);
        } catch (Exception e) {
            Assert.fail(Strings.exceptionTestString);
        }
        try {
            TriangleIdentifier.hasValidArgs(twoArgsInt);
        } catch (Exception e) {
            Assert.fail(Strings.exceptionTestString);
        }
        try {
            TriangleIdentifier.hasValidArgs(fourArgsInt);
        } catch (Exception e) {
            Assert.fail(Strings.exceptionTestString);
        }
        try {
            TriangleIdentifier.hasValidArgs(threeArgsInt);
        } catch (Exception e) {
            Assert.fail(Strings.exceptionTestString);
        }
        try {
            TriangleIdentifier.hasValidArgs(twoArgsDouble);
        } catch (Exception e) {
            Assert.fail(Strings.exceptionTestString);
        }
        try {
            TriangleIdentifier.hasValidArgs(fourArgsDouble);
        } catch (Exception e) {
            Assert.fail(Strings.exceptionTestString);
        }
        try {
            TriangleIdentifier.hasValidArgs(threeArgsDouble);
        } catch (Exception e) {
            Assert.fail(Strings.exceptionTestString);
        }
        try {
            TriangleIdentifier.hasValidArgs(triangleIntEquilateral3);
        } catch (Exception e) {
            Assert.fail(Strings.exceptionTestString);
        }
    }
}

