
import java.util.Scanner;
class LoanEligibility{
     private static final int MIN_CREDIT_SCORE=700;
     private static final double  MIN_ANNUAL_INCOME=500000;


    public static void main(String[] args) {
        Scanner sow = new Scanner(System.in);
     // Getting credit score from user 
        System.out.print("Your credit score : ");
        int creditscore=sow.nextInt();
    // Getting annual income level of the user 
        System.out.print("Your annual income : ");
        double income =sow .nextDouble();
        sow.nextLine();
    //Knowing the emploment status of the user for loan requirements
        System.out.print("EMPLOYED [Y/N]:");
        String employ=sow.nextLine().toUpperCase();
        boolean employmentstatus=employ.equals("Y");
        
    //Checking for the eligibility criteria
        if(creditscore>=MIN_CREDIT_SCORE && income >=MIN_ANNUAL_INCOME && employmentstatus){
           
            System.out.println("Eligible for loan");
        }
        else{
            System.out.println("Not eligible for the loan");
        }
        sow.close();

    }
}