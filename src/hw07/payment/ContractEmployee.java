package hw07.payment;

public class ContractEmployee extends Employee implements Payment {
    private final int federalTaxIdMember;
    private final int fixedFeePerMonth;

    public ContractEmployee(int taxId, String name, int fixedPaid) {
        super(name);
        this.federalTaxIdMember = taxId;
        this.fixedFeePerMonth = fixedPaid;
    }

    public int getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public int getFixedFeePerMonth() {
        return fixedFeePerMonth;
    }


    @Override
    public String toString() {
        return String.format("ID: %s, TaxID: %s, Name: %s, " +
                        "Fixed monthly salary $: %s, The average monthly salary $: %s.",
                getEmployeeId(), getFederalTaxIdMember(), getName(), getFixedFeePerMonth(), calculatePay());
    }

    @Override
    public int calculatePay() {
        return getFixedFeePerMonth();
    }
}
