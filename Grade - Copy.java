import java.util.Scanner;
public class Grade{
	public static void main(String[]args){
		Scanner h = new Scanner(System.in);
		System.out.print("plz quiz scores");
		double quiz = h.nextDouble();
		System.out.print("plz midterm scores");
		double midterm = h.nextDouble();
		System.out.print("plz final scores");
		double finalexam = h.nextDouble();
		double averagescore=(quiz+midterm+finalexam)/3;
		if(averagescore>=90){
		System.out.print("grade A");
		}else if(averagescore>=70 && averagescore<=90){
			System.out.print("grade B");
		}else if(averagescore>=50 && averagescore<=70){
			System.out.print("grade C");
			
		}else{
			System.out.print("grade F");
		}
		
		
		
		
	}
}