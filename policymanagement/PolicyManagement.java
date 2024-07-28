package advanceprograms.policymanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class PolicyManagement {

    private final ArrayList<Policy> allPolicyes = new ArrayList<>();

    public void showDetails() {
        for (Policy policy : allPolicyes) {
            System.out.println(policy);
        }
    }


    public void addPerson() {
        Policy policy = new Policy();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter policy number : ");
        policy.setPolicyNumber(scanner.nextInt());
        System.out.print("Enter policy holder name : ");
        scanner.nextLine();
        policy.setPolicyHolderName(scanner.nextLine());
        System.out.print("Enter policy type : ");
        policy.setTypeOfInshorance(scanner.next());
        System.out.print("Enter coverage ammount : ");
        policy.setCoverageAmmount(scanner.nextInt());

        if (!(isExist(policy))) allPolicyes.add(policy);
        else System.out.println(policy.getPolicyHolderName() + " is already exist.");
    }

    public void editPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter policy holder name : ");
        String fullName = scanner.nextLine();
        int i = 0;
        for (Policy policy : allPolicyes) {
            i++;
            if (policy.getPolicyHolderName().equals(fullName)) {

                System.out.print("Enter policy number : ");
                policy.setPolicyNumber(scanner.nextInt());
                System.out.print("Enter policy type : ");
                policy.setTypeOfInshorance(scanner.next());
                System.out.print("Enter coverage ammount : ");
                policy.setCoverageAmmount(scanner.nextInt());

            } else if (i == allPolicyes.size()) {
                System.out.println("Policyes are not found.");
            }
        }
    }

    public void deletePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter policy holder name : ");
        String fullName = scanner.nextLine();
        int i = 0;
        for (Policy policy : allPolicyes) {
            i++;
            if (policy.getPolicyHolderName().equals(fullName)) {
                    allPolicyes.remove(policy);
            } else if (i == allPolicyes.size()) {
                System.out.println("Policyes are not found.");
            }
        }
    }

    public void filterList() {
        System.out.println("Enter type of policy to list : ");
        String policyType=new Scanner(System.in).next();
        int j=0;
        for (Policy policy : allPolicyes) {
            if (policy.getTypeOfInshorance().equals(policyType)) {
                j++;
                System.out.println(policy);
            }
        }
        if (j==0) {
            System.out.println("Policyes are not found.");
        }else {
            System.out.println("this are the all policyes");
        }
    }

    public boolean isExist(Policy newPolicy) {
        int i = 0;
        for (Policy policy : this.allPolicyes) {
            i++;
            if ((policy.getPolicyHolderName()).equals(newPolicy.getPolicyHolderName())) return true;
            else if (i == allPolicyes.size()) return false;
        }
        return false;
    }
}
