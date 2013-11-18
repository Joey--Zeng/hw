// Joey Zeng
// Per 9
// HW # 27
// 18-11-13

public class Rational{
    private int numerator;
    private int denominator; 
   
    public Rational(){
	numerator = 0;
	denominator = 1;
    }

    public Rational (int p, int q){
	numerator = p;
	denominator = q;
    }

    public String toString(){
	String retStr;
	retStr = numerator + "/" + denominator;
	return retStr;
    }

    public float floatValue() {
	return (float)numerator / (float)denominator ;
    }

    public void multiply(Rational a){
	numerator *= a.numerator;
	denominator *= a.denominator;
    }

    public void divide(Rational a){
	numerator *= a.denominator;
	denominator *= a.numerator;
    }

    public static void main(String[] args){
	/*       
	Rational a = new Rational(3, 4);
	Rational b = new Rational(1, 2);
	System.out.println(a);
	System.out.println(b);
	
	System.out.println(a.floatValue());
	a.multiply(b);
	System.out.println(a);
	a.divide(b);
	System.out.println(a);
	*/
    }

}// ends Rational
