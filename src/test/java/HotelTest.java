import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class HotelTest {

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
   /* @Test
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
    }*/

   //UC 3
    @Test
    public void testSetWeekdayAndWeekendRates() {
        // Arrange
        HotelReservation reservationSystem = new HotelReservation();
        reservationSystem.addHotel("Lakewood", 100.0, 0, 0);
        reservationSystem.addHotel("Bridgewood", 150.0, 0, 0);
        reservationSystem.addHotel("Ridgewood", 200.0, 0, 0);

        // Act
        Hotel lakewood = reservationSystem.getHotels().get(0);
        lakewood.setWeekdayRate(110.0);
        lakewood.setWeekendRate(90.0);

        Hotel bridgewood = reservationSystem.getHotels().get(1);
        bridgewood.setWeekdayRate(150.0);
        bridgewood.setWeekendRate(50.0);

        Hotel ridgewood = reservationSystem.getHotels().get(2);
        ridgewood.setWeekdayRate(220.0);
        ridgewood.setWeekendRate(150.0);

        // Assert
        assertEquals(110.0, lakewood.getWeekdayRate(), 0.01);
        assertEquals(90.0, lakewood.getWeekendRate(), 0.01);

        assertEquals(150.0, bridgewood.getWeekdayRate(), 0.01);
        assertEquals(50.0, bridgewood.getWeekendRate(), 0.01);

        assertEquals(220.0, ridgewood.getWeekdayRate(), 0.01);
        assertEquals(150.0, ridgewood.getWeekendRate(), 0.01);
    }

    //UC 5
    @Test
    public void testSetRatings() {
        // Arrange
        HotelReservation reservationSystem = new HotelReservation();
        reservationSystem.addHotel("Lakewood", 100.0, 110.0, 90.0);
        reservationSystem.addHotel("Bridgewood", 150.0, 150.0, 50.0);
        reservationSystem.addHotel("Ridgewood", 200.0, 220.0, 150.0);

        // Act
        ArrayList<Hotel> hotels = reservationSystem.getHotels();
        hotels.get(0).setRating(3);
        hotels.get(1).setRating(4);
        hotels.get(2).setRating(5);

        // Assert
        assertEquals(3, hotels.get(0).getRating());
        assertEquals(4, hotels.get(1).getRating());
        assertEquals(5, hotels.get(2).getRating());
    }
    // UC6: Test for finding the cheapest best-rated hotel for a given date range
    @Test
    public void testFindCheapestBestRatedHotel() {
        // Arrange
        HotelReservation reservationSystem = new HotelReservation();
        reservationSystem.addHotel("Lakewood", 150.0, 100.0, 90.0);
        reservationSystem.addHotel("Bridgewood", 150.0, 150.0, 50.0);
        reservationSystem.addHotel("Ridgewood", 200.0, 220.0, 150.0);

        LocalDate startDate = LocalDate.parse("2020-09-11", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate endDate = LocalDate.parse("2020-09-12", DateTimeFormatter.ISO_LOCAL_DATE);

        // Act
        String result = reservationSystem.findCheapestBestRatedHotel(startDate, endDate);

        // Assert
        assertEquals("Cheapest Best Rated Hotel: Bridgewood, Rating: 4 and Total Rates: $200", result);
    }
}






