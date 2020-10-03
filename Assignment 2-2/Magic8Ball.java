import java.util.Scanner;
public class Magic8Ball{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        int ans = (int) (Math.random()*20)+1;
        String question;
        System.out.println("Ask a yes or no question: ");
        question = input.nextLine();
        
        if (ans == 1) {
            System.out.println("Random Answer 1");
        } else if (ans == 2) {        
            System.out.println("Random Answer 2");
        } else if (ans == 3) {
            System.out.println("Random Answer 3");
        } else if (ans == 4) {
            System.out.println("Random Answer 4");
        } else if (ans == 5) {
            System.out.println("Random Answer 5");
        } else if (ans == 6) {
            System.out.println("Random Answer 6");
        } else if (ans == 7) {
            System.out.println("Random Answer 7");
        } else if (ans == 8) {
            System.out.println("Random Answer 8");
        } else if (ans == 9) {
            System.out.println("Random Answer 9");
        } else if (ans == 10) {
            System.out.println("Random Answer 10");
        } else if (ans == 11) {
            System.out.println("Random Answer 11");
        } else if (ans == 12) {
            System.out.println("Random Answer 12");
        } else if (ans == 13) {
            System.out.println("Random Answer 13");
        } else if (ans == 14) {
            System.out.println("Random Answer 14");
        } else if (ans == 15) {
            System.out.println("Random Answer 15");
        } else if (ans == 16) {
            System.out.println("Random Answer 16");
        } else if (ans == 17) {
            System.out.println("Random Answer 17");
        } else if (ans == 18) {
            System.out.println("Random Answer 18");
        } else if (ans == 19) {
            System.out.println("Random Answer 19");
        } else if (ans == 20) {
            System.out.println("Random Answer 20");
        }
        
        
    }
}