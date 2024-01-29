
import java.util.*;

public class guessgame {
    public static void main(String[] args) {
        Random rn=new Random();
        Scanner sc=new Scanner(System.in);
        int an=rn.nextInt(100);

        System.out.println("Let's Start the Game");
        System.out.println("--------------------");
        int innercount=0;
        int outercount=0;
        while (outercount<1) {
            if(innercount<=2)
            {
            while(innercount<=2)
        {
        
        System.out.println("Guess the number");
        int gno=sc.nextInt();

        if(gno==an)
        {
            System.out.println("You Guess the right number");
        }
        else if(gno<=an)
        {
            System.out.println("Too low Try Again!");
            innercount++;

        }
        else
        {
            System.out.println("Too high try Again!");
            innercount++;
        }


























    
        }
            
        }
        else
    {
        System.out.println("Better  Luck Next Time");
        System.out.println("----------------------");
        System.out.println("The Number Was:"+an);
        outercount++;
    }
        }
    
        
        }
    

    
    




    }
   

    
    
