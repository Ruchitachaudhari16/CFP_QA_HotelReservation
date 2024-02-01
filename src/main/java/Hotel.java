public class Hotel {
    //Class Instance
        private String name;
        private double regularCustomerRate;

        public Hotel(String name, double regularCustomerRate) {
            this.name = name;
            this.regularCustomerRate = regularCustomerRate;
        }
//Getter Property
        public String getName()
        {
            return name;
        }

        public double getRegularCustomerRate()
        {
            return regularCustomerRate;
        }

        //Setter property
        public void setName(String name) {
            this.name = name;
        }

    public void setRegularCustomerRate(double regularCustomerRate) {
        this.regularCustomerRate = regularCustomerRate;
    }

}

