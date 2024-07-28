package advanceprograms.customermanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    int customerId;
    String name;
    long phoneNumber;
    ArrayList<String> listOfPolicies;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getListOfPolicies() {
        return listOfPolicies;
    }

    public void setListOfPolicies() {
        listOfPolicies=new ArrayList<String>();
        System.out.print("Enter number of policies customer have : ");
        Scanner scanner=new Scanner(System.in);
        int noOfPolicies=scanner.nextInt();
        for(int i=0;i<noOfPolicies;i++ ) {
            System.out.print("Enter policy "+i+1+" : ");
            this.listOfPolicies.add(scanner.next());
        }

    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", listOfPolicies=" + listOfPolicies +
                '}';
    }
}
