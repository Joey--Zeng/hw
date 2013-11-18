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
    
    public void add(Rational a){
	if (denominator == a.denominator)
	    numerator += a.numerator;
	else{
	    numerator = (numerator * a.denominator) + (a.numerator * denominator);
	    denominator *= a.denominator;
	}
    }

    public void subtract(Rational a){
	Rational temp = new Rational(a.numerator*-1, a.denominator);
	add(temp);
    }

    public int gcd(){
	int a = Math.max(numerator, denominator);
	int b = Math.min(numerator, denominator);
	while (a%b != 0) {
	    int c = b;
	    b = a % b;
	    a = c;
	}
	return b;
    }

    public void reduce(){
	if (gcd() > 1){
	    int a = gcd();
	    numerator /= a;
	    denominator /= a;
	}
    }
    

    public static int gcd(int a, int b){
	if (b > a)
	    return gcd(b,a);
	else if (a%b != 0)
	    return gcd(b, a%b);
	else 
	    return b;
    }

    public int compareTo( Rational a){
	subtract(a);
	int ret = numerator;
	add(a);
	reduce();
	return ret;
    }
	    
    public static void main(String[] args){

	Rational a = new Rational(2, 4);
	Rational b = new Rational(1, 2);

	
	/*       
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
