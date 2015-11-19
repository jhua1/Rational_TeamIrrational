/*
Team Irrational - Shanjeed Ali, James Hua
APCS1 pd10
HW32 -- Do You Even Add, Bro?
2015-11-18
*/
//
public class Rational{
    private int Num;
    private int Den;

//Constructors 
    public Rational(){
	Num = 0;
	Den = 1;
    }

    public Rational(int num, int denom){
	Num = num;
	Den = denom;
    }
    
    
    //Accessors for numerator and denominator
    public int getNum(){
	return Num;
    }

    public int getDen(){
	return Den;
    }

    //String representation of the rational number

    public String toString(){
	return Num + "/" + Den;
    }

    //Floating point value representation of the rational number

    public double floatValue(){
	return (double)Num/Den;
    }

    //Multiplication and Division methods

    public void multiply(Rational x){
	this.Num = this.Num * x.getNum();
	this.Den = this.Den * x.getDen();
    }

    public void divide(Rational x){
	this.Num = this.Num * x.getDen();
	this.Den = this.Den * x.getNum();
    }

    //PHASE TWO

    //Euclid's Algorithm
    public int gcdER(int a, int b) {
	if (b > a) {return gcdER(b, a);} // Make the integers (larger,smaller)
	if (a % b == 0) { // If larger/smaller is 0
	    return b;     // Return smaller
	}
	return gcdER(a % b, b); // Recursion: Euclidean Algorithm on (remainder, smaller)
    }

    
    //Addition
    public void add(Rational x){
	//These two lines are the extra factors needed to reach the lowest common denominator of the denominators
	int multleft = x.Den/gcdER(this.Den, x.Den);
	int multright = this.Den/gcdER(this.Den, x.Den);
	this.Num = this.Num*multleft + x.Num*multright;
	this.Den = this.Den*multleft; //Making the denominator the LCD
    }

    //Subtraction
    public void subtract(Rational x){
	//This method is the same as add except you subtract the numerator
	int multleft = x.Den/gcdER(this.Den, x.Den);
	int multright = this.Den/gcdER(this.Den, x.Den);
	this.Num = this.Num*multleft - x.Num*multright;
	this.Den = this.Den*multleft; //Making the denominator the LCD
    }
    
    public static int gcd(){
	return gcdER(Num, Den);
    }

    public void reduce(){
	int commondiv = gcd();
	Num /= commondiv;
	Den /= commondiv;
    }
    
}
	
