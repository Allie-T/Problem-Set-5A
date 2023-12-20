
/**
 * This class represents a fraction with a numerator and denominator
 *
 * @author Alicia Tang
 * @version 1.0
 */
public class Fraction{
    //add java comments
    //instance variables
    private int numerator, denominator;
    
    //constructors
    /**
     * Default constructor. Creates a fraction "1/1".
     */
    public Fraction(){
        numerator = 1;
        denominator = 1;
    }
    
    /**
     * Parameterized constructor.
     * @param num   The desired numerator
     * @param denom The desired denominator. If denominator is 0, it is changed to 1.
     */
    public Fraction (int a, int b){
        numerator = a;
        denominator = b;
        fixDenominator();
    }
    
    /**
     * Parameterized constructor.
     * @param string    The desired fraction in String form.
     */
    public Fraction (String f){
        int slash = f.indexOf("/");
        if(slash > 0){
            numerator = Integer.parseInt(f.substring(0,slash));
            denominator = Integer.parseInt(f.substring(slash+1));
            fixDenominator();
        }else{
            System.out.println("Invalid Fraction Format");
            numerator = 1;
            denominator = 1;
        }
       
    }
    
    /**
     * Copy constructor
     * @param og    The fraction object thats being copied
     */
    public Fraction (Fraction og){
        numerator = og.numerator;
        denominator = og.denominator;
    }
    
    /**
     * Changes denominator to 1 when it is set to zero
     */
    private void fixDenominator (){
       if(denominator == 0){
            System.out.println("Invalid fraction: zero");
            denominator = 1;
        } 
    }
    
    //behaviour methods
    //accessor methods
    
    /**
     * Gets numerator
     */
    public int getNum(){
        return numerator;
    }
    
    /**
     * Gets denominator
     */
    public int getDenom(){
        return denominator;
    }
    
    /**
     * Returns the fraction as a String text.
     */ 
    public String toString(){
        return numerator + "/" + denominator;
    }
    
    /**
     * Returns the fraction as a double.
     */
    public double toDouble(){
        return (double) numerator/denominator;
    }
    
    /**
     * Reduces fraction to lowest terms
     */
    public void reduce(){
        int factor = gcd(numerator, denominator);
        numerator = numerator/factor;
        denominator = denominator/factor;
        
    }
    
    /**
     * Returns the greatest common denominator between two numbers
     * @param a First number
     * @param b Second number
     */
    public int gcd (int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        while(a!=b){
            if(a>b){
                a = a-b;
            }else if(a<b){
                b = b-a;
            }
        }
        return a;
    }
    
    /**
     * Set numerator to a number
     * @param num   Number user wishes to set numerator to
     */
    public void setNum (int num){
        numerator = num;
    }
    
    /**
     * Set denominator to a number
     * @param denom  Number user wishes to set denominator to
     */
    public void setDenom (int denom){
        denominator = denom;
    }
    
    /**
     * Returns the product after multiplying two fractions. In lowest terms 
     * @param a First fraction
     * @param b Second fraction
     */
    public static Fraction multiply(Fraction a, Fraction b){
        int num = a.numerator * b.numerator;
        int denom = a.denominator * b.denominator;
        Fraction product = new Fraction(num,denom);
        product.reduce();
        return product;
    }
    
    /**
     * Returns the quotient after dividng the first fraction by the second fraction. In lowest terms
     * @param a First fraction
     * @param b Second fraction
     */
    public static Fraction divide(Fraction a, Fraction b){
        int num = a.numerator * b.denominator;
        int denom = a.denominator * b.numerator;
        Fraction quotient = new Fraction(num,denom);
        quotient.reduce();
        return quotient;
    }
    
    /**
     * Returns the sum after adding two fractions. In lowest terms
     * @param a First fraction
     * @param b Second fraction
     */
    public static Fraction add(Fraction a, Fraction b){
        int num = (a.numerator * b.denominator) + (b.numerator * a.denominator);
        int denom = a.denominator * b.denominator;
        Fraction sum = new Fraction(num,denom);
        sum.reduce();
        return sum;
    }
    
     /**
     * Returns the difference after subtracting the first fraction by the second fraction. In lowest terms
     * @param a First fraction
     * @param b Second fraction
     */
    public static Fraction subtract(Fraction a, Fraction b){
        int num = (a.numerator * b.denominator) - (b.numerator * a.denominator);
        int denom = a.denominator * b.denominator;
        if (denom<0){
          num *= -1;
          denom = Math.abs(denom);
        }
        Fraction difference = new Fraction(num,denom);
        difference.reduce();
        return difference;
    }
    
    
}
    
