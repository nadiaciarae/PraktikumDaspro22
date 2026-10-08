import java.util.Scanner;
public class StudiKasus222 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // Variables declaration
            String name, activity;
            int numberOfDocuments, winnerRank;
            String fundingStatus;
            String fundingReason;
        
        // Input from user
            System.out.print("Enter your name: ");
            name = input.nextLine();
            System.out.print("Enter your activity: ");  
            activity = input.nextLine();
            System.out.print("Enter number of documents (0-4): ");
            numberOfDocuments = input.nextInt();
            System.out.print("Enter winner rank (1-3): ");
            winnerRank = input.nextInt();

        // Check funding eligibility based on activity, number of documents, and winner rank
            if (activity.equalsIgnoreCase("BELMAWA") || activity.equalsIgnoreCase("BAKORMA") || activity.equalsIgnoreCase("Mandiri")) {
                if (numberOfDocuments == 4) {
                    if (winnerRank >= 1 && winnerRank <= 3) {
                        fundingStatus = "Approved";
                        fundingReason = "You meet all requirements";
                    } else {
                        fundingStatus = "Denied";
                        fundingReason = "You must be a winner with rank 1-3 to be eligible for funding.";
                    }
                } else {
                    fundingStatus = "Denied";
                    fundingReason = "You must submit exactly 4 documents.";
                }
            } else if (activity.equalsIgnoreCase("PKM")) {
                if (numberOfDocuments == 4) {
                    fundingStatus = "Approved";
                    fundingReason = "You meet all requirements";
                } else {
                    fundingStatus = "Denied";
                    fundingReason = "You must submit exactly 4 documents.";
                }
            } else {
                fundingStatus = "Denied";
                fundingReason = "Activity is not eligible for funding.";
            }
        input.close();
    }
}