import com.spencer.InvalidArgumentsException;
import com.spencer.InvalidTriangleSidesException;
import com.spencer.Triangle;
import com.spencer.TriangleIdentifier;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by spank on 9/13/16.
 */
public class TriangleTest {


    static Triangle equilateralInt;
    static Triangle equilateralDouble1;
    static Triangle equilateralDouble2;

    static Triangle isoscelesInt;
    static Triangle isoscelesDouble1;
    static Triangle isoscelesDouble2;

    static Triangle scaleneInt;
    static Triangle scaleneDouble1;
    static Triangle scaleneDouble2;

    Triangle triangleExceptionZero;
    Triangle triangleExceptionNegative;
    Triangle triangleExceptionLarge;
    Triangle triangleExceptionIlligalSide;

    static {
        try {
            equilateralInt = new Triangle(5, 5, 5);
            equilateralDouble1 = new Triangle(5.55, 5.55, 5.55);
            equilateralDouble2 = new Triangle(.05, .05, .05);

            isoscelesInt = new Triangle(4, 5, 5);
            isoscelesDouble1 = new Triangle(4.55, 4.55, 5.55);
            isoscelesDouble2 = new Triangle(.04, .04, .05);

            scaleneInt = new Triangle(4, 5, 6);
            scaleneDouble1 = new Triangle(5.55, 5.56, 5.57);
            scaleneDouble2 = new Triangle(.02, .03, .04);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(expected = InvalidTriangleSidesException.class)
    public void triangleExceptionZeroTest() throws InvalidTriangleSidesException {
        triangleExceptionZero = new Triangle(0, 3, 3);
    }

    @Test(expected = InvalidTriangleSidesException.class)
    public void triangleExceptionNegativeTest() throws InvalidTriangleSidesException {
        triangleExceptionNegative = new Triangle(-1, 5, 5);
    }

    @Test(expected = InvalidTriangleSidesException.class)
    public void triangleExceptionIlligalSideTest() throws InvalidTriangleSidesException {
        triangleExceptionIlligalSide = new Triangle(1, 2, 3);
    }

    @Test(expected = InvalidTriangleSidesException.class)
    public void triangleExceptionLargeTest() throws InvalidTriangleSidesException {
        Double largeNum = Double.parseDouble("9e9999999999999999999999999999999999999999999999999999999999999999999999999999999999");
        System.out.println(largeNum);
        triangleExceptionLarge = new Triangle(largeNum, largeNum, largeNum);
    }

    @Test
    public void determineTriangleTypeTest(){
        Assert.assertEquals(Triangle.TriangleType.EQUILATERAL, equilateralInt.getTriangleType());
        Assert.assertEquals(Triangle.TriangleType.EQUILATERAL, equilateralDouble1.getTriangleType());
        Assert.assertEquals(Triangle.TriangleType.EQUILATERAL, equilateralDouble2.getTriangleType());

        Assert.assertEquals(Triangle.TriangleType.ISOSCELES, isoscelesInt.getTriangleType());
        Assert.assertEquals(Triangle.TriangleType.ISOSCELES, isoscelesDouble1.getTriangleType());
        Assert.assertEquals(Triangle.TriangleType.ISOSCELES, isoscelesDouble2.getTriangleType());

        Assert.assertEquals(Triangle.TriangleType.SCALENE, scaleneInt.getTriangleType());
        Assert.assertEquals(Triangle.TriangleType.SCALENE, scaleneDouble1.getTriangleType());
        Assert.assertEquals(Triangle.TriangleType.SCALENE, scaleneDouble2.getTriangleType());
    }

}
