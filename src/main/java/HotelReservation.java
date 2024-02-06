import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class HotelReservation {

    public  ArrayList<Hotel> hotels; //Create ArrayList of Hotel class


    public HotelReservation() {
        hotels = new ArrayList<>();
    }

    public void addHotel(String name, double regularCustomerRate, double weekdayRate, double weekendRate) {
        Hotel newHotel = new Hotel(name, regularCustomerRate, weekdayRate, weekendRate);
        hotels.add(newHotel);
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }
    //Uc 2:-
    public String findCheapestHotel(LocalDate startDate, LocalDate endDate) {
        Hotel cheapestHotel = null;
        double minTotalRate = Double.MAX_VALUE;

        for (Hotel hotel : hotels) {
            double totalRate = calculateTotalRate(hotel, startDate, endDate);

            if (totalRate < minTotalRate) {
                minTotalRate = totalRate;
                cheapestHotel = hotel;
            }
        }

        if (cheapestHotel != null) {
            return "Cheapest Hotel: " + cheapestHotel.getName() + ", Total Rates: $" + minTotalRate;
        } else {
            return "No hotels available";
        }
    }


    private double calculateTotalRate(Hotel hotel, LocalDate startDate, LocalDate endDate) {
        // calculate rate :- +1 for including a last day.
        return hotel.getRegularCustomerRate() * (endDate.toEpochDay() - startDate.toEpochDay() + 1);
    }

}



