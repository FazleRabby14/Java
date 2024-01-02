
public class Fraction {
    private int numerator;
	private int denominator;

	
	public Fraction (int numerator, int denominator) {
		
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
	
	public void add(Fraction f) {
		
		int d=denominator*f.denominator;
		int n=numerator*f.denominator+f.numerator*denominator;
		System.out.print(n+"/"+d);
		
	}
        
        public void sub(Fraction f) {
		
		int d=denominator*f.denominator;
		int n=numerator*f.denominator-f.numerator*denominator;
		System.out.print(n+"/"+d);
		
	}
        
             public void mul(Fraction f) {
		
		int d=denominator*f.denominator;
		int n=numerator*f.numerator;
		System.out.print(n+"/"+d);
		
	}
            
              public void div(Fraction f) {
		
		int d=f.numerator*denominator;
		int n=numerator*f.denominator;
		System.out.print(n+"/"+d);
		
	}
	
	
}
