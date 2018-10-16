
package f18comp1008oct16;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JWright
 */
public class CircleTest {
    
    Circle validCircle;
    
    public CircleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        validCircle = new Circle(10);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRadius method, of class Circle.
     */
    @Test
    public void testGetRadius() {
        double expResult = 10;
        double result = validCircle.getRadius();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setRadius method, of class Circle.
     */
    @Test
    public void testSetRadiusInvalid() {
        try{
            validCircle.setRadius(-10);
            fail("negative radius should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            
        }
    }

    /**
     * Test of getArea method, of class Circle.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Circle instance = null;
        double expResult = 0.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Circle.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Circle instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
