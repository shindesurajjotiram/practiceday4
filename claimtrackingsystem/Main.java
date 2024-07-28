package advanceprograms.claimtrackingsystem;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ClaimManagement allClaims = new ClaimManagement();

        int i;
        do {
            System.out.print("\n\n");
            System.out.println("===========================================================================");
            System.out.print("\n");
            System.out.println("All Policyes");
            System.out.print("\n\n");

            allClaims.showDetails();

            System.out.print("\n\n");
            System.out.println("===========================================================================");
            System.out.print("\n\n");

            System.out.println("Enter 1 to add a new claim.");
            System.out.println("Enter 2 to edit claim status.");
            System.out.println("Enter 3 to generate a reports on the status of claim.");
            System.out.println("Enter 4 to exit.");
            System.out.println("\n");
            System.out.print("Enter your option here : ");
            i = scanner.nextInt();

            switch (i) {
                case 1:
                    allClaims.addClaim();
                    break;
                case 2:
                    allClaims.editClaimStatus();
                    break;
                case 3:
                    allClaims.generatesReportsOnTheStatusOfClaims();
                    break;
                default:
                    System.out.println("Enter the given options only.\n");
            }
        } while (i != 4);
    }
}
