package birthday;

import java.util.Scanner;


public class Birthday {
  
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int age;
        boolean birthday;
        
        System.out.print("How old are you: ");
        age = keyboard.nextInt();
        
        System.out.println("Is it your bithday today? True or False");
        birthday = keyboard.nextBoolean();
        
        
        if(birthday == true)
        {
            ++age;
            if (age <= 18)
            {

                System.out.println("User is 18 or younger");

            }

            else if(age > 18 && age < 40)
            {
                System.out.println("User is between 19 and 39");
            }
            else if(age == 45 || age == 50)
            {
                System.out.println("User is either 45 or 50");
            }
            else
            {
                System.out.println("User is older than 40");
            }
        }
        else
        {
            if (age <= 18)
            {

                System.out.println("User is 18 or younger");

            }

            else if(age > 18 && age < 40)
            {
                System.out.println("User is between 19 and 39");
            }
            else if(age == 45 || age == 50)
            {
                System.out.println("User is either 45 or 50");
            }
            else
            {
                System.out.println("User is older than 40");
            }
        }
    }
    
}
