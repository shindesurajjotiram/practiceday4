package advanceprograms.claimtrackingsystem;

public class Claim {
     int claimNumber;
     int policyNumber;
     String claimentsName;
     int claimAmount;
     String claimStatus;

    public int getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(int claimAmount) {
        this.claimAmount = claimAmount;
    }

    public String getClaimentsName() {
        return claimentsName;
    }

    public void setClaimentsName(String claimentsName) {
        this.claimentsName = claimentsName;
    }

    public int getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(int claimNumber) {
        this.claimNumber = claimNumber;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "claimAmount=" + claimAmount +
                ", claimNumber=" + claimNumber +
                ", policyNumber=" + policyNumber +
                ", claimentsName='" + claimentsName + '\'' +
                ", claimStatus='" + claimStatus + '\'' +
                '}';
    }
}
