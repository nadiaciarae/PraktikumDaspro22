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
        
        // Calculate total cost, discount, and total payment
            totalCost = pricePerCup * numberOfCups;
            if (totalCost >= 100000) {
                discount = totalCost * 10 / 100; // 10% discount 
            }
            totalPayment = totalCost - discount;
            System.out.println("\nTotal cost: Rp" + totalCost);
            System.out.println("Discount: Rp" + discount);
            System.out.println("Total payment: Rp" + totalPayment);
        
        // Check if payment is enough and calculate change or shortage
            if (payment >= totalPayment) {
                change = payment - totalPayment;
                System.out.println("Change: Rp" + change);
            } else {
                shortage = totalPayment - payment;
                System.out.println("\nNot enough payment");
                System.out.println("Shortage: Rp" + shortage);
            }
        input.close();
    }
}
