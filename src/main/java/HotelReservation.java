import java.util.ArrayList;

public class HotelReservation {

        public  ArrayList<Hotel> hotels; //Create ArrayList of Hotel class

        public HotelReservation()
        {
            hotels = new ArrayList<>();
        }

//Add hotel method
        public void addHotel(String name, double regularCustomerRate) {
            Hotel newHotel = new Hotel(name, regularCustomerRate);
            hotels.add(newHotel);
        }

        public ArrayList<Hotel> getHotels() {
            return hotels;
        }
    }

