package advanceprograms.customermanagementsystem;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CustomerManagement allPolices = new CustomerManagement();

        int i;
        do {
            System.out.print("\n\n");
            System.out.println("===========================================================================");
            System.out.print("\n");
            System.out.println("All Policyes");
            System.out.print("\n\n");

            allPolices.showDetails();

            System.out.print("\n\n");
            System.out.println("===========================================================================");
            System.out.print("\n\n");

            System.out.println("Enter 1 to add a new customer.");
            System.out.println("Enter 2 to edit existing customer.");
            System.out.println("Enter 3 to retrieve all policies for a particular customer.");
            System.out.println("Enter 4 to exit");
            System.out.println("\n");
            System.out.print("Enter your option here : ");
            i = scanner.nextInt();

            switch (i) {
                case 1:
                    allPolices.addCustomer();
                    break;
                case 2:
                    allPolices.editCustomer();
                    break;
                case 3:
                    allPolices.retriveAllPoliciesForAPerticularCustomer();
                    break;
                default:
                    System.out.println("Enter the given options only.\n");
            }
        } while (i != 4);

    }
}
