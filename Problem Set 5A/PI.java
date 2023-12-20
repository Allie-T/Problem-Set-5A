
/**
 * Write a description of class PI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */ // next closest = (52163/16604)
public class PI{
    public static void main(String[] args){
        Fraction MILU = new Fraction ( 355, 113 );
        final double EPSILON = Math.abs ( Math.PI - MILU.toDouble() );
        Fraction myFraction = new Fraction (355, 113);
        while(Math.abs( Math.PI - myFraction.toDouble() ) >= EPSILON ){  
            if(Math.PI > myFraction.toDouble()){
                int numerator = myFraction.getNum() +1;
                myFraction.setNum(numerator);
            }else if(Math.PI < myFraction.toDouble()){
                int denominator = myFraction.getDenom()+1;
                myFraction.setDenom(denominator);
            } 
        }
        System.out.println("Next closest fraction to PI = " + myFraction );
    }
}
