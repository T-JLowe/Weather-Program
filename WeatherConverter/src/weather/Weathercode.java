package weather;
import java.util.Scanner;

public class Weathercode 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the temperature in fahrenheit");

		Scanner cin = new Scanner(System.in);

		float Fahr = cin.nextFloat();
		float Celc = 0;

		Celc = Fahr - 32;
		Celc = Celc * 5/9;
		
		if(Fahr<32)
		{
			System.out.println("Brrr! It sure is cold outside at " + Celc + " degrees centrigrade");
		}
		else if(Fahr>90)
		{
			System.out.println("Whew! It sure is hot outside at " + Celc + " degrees centigrade");
		}
		else
		{
			System.out.println("Outside, it is " + Celc + " degrees centigrade");
		}
	}
}