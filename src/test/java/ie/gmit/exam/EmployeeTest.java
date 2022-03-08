package ie.gmit.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    private Employee myEmployee;

    @Test
    void titleTest(){
        myEmployee = new Employee("Mr");
        assertEquals("Mr",myEmployee.getTitle());
    }

}
