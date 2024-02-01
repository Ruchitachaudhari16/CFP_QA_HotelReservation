import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class HotelTest
{
    @Test
        public void testAddEmployeeToPayrollSystem() {
        //UC:1 :- Employee should added to the Payroll System.
        // Arrange
        PayrollSystem payrollSystem = new PayrollSystem();
        String empOne = "Rasia";
        String empTwo = "Pratika";
        String empThree = "Ashvi";

        // Act
        payrollSystem.addEmployee(empOne);
        payrollSystem.addEmployee(empTwo);
        payrollSystem.addEmployee(empThree);

        // Assert
        ArrayList<String> employees = payrollSystem.getEmployees();
        assertEquals("Number of employees should be 2", 3, employees.size());
        assertEquals("First employee should match", empOne, employees.get(0));
        assertEquals("Second employee should match", empTwo, employees.get(1));
        assertEquals("Third employee should match:", empThree, employees.get(2));
    }

    //UC2:-To find Cheapest hotel for given date range
    @Test
        public void testFindCheapestHotel() {
        // Arrange
        HotelReservation reservationSystem = new HotelReservation();
        reservationSystem.addHotel("Lakewood", 100.0);
        reservationSystem.addHotel("Bridgewood", 150.0);
        reservationSystem.addHotel("Ridgewood", 200.0);

        LocalDate startDate = LocalDate.parse("2020-09-10", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate endDate = LocalDate.parse("2020-09-11", DateTimeFormatter.ISO_LOCAL_DATE);

        // Act
        String result = reservationSystem.findCheapestHotel(startDate, endDate);

    }
    }
