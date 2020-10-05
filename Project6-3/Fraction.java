/* Fraction.java
Manage a student's name and three test scores.
*/
public class Fraction extends Student {

   //Instance variables
   //Each student object has a name and three test scores
   private String name;             //Student name
   private int numerator;               //Score on test 1
   private int denominator;               //Score on test 2


   // Default constructor -- initialize name to the empty string and
   // the test scores to zero.
   public Fraction(){
      name = "";
      numerator = 0;
      denominator = 0;

   }
   
      
   // Additional constructor -- initialize the name and test scores
   // to the values provided.
   public Fraction(int numr, int denr){
      numerator = numr;
      denominator = denr;

   }
    
   // Additional constructor -- initialize the name and test scores
   // to match those in the parameter s.
   public Fraction(Fraction s){
      name = s.name;
      numerator = s.numerator;
      denominator = s.denominator;

   }
    
   //Other methods

   public void setName (String nm){
   //Set a student's name
      name = "";
   }
    
   public String getName (){
   //Get a student's name
      return name;
   }
  
    public int getNumerator() {
    return numerator;
    }
 
    public void setNumerator(int numerator) {
    this.numerator = numerator;
    }
 
    public int getDenominator() {
    return denominator;
    }
 
    public void setDenominator(int denominator) {
    this.denominator = denominator;
    }

    public Fraction add(Fraction fractionTwo) {
    int numer = (numerator * fractionTwo.getDenominator()) + 
                            (fractionTwo.getNumerator() * denominator);
    int denr = denominator * fractionTwo.getDenominator();
    return new Fraction(numer, denr);
    }
   
   public Fraction subtract(Fraction fractionTwo) {
        int newNumerator = (numerator * fractionTwo.denominator) - 
                                 (fractionTwo.numerator * denominator);
    int newDenominator = denominator * fractionTwo.denominator;
    Fraction result = new Fraction(newNumerator, newDenominator);
    return result;
    }
    
   public Fraction multiply(Fraction fractionTwo) {
    int newNumerator = numerator * fractionTwo.numerator;
    int newDenominator = denominator * fractionTwo.denominator;
    Fraction result = new Fraction(newNumerator, newDenominator);
    return result;
        }
    
   public Fraction divide(Fraction fractionTwo) {
    int newNumerator = numerator * fractionTwo.getDenominator();
    int newDenominator = denominator * fractionTwo.numerator;
    Fraction result = new Fraction(newNumerator, newDenominator);
    return result;
    }
    public String toString() {
        String str;
      str = this.numerator + "/" + this.denominator;
    
      return str;
    
    }
}