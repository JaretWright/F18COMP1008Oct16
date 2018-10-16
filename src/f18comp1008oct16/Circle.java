
package f18comp1008oct16;

/**
 *
 * @author JWright
 */
public class Circle extends TwoDimensionalShape{
    
    //step 1 - define the instance variables
    private double radius;
    
    //step 2 - make a constructor that sets the instance
    //variables with valid inputs
    public Circle(double radius) {
        setRadius(radius);
    }
    
    //step 3 - create the get/set methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("radius must be greater than 0");
    }
    
    /**
     * This method returns the area of the circle as a double
     */
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    
    /**
     * This will return a String in the form of "circle with radius [x]"
     */
    public String toString()
    {
        return "circle with radius " + radius;
    }
}
