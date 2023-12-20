
/**
 * Write a description of class Fraction_Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fraction_Driver{
    public static void main(String[] args){
        Fraction a = new Fraction(7,5);
        Fraction b = new Fraction(2,3);
        Fraction num = Fraction.subtract(a, b);
        System.out.println(a + " - " + b+ " = " +num);
         
        Fraction num1 = Fraction.add(a, b);
        System.out.println(a + " + " + b+ " = " +num1);
         
        Fraction num2 = Fraction.multiply(a, b);
        System.out.println(a + " * " + b+ " = " +num2);
         
        Fraction num3 = Fraction.divide(a, b);
        System.out.println(a + " / " + b+ " = " +num3);
    }
    
}
