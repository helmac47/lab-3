import java.util.Scanner;
class Main {
public static void main(String[] args)
{Scanner s = new Scanner(System.in);
		int a, b = 0;
		Scanner ile = new Scanner(System.in);		
		System.out.print("Enter a number to count down or up from:\n");
		a = ile.nextInt();
		System.out.print("Enter 0 to CONFIRM Launch\n");
		b = ile.nextInt();
		System.out.println("Countdown has been started... \n");
			if(a<b){
				//Rising	
				do{
					System.out.println(a);
					a++; }
				while(a<=b);
				}		
			else if (b<a){
				//Reduction	
				do{
					System.out.println(a);
					a--; }
				while(b<=a);
				}
		System.out.println("Blast Off");
	}
}
