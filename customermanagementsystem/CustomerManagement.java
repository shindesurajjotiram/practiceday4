package advanceprograms.customermanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManagement {

    private final ArrayList<Customer> allCustomeres = new ArrayList<>();

    public void showDetails() {
        for (Customer customer : allCustomeres) {
            System.out.println(customer);
        }
    }


    public void addCustomer() {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer ID : ");
        customer.setCustomerId(scanner.nextInt());
        System.out.print("Enter customer name : ");
        scanner.nextLine();
        customer.setName(scanner.nextLine());
        System.out.print("Enter customer phone number : ");
        customer.setPhoneNumber(scanner.nextLong());

        customer.setListOfPolicies();

        allCustomeres.add(customer);
    }

    public void editCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name : ");
        String fullName = scanner.nextLine();
        int i = 0;
        for (Customer customer : allCustomeres) {
            i++;
            if (customer.getName().equals(fullName)) {

                System.out.print("Enter customer ID : ");
                customer.setCustomerId(scanner.nextInt());
                System.out.print("Enter customer phone number : ");
                customer.setPhoneNumber(scanner.nextLong());

                customer.setListOfPolicies();

            } else if (i == allCustomeres.size()  && !customer.getName().equals(fullName)) {
                System.out.println("Customers are not found.");
            }
        }
    }

    public void retriveAllPoliciesForAPerticularCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name : ");
        String fullName = scanner.nextLine();
        int i = 0;
        for (Customer customer : allCustomeres) {
            i++;
            if (customer.getName().equals(fullName)) {

                System.out.println(customer.getListOfPolicies());

            } else if (i == allCustomeres.size()) {
                System.out.println("Customers are not found.");
            }
        }
    }
}
