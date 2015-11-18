/*
Team Irrational - James Hua, Ruochong Wu
APCS1 pd10
HW32 -- Irrationality Stops Here
2015-11-17
*/

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

    //Decimal representation of the rational number

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
}
	
