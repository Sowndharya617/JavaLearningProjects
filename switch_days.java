import java.util.Scanner;

class switch_days{
    public static void main(String args[]){
        Scanner sow = new Scanner(System.in);
        System.out.print("Enter the day of the week : ");
        String day = sow.nextLine();
        switch(day){
            case "monday":
                System.out.println("The second day of the weeek is Monday!!");
                break;
            case "tuesday":
                System.out.println("The third day of the week is Tuesday!");
            case "wednesday":
                System.out.println("The fourth day of the week is Wednesday");
                break;
            case "thursday":
                System.out.println("The fifth and the middle day of the week is Thursday");
                break;
            case "friday":
                System.out.println("The sixth day of the week is Friday !!");
                break;
            case "saturday":
                System.out.println("The last and Holiday of the week is Saturday");
                break;
            case "sunday":
                System.out.println("The first day and the relaxing day of the week is Sunday!");
                break;
            default:
                System.out.println("Invalid day entered!!");
        }
    }
}