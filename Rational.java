/*
Team Irrational - James Hua, Ruochong Wu
APCS1 pd10
HW32 -- Irrationality Stops Here
2015-11-17
*/

public class Rational{
    private int Num;
    private int Den;

    public Rational(){
	Num = 0;
	Den = 1;
    }

    public Rational(int num, int denom){
	Num = num;
	Den = denom;
    }
    
    public int getNum(){
	return Num;
    }

    public int getDen(){
	return Den;
    }

    public String toString(){
	return Num + "/" + Den;
    }

    public double floatValue(){
	return (double)Num/Den;
    }

    public void multiply(Rational x){
	this.Num = this.Num * x.getNum();
	this.Den = this.Den * x.getDen();
    }

    public void divide(Rational x){
	this.Num = this.Num * x.getDen();
	this.Den = this.Den * x.getNum();
    }
}
	
