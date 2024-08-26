import java.util.Scanner;
class math_helper{
    public static void main(String[] args) {
        Scanner sow = new Scanner(System.in);
        System.out.print("Enter number one :");
        int num1= sow.nextInt();
        System.out.print("Enter the operator :");
        char operator=sow.next().charAt(0);
        System.out.print("Enter number one :");
        int num2= sow.nextInt();

        switch(operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                if(num2!=0){
                    System.out.println("num1/num2");
                
                }
                else{
                    System.out.println("Indivisible");

                }
                break;
            case '%':
                if(num2!=0){
                    System.out.println(num1%num2);

                }
                else{
                    System.out.println("Zero indivisible operator");
                }
            default:
                System.out.println("Enter valid operator ");
        }


    }
}