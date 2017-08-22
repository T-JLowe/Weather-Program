package weather;
import java.util.Scanner;

public class Weathercode 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the temperature in fahrenheit"); //Asking user for temperature

		Scanner cin = new Scanner(System.in); //Taking users input

		float Fahr = cin.nextFloat(); //Converting input into a flot
		float Celc = 0;  //Making a celcius value

		Celc = Fahr - 32;  //Converting temp
		Celc = Celc * 5/9; //Converting temp
		
		if(Fahr<32) //Print the temperature out with a different message depending on the temperature
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
