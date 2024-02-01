import java.util.ArrayList;

public class PayrollSystem {
        public  ArrayList<String> employees;

        public PayrollSystem() {
            employees = new ArrayList<>(); //Arraylist for employees is executed.
        }

        public void addEmployee(String employeeName) {
            employees.add(employeeName);
        }

        public ArrayList<String> getEmployees() {
            return employees;
        }
    }

