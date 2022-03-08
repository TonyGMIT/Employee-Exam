package ie.gmit.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    private Employee myEmployee = new Employee("Mr", "Full-time");

    @Test
    void titleTest(){
        assertEquals("Mr",myEmployee.getTitle());
    }
    @Test
    void JobTest(){
        assertEquals("Full-time",myEmployee.getEmploymentType());
    }

}
