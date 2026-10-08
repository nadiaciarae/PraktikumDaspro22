import java.util.Scanner;
public class StudiKasus222 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // Variables declaration
            String name, activity, fundingStatus, fundingReason;
            int numberOfDocuments, winnerRank;
        
        // Input from user
            System.out.print("Enter your name: ");
            name = input.nextLine();
            System.out.print("Enter your activity: ");  
            activity = input.nextLine();
            System.out.print("Enter number of documents (0-4): ");
            numberOfDocuments = input.nextInt();
            System.out.print("Enter winner rank (1-3): ");
            winnerRank = input.nextInt();
        input.close();
    }
}
