import java.util.*;

public class PasswordPermission
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cpin = 2014;
		int max = 3;
		int attempt = 0;
		int pin = 0;
		while(attempt<max){
		    pin = sc.nextInt();
		    if(pin ==cpin){
		        System.out.print("Access Granted");
		    }else{
		        attempt++;
		    }
		}
	}
}
