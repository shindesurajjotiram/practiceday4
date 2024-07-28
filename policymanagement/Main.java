package advanceprograms.policymanagement;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PolicyManagement allPolicyes = new PolicyManagement();

        int i;
        do {
            System.out.print("\n\n");
            System.out.println("===========================================================================");
            System.out.print("\n");
            System.out.println("All Policyes");
            System.out.print("\n\n");

            allPolicyes.showDetails();

            System.out.print("\n\n");
            System.out.println("===========================================================================");
            System.out.print("\n\n");

            System.out.println("Enter 1 to add a new policy.");
            System.out.println("Enter 2 to edit existing policy.");
            System.out.println("Enter 3 to delete a policy.");
            System.out.println("Enter 4 to filter List.");
            System.out.println("Enter 5 to exit.");
            System.out.println("\n");
            System.out.print("Enter your option here : ");
            i = scanner.nextInt();

            switch (i) {
                case 1:
                    allPolicyes.addPerson();
                    break;
                case 2:
                    allPolicyes.editPerson();
                    break;
                case 3:
                    allPolicyes.deletePerson();
                    break;
                case 4:
                    allPolicyes.filterList();
                    break;
                default:
                    System.out.println("Enter the given options only.\n");
            }
        } while (i != 5);

    }
}
