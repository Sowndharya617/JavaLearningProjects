//75
//68756484.liter
//max and min
//random time 
//scanner

import java.util.Scanner;
class watertracker{
    public static void main(String args[]){
        Scanner sow= new Scanner(System.in);
            System.out.print("Enter you weight in (kg): ");
            int a = sow.nextInt();
           
            float b= a*0.033f;
            float c=Math.max(5.0f,b);
            float d=Math.min(1.0f,b);

            if (b>d && b<c){
            System.out.println("Consume minimum of  "+b+" L of water daily");}

            int hours =8+(int)(Math.random()*(21-8));
            int minutes=(int)(Math.random()*60);

            System.out.print("REMINDER :");
            System.out.print("It is "+ hours+" hours ");
            System.out.print(" and "+minutes+" minutes....."+" Time to take your sip of water to feel energized!!");


        
        }
    }
