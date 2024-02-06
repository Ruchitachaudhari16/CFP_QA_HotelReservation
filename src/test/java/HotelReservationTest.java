import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class HotelReservationTest {
    @Test
    public void testFindCheapestHotel()
    {
        // Arrange
        HotelReservation reservationSystem = new HotelReservation();
        reservationSystem.addHotel("Lakewood", 100.0, 110.0, 90.0);
        reservationSystem.addHotel("Bridgewood", 150.0, 150.0, 50.0);
        reservationSystem.addHotel("Ridgewood", 200.0, 220.0, 150.0);

        LocalDate startDate = LocalDate.parse("2024-09-11", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate endDate = LocalDate.parse("2024-09-12", DateTimeFormatter.ISO_LOCAL_DATE);

        // Act
        String cheapestHotelInfo = reservationSystem.findCheapestHotel(startDate, endDate);

        // Assert
        assertEquals("Cheapest Hotel: Lakewood and Bridgewood, Total Rates: $200.0", cheapestHotelInfo);
    }
}
