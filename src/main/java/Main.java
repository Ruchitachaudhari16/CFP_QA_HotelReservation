import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* UC1:-Ability to add Hotel in a Hotel Reservation System with Name and
rates for Regular Customer...*/

        // Hotel Reservation System
        HotelReservation reservation = new HotelReservation();
        reservation.addHotel("Radison Blu ", 10000.0);
        reservation.addHotel("Vivanta", 15000.0);

        //  Get hotels and display
        ArrayList<Hotel> hotels = reservation.getHotels();
        System.out.println("List of Hotels:");
        for (Hotel hotel : hotels) {
            System.out.println("Hotel Name: " + hotel.getName() + ", Regular Customer Rate: " + hotel.getRegularCustomerRate());
        }

        // Payroll System
        PayrollSystem payrollSystem = new PayrollSystem();
        payrollSystem.addEmployee("Rasika");
        payrollSystem.addEmployee("Pratika");

        //  Get employees and display
        ArrayList<String> employees = payrollSystem.getEmployees();
        System.out.println("\nList of Employees:");
        for (String employee : employees) {
            System.out.println("Employee Name: " + employee);
        }
    }
}


