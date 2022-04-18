import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte Months_In_Year = 12;
        final byte percent = 100;

        int principal = 0;
        float anualInterest  = 0F;
        byte years = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner sc = new Scanner(System.in);

        while(true){
        System.out.println("Enter principal ($1k -$1m ):: ");
        principal = sc.nextInt();
        if (principal >=1000 && principal <=1_000_000){
            break;
        }
        System.out.println("Enter a valid principal amount");
        }

        while(true){
        System.out.println("Enter InterestRate (1 - 30):: ");
        anualInterest = sc.nextFloat();
        if (anualInterest >0 && anualInterest<30){
            break;
        }
        System.out.println("Enter a valid rate");
        }

        while(true){
        monthlyInterest = anualInterest/percent/Months_In_Year;  // convert anual interest into monthly
        System.out.println("Enter time in Years:: ");
        years = sc.nextByte();
        if(years > 0 && years < 5){
        numberOfPayments = years * Months_In_Year;
        break;
        }
        System.out.println("Enter a valid no of years");
        }

        // calculation
        double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest, numberOfPayments))/
        (Math.pow(1+monthlyInterest, numberOfPayments)-1); //formula to calculate mortgage
        String mortgageFormated = NumberFormat.getCurrencyInstance().format(mortgage); // formatting the mortgage into currency format
        System.out.println("Your Mortgage is :: " + mortgageFormated);
        sc.close(); //scanner close
        


    }
}
