package f18comp1008oct16;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author JWright
 */
public class Employee {
    
    //Step 1 - define the instance variables
    private String firstName, lastName;
    private LocalDate dateOfBirth;
    private int employeeNum;
    
    //Step 2 - build the constructor
    public Employee(String firstName, String lastName, LocalDate dateOfBirth, int employeeNum) {
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setEmployeeNum(employeeNum);
    }
    
    //Step 3 - get/set methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (validateName(firstName))
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("Names must start with upper case letters");
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * This ensures that a String starts with an 
     * upper case letter
     * @param name
     * @return 
     */
    public boolean validateName(String name)
    {
        return (name.matches("[A-Z][a-z]*"));
    }
    
    
    public void setLastName(String lastName) {
        if (validateName(lastName))
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("last name must start with "
                    + "                             an upper case letter");
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        int age = Period.between(dateOfBirth, LocalDate.now() ).getYears();
        if (age >= 13 && age <= 70)
            this.dateOfBirth = dateOfBirth;
        else
            throw new IllegalArgumentException("Age must be 13 to 70");
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        if (employeeNum > 0)
            this.employeeNum = employeeNum;
        else
            throw new IllegalArgumentException("Employee number must be greater than 0");
    }   
    
    @Override
    public String toString()
    {
        return String.format("employee #: %d is %s %s", employeeNum,
                                                        firstName, lastName);
    }
}
