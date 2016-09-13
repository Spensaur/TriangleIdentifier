import com.spencer.Triangle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by spank on 9/13/16.
 */
public class TriangleTest {

    Triangle equilateralInt = new Triangle(5, 5, 5);
    Triangle equilateralDouble1 = new Triangle(5.55, 5.55, 5.55);
    Triangle equilateralDouble2 = new Triangle(.05, .05, .05);

    Triangle isoscelesInt = new Triangle(4, 5, 5);
    Triangle isoscelesDouble1 = new Triangle(4.55, 4.55, 5.55);
    Triangle isoscelesDouble2 = new Triangle(.04, .04, .05);

    Triangle scaleneInt = new Triangle(4, 5, 6);
    Triangle scaleneDouble1 = new Triangle(5.55, 5.56, 5.57);
    Triangle scaleneDouble2 = new Triangle(.02, .03, .04);

    @Test
    public void determineTriangleTypeTest(){
        Assert.assertEquals("equilateral", equilateralInt.getTriangleType());
        Assert.assertEquals("equilateral", equilateralDouble1.getTriangleType());
        Assert.assertEquals("equilateral", equilateralDouble2.getTriangleType());

        Assert.assertEquals("isosceles", isoscelesInt.getTriangleType());
        Assert.assertEquals("isosceles", isoscelesDouble1.getTriangleType());
        Assert.assertEquals("isosceles", isoscelesDouble2.getTriangleType());

        Assert.assertEquals("scalene", scaleneInt.getTriangleType());
        Assert.assertEquals("scalene", scaleneDouble1.getTriangleType());
        Assert.assertEquals("scalene", scaleneDouble2.getTriangleType());
    }
}
