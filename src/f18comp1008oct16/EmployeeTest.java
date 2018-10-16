package f18comp1008oct16;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author JWright
 */
public class EmployeeTest {
    public static void main(String[] args)
    {
        Employee empl1 = new Employee("Fred", "Flintstone", 
                                      LocalDate.of(2000, Month.MARCH, 10),
                                      1);
        Employee empl2 = new Employee("Barney","Rubble", 
                                      LocalDate.of(2001, Month.DECEMBER, 1), 2);
        System.out.println(empl1);
        System.out.println(empl2);
        
    }
}
