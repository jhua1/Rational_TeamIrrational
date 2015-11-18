public class Driver{
    public static void main(String[] args){
	
	Rational r = new Rational(2,3);
	//Testing that everything in r is fine and multiplication

	System.out.println("=====Tests for multiplication=====");
	
	System.out.println("=====Tests for r=====");
	System.out.println(r.toString());
	System.out.println(r.floatValue());
	System.out.println("Numerator: " + r.getNum());
	System.out.println("Denominator: " + r.getDen());
	
	Rational s = new Rational(1,2);

	System.out.println("======Multiplying r by s======");
	r.multiply(s);
	System.out.println("======Checking r======");
	System.out.println("Numerator: " + r.getNum());
	System.out.println("Denominator: " + r.getDen());
	System.out.println(r.toString());
	System.out.println(r.floatValue());
	//Checking s is still the same
	System.out.println("======Checking s======");
	System.out.println("Numerator: " + s.getNum());
	System.out.println("Denominator: " + s.getDen());

	
	//Checking functionality of division
       
	System.out.println("=====Tests for division=====");

	Rational a = new Rational(2,3);
	
	System.out.println("=====Tests for a=====");
	System.out.println(a.toString());
	System.out.println(a.floatValue());
	System.out.println("Numerator: " + a.getNum());
	System.out.println("Denominator: " + a.getDen());
	
	Rational b = new Rational(1,2);

	System.out.println("======Dividing a by b======");
	a.divide(b);
	System.out.println("======Checking a======");
	System.out.println("Numerator: " + a.getNum());
	System.out.println("Denominator: " + a.getDen());
	System.out.println(a.toString());
	System.out.println(a.floatValue());
	//Checking s is still the same
	System.out.println("======Checking s======");
	System.out.println("Numerator: " + b.getNum());
	System.out.println("Denominator: " + b.getDen());

	
    }
}
