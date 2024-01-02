
package lab.pkg06;


public class Fraction {
    private int numerator;
    private int denominator;
    
    Fraction(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
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

    @Override
    public String toString() {
        return "Fraction{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }
    
    public void add(Fraction fraction){
        int d=denominator*fraction.denominator;
        int n=numerator*fraction.denominator+fraction.numerator*denominator;
        System.out.print(n+"/"+d);
    }
    
    public void sub(Fraction fraction){
        int d=denominator*fraction.denominator;
        int n=numerator*fraction.denominator-fraction.numerator*denominator;
        System.out.print(n+"/"+d);
    }
    
    public void mul(Fraction fraction){
        int d=denominator*fraction.denominator;
        int n=numerator*fraction.numerator;
        System.out.print(n+"/"+d);
    }
    
    public void div(Fraction fraction){
        int n=numerator*fraction.denominator;
        int d=denominator*fraction.numerator;
        System.out.print(n+"/"+d);
    }
}
