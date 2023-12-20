
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner; 
public class Game{  
  

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction first = new Fraction();
        Fraction second = new Fraction();
        boolean quit = false;
        int win = 0;
        int loss = 0;
        //printing the game
        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");  
        while(quit == false){
            first.setNum((int)(Math.random()*9+1));
            first.setDenom((int)(Math.random()*9+1));
            second.setNum((int)(Math.random()*9+1));
            second.setDenom((int)(Math.random()*9+1));
        
            Fraction ans = operations(first, second);
            
            String input = in.nextLine();
            input = input.toLowerCase();
            if(input.equals("quit")){
                //fix denominator going to zero, because when total is zero fraction doesnt work.
                quit = true;
                int total = win+loss;
                if(total == 0){
                    total = 1;
                    win = 0;
                }
                Fraction percent = new Fraction(win,total);
                int score = (int)(percent.toDouble()*100);
                System.out.println("\nYour win/loss ratio was "+percent+",for a score of " +score+ " percent!");
            }else{
                Fraction person = new Fraction(input);
                if(equal(person,ans)){
                    System.out.println("Correct!");
                    win++;
                }else{
                    System.out.println("Wrong. the answer was " + ans);
                    loss++;
                }
            }
        }
        
    }
    
    public static boolean equal(Fraction input,Fraction ans){
        if(input.getNum() == ans.getNum() && input.getDenom() == ans.getDenom()){
            return true;
        }else{
            return false;
        }  
    }
    public static Fraction operations(Fraction a, Fraction b){
        String op = "";
        Fraction ans = new Fraction();
        int num = (int)(Math.random()*4);
        if(num == 0){
            op = "+"; 
            ans = Fraction.add(a, b);
        }else if (num == 1){
            op = "-";
            ans = Fraction.subtract(a,b);
        }else if (num == 2){
            op = "*";
            ans = Fraction.multiply(a,b);
        }else if (num == 3){
            op = "/";
            ans = Fraction.divide(a,b);
        }
        System.out.print("\n" + a +" "+ op +" "+ b +" = ");
        return ans;
    }
}
   
   

