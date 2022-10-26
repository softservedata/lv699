/*For employees with a fixed payment the formula is:
the average monthly 	salary = fixed monthly payment*/

package hw1;

public class ContractEmployee extends Employee implements Payment{

    private String federalTaxIdmember;
    private double salary;


    ContractEmployee( String employeeId,String name, String federalTaxIdmember, double salary ){
       super(employeeId, name);
       this.federalTaxIdmember = federalTaxIdmember;
       this.salary = salary;

    }


    @Override
    public double calculatePay() {
    return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
