import java.util.Scanner;
public class Secret{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        String inputpass;
        System.out.println("What's the password?");
        inputpass = input.nextLine(); 
        
        if(inputpass.equals("Dragon") && inputpass.equals("dragon")){
            System.out.println("Correct! My secret is: I am Batman.");
            
        }
        else{
            System.out.println("Incorrect Password! My secret is still safe ..."); 
            
        }
        
        
    }
}