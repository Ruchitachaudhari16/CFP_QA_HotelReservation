public class Hotel {
    //Class Instance

    private String name;
    private double regularCustomerRate;
    private double weekdayRate;
    private double weekendRate;
    private int rating;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Hotel(String name, double regularCustomerRate, double weekdayRate, double weekendRate) {
        this.name = name;
        this.regularCustomerRate = regularCustomerRate;
        this.weekdayRate = weekdayRate;
        this.weekendRate = weekendRate;
    }

    public String getName() {
        return name;
    }

    public double getRegularCustomerRate() {
        return regularCustomerRate;
    }

    public double getWeekdayRate() {
        return weekdayRate;
    }

    public double getWeekendRate() {
        return weekendRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegularCustomerRate(double regularCustomerRate) {
        this.regularCustomerRate = regularCustomerRate;
    }

    public void setWeekdayRate(double weekdayRate) {
        this.weekdayRate = weekdayRate;
    }

    public void setWeekendRate(double weekendRate) {
        this.weekendRate = weekendRate;
    }


    }


