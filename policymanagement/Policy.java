package advanceprograms.policymanagement;

public class Policy {
     int policyNumber;
     String policyHolderName;
     String typeOfInshorance;
     int coverageAmmount;

    public int getCoverageAmmount() {
        return coverageAmmount;
    }

    public void setCoverageAmmount(int coverageAmmount) {
        this.coverageAmmount = coverageAmmount;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getTypeOfInshorance() {
        return typeOfInshorance;
    }

    public void setTypeOfInshorance(String typeOfInshorance) {
        this.typeOfInshorance = typeOfInshorance;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber=" + policyNumber +
                ", policyHolderName='" + policyHolderName + '\'' +
                ", typeOfInshorance='" + typeOfInshorance + '\'' +
                ", coverageAmmount=" + coverageAmmount +
                '}';
    }
}
