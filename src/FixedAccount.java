import java.util.Scanner;

public class FixedAccount {
	float rate;
	float time;
	public double calculateInterest() {
		System.out.println("in fixed account");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter balance, time, rate");
		int balance=scan.nextInt();
		rate=scan.nextFloat();
		time=scan.nextFloat();
		double interestValue=balance+(balance*rate);
		return interestValue;
	}

	public static void main(String[] args) {
		FixedAccount account = new FixedAccount();
		FixedAccount acc=new SavingAccount();
		double value1=account.calculateInterest();
		double value=acc.calculateInterest();
		System.out.println(value);
		System.out.println(value1);
	}

}
class SavingAccount extends FixedAccount{
	public double calculateInterest() {
		System.out.println("In savings account");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter principle");
		int principle=scan.nextInt();
		double Interestvalue=(principle*rate*time)/100;
		double interest=Interestvalue+principle;
		return interest;
	}
}