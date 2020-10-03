import java.util.Scanner;
public class GradeBot{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        double outof;
        double score;
        double percent;
        
        System.out.println("What was your test out of?");
        outof = input.nextDouble();
        System.out.println("What did you get?");
        score = input.nextDouble();
        
        percent = Math.round(100 * (score/outof));
        if(percent>=86){
            System.out.println("You got " + percent + "%, that's an A. Great work!");
        }
        if(percent>=73 && percent<=85 ){
            System.out.println("You got " + percent + "%, that's a B. Still a good job!");
        }
        if(percent>=67 && percent<=72 ){
            System.out.println("You got " + percent + "%, that's a C. You passed, but you can do better!");
        }
        if(percent>=60 && percent<=66 ){
            System.out.println("You got " + percent + "%, that's a C-. You have to try harder now!");
        }
        if(percent>0 && percent<=49){
            System.out.println("You got " + percent + "%, that's a F. Ughhh....you failed!");
        }
        if(percent == 0 && outof == 0){
            System.out.println("You didn't do a test!");
        }
        else{
            System.out.println("Silly human, that's not possible. Quit joking around.");      
    }
        
        
        
        
    }
}
