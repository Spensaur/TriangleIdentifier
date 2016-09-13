import com.spencer.InvalidArgumentsException;
import com.spencer.InvalidTriangleSidesException;
import com.spencer.Triangle;
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

    @Test
    public void isTriangleTest1(){
        try {
            Triangle notATriangle1 = new Triangle(0, 3, 5);
        } catch (Exception e){
            Assert.assertTrue(e.getClass() == InvalidTriangleSidesException.class);
        }

        try {
            Triangle notATriangle1 = new Triangle(-1, 3, 5);
        } catch (Exception e){
            Assert.assertTrue(e.getClass() == InvalidTriangleSidesException.class);
        }

        try {
            Triangle notATriangle1 = new Triangle(1, 2, 3);
        } catch (Exception e){
            Assert.assertTrue(e.getClass() == InvalidTriangleSidesException.class);
        }

        try {
            Triangle notATriangle1 = new Triangle(0.01, 2, 5);
        } catch (Exception e){
            Assert.assertTrue(e.getClass() == InvalidTriangleSidesException.class);
        }
    }
}
