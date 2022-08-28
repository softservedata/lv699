package hw7;

public class ContractEmployee extends Employee implements Payment {

	private int federalTaxIdmember;
	private int mounthRate;

	public ContractEmployee(String name, int federalTaxIdmember, int mounthRate) {
		super(name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.mounthRate = mounthRate;
	}
	
	

	@Override
	public String toString() {
		return "\nContractEmployee - " + getName() + ", " +  " federalTaxIdmember=" + federalTaxIdmember + ", mounthRate=" + mounthRate;
	}

	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public void calculatePay() {

	}

}
