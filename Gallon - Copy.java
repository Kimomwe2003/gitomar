import java.util.Scanner;
public class Gallon{
	public static void main(String[]args){
		Scanner v = new Scanner(System.in);
		System.out.print("plz enter no of gallons");
		double gallons = v.nextDouble();
		System.out.print("plz enter no of miles");
		double miles = v.nextDouble();
		System.out.print("plz enter  the price");
		double price = v.nextDouble();
		double distance= miles*gallons;
		double cost =(250/miles)*price;
		System.out.print("the distance is:" +distance);
		System.out.print("the cost is:" +cost);
		
		
	}
}