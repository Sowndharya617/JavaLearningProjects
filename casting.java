import java.util.Scanner;

class casting{
    public static void main(String args []){
        Scanner sow = new Scanner(System.in);
        System.out.print("Enter the distance in m : ");
        int metre = sow.nextInt();
        float km = (float) metre/1000;
        System.out.println("Distance is "+km+"km");
    }
}