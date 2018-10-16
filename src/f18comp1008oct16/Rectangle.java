package f18comp1008oct16;

/**
 *
 * @author JWright
 */
public class Rectangle extends TwoDimensionalShape{
    //define the instance variables
    private double length, width;
    
    //create a constructor
    //the goal of the constructor is to allocate memory
    //for our Rectangle object
    public Rectangle(double length, double width)
    {
        setLength(length);
        setWidth(width);
    }
    
    //create get/set methods by right clicking and 
    //selecting insert code
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0)
            this.length = length;
        else
            throw new IllegalArgumentException("length must be greater than 0");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else
            throw new IllegalArgumentException("width must be greater than 0");    
    }
    
    /**
     * The getArea method will return the area of the rectangle
     */
    public double getArea()
    {
        return length*width;
    }
    
    /**
     * The toString method returns a String with the format
     * "[width] x [length] rectangle" 
     */
    public String toString()
    {
        return String.format("%.1f x %.1f rectangle", width, length);
    }
}

