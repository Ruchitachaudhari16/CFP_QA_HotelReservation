import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class HotelReservation {

    public ArrayList<Hotel> hotels; //Create ArrayList of Hotel class



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
  /*  public String findCheapestHotel(LocalDate startDate, LocalDate endDate) {
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
        }*/


    private double calculateTotalRate(Hotel hotel, LocalDate startDate, LocalDate endDate) {
        // calculate rate :- +1 for including a last day.
        return hotel.getRegularCustomerRate() * (endDate.toEpochDay() - startDate.toEpochDay() + 1);
    }

    //UC 6:-  method to find the cheapest best-rated hotel for a given date range
    public String findCheapestBestRatedHotel(LocalDate startDate, LocalDate endDate) {
        Hotel cheapestBestRatedHotel = null;
        double minTotalRate = Double.MAX_VALUE;
        int maxRating = 0;


        for (Hotel hotel : hotels) {
            double totalRate = calculateTotalRate(hotel, startDate, endDate);

            if (totalRate < minTotalRate) {
                minTotalRate = totalRate;
                cheapestBestRatedHotel = hotel;
                maxRating = hotel.getRating();
            } else if (totalRate == minTotalRate && hotel.getRating() > maxRating) {
                cheapestBestRatedHotel = hotel;
                maxRating = hotel.getRating();
            }
        }

        if (cheapestBestRatedHotel != null) {
            return "Cheapest Best Rated Hotel: " + cheapestBestRatedHotel.getName() +
                    ", Rating: " + maxRating + " and Total Rates: $" + minTotalRate;
        } else {
            return "No hotels available";
        }

        //UC : 7

        // Updated method to find the best-rated hotel for a given date range
        public String findBestRatedHotel(LocalDate startDate, LocalDate endDate)
        {
            Hotel bestRatedHotel = null;
            int maxRatings= 0;


            for (Hotel hotel : hotels) {
                if (hotel.getRating() > maxRating) {
                    maxRating = hotel.getRating();
                    bestRatedHotel = hotel;
                }
            }

            if (bestRatedHotel != null) {
                return "Best Rated Hotel: " + bestRatedHotel.getName() + ", Rating: " + maxRating;
            } else {
                return "No hotels available";
            }

        }
    }









