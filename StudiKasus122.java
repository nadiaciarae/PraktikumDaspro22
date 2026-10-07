import java.util.Scanner;
public class StudiKasus122 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //  Variables declaration
            int pricePerCup = 18000, numberOfCups, payment, totalCost, discount = 0, totalPayment, change, shortage;

        // Input from user
            System.out.print("Enter number of cups: ");
            numberOfCups = input.nextInt();
            System.out.print("Enter payment amount: ");
            payment = input.nextInt();
        input.close();
    }
}
