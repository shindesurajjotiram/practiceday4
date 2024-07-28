package advanceprograms.claimtrackingsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ClaimManagement {

    private final ArrayList<Claim> allClaimes = new ArrayList<>();

    public void showDetails() {
        for (Claim claim : allClaimes) {
            System.out.println(claim);
        }
    }

    public void addClaim() {
        Claim claim = new Claim();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter claim number : ");
        claim.setClaimNumber(scanner.nextInt());
        System.out.print("Enter policy number : ");
        claim.setPolicyNumber(scanner.nextInt());
        System.out.print("Enter claiment name : ");
        scanner.nextLine();
        claim.setClaimentsName(scanner.nextLine());
        System.out.print("Enter coverage ammount : ");
        claim.setClaimAmount(scanner.nextInt());
        System.out.print("Enter claim status : ");
        claim.setClaimStatus(scanner.next());

         allClaimes.add(claim);
    }

    public void editClaimStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter claim holder name : ");
        String fullName = scanner.nextLine();
        int i = 0;
        for (Claim claim : allClaimes) {
            i++;
            if (claim.getClaimentsName().equals(fullName)) {
                System.out.print("Enter claim status : ");
                claim.setClaimStatus(scanner.next());
            } else if (i == allClaimes.size()) {
                System.out.println("Claimes are not found.");
            }
        }
    }

    public void generatesReportsOnTheStatusOfClaims() {
        System.out.print("Enter type of claim to list : ");
        String claimStatus=new Scanner(System.in).next();
        int j=0;
        for (Claim claim : allClaimes) {
            if (claim.getClaimStatus().equals(claimStatus)) {
                j++;
                System.out.println(claim);
            }
        }
        if (j==0) {
            System.out.println("Claimes are not found.");
        }else {
            System.out.println("this are the all claimes");
        }
    }

}
