import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class HotelTest
{
    @Test
        public void testAddEmployeeToPayrollSystem()
    {
        //UC:1 :- Employee should added to the Payroll System.
            // Arrange
            PayrollSystem payrollSystem = new PayrollSystem();
            String empOne = "Rasia";
            String empTwo = "Pratika";
            String empThree="Ashvi";

            // Act
            payrollSystem.addEmployee(empOne);
            payrollSystem.addEmployee(empTwo);
            payrollSystem.addEmployee(empThree);

            // Assert
            ArrayList<String> employees = payrollSystem.getEmployees();
            assertEquals("Number of employees should be 3", 3, employees.size());
            assertEquals("First employee should match", empOne, employees.get(0));
            assertEquals("Second employee should match", empTwo, employees.get(1));
            assertEquals("Third employee should match:",empThree,employees.get(2));
    }
    }
