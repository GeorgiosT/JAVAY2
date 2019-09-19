import java.util.Scanner;


public class Problem1 {




    public static void main(String args[]) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter exchange rate: ");
        float exchangeRate = input.nextFloat();



        System.out.print("Enter amount: ");
        float amount = input.nextFloat();


        while(amount>0){
            float result = amount*exchangeRate;
            System.out.println( "Pounds " + amount +"\tEuros " +  result );
            System.out.print("Enter amount: ");
           amount = input.nextFloat();

        }

        System.out.println("EXIT LIGHT ENTER NIGHT");
    }

}


