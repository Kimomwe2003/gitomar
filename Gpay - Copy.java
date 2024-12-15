import java.util.Scanner;
public class Gpay{
	public static void main(String[]args){
		Scanner w = new Scanner (System.in);
		System.out.println("plz enter hours");
		double hours = w.nextDouble();
		System.out.println("plz enter rate");
		double rate = w.nextDouble();
		double Grosspay = hours*rate;
		System.out.println("the pay is:" +Grosspay);
		
	}
}