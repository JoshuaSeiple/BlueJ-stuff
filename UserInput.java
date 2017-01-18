import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args){
        String question = "Do you like chocolate? (yes or no)";

        Scanner sc = new Scanner(System.in);
        System.out.println(question);
        String newString = "yay! Me too.";
        String newString2 = "do you like pie? (yes or no)";
        String chocolate = sc.next();
        //System.out.println("whats your name");
        //String name = sc.next();
        //System.out.println("My name is " + name + " and my favorite color is " + color);
        System.out.println(question);
        if(chocolate.equals("yes")){
          System.out.println(newString);  
        }
        else{
          System.out.println(newString2);
          String pie = sc.next();
          if(pie.equals("yes")){
              System.out.println(newString);
            }
            else{
               System.out.println("Too bad :(");  
            }
        }
            
        }

        
        
    }
