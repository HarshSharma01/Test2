import java.util.Scanner;

public class SalaryStructure {
	int basicSalary;

	public double salaryCalculate() {
		double hra, specAllow, pf;
		double netPayable;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter basic salary");
		basicSalary = scan.nextInt();
		hra = (0.50 * basicSalary);
		specAllow = (0.75 * basicSalary);
		pf = (0.12 * basicSalary);
		netPayable = basicSalary + hra + specAllow - pf;
		return netPayable;
	}

	public static void main(String[] args) {
		SalaryStructure salaryStructure = new SalaryStructure();
		double n = salaryStructure.salaryCalculate();
		System.out.println("Net Payable amount " + n);
	}

}
