
public class Pkt {
/*
Zalozenia:
-W konstruktorze ustawiamy mase,promien
-Metody pozwalajace wylizcyc moment bezwladnosci, przed i po tw steinera
- Metody zwracajace mase promien oraz takie ktore ustawiaja te wartosci
*/
	private double masa;
	private double r;
	private double mBez = 0;
	private double twSteiner;
	public Pkt()
	{
		this.r = 10;
		this.masa = 10;
	}
	
	public Pkt(double masa, double r)
	{
		this.masa = masa;
		this.r = r;
	}
	
	public void setMasa(double masa)
	{
		this.masa = masa;
	}
	
	public void setR(double r)
	{
		this.r = r;
	}
	
	public double getMasa()
	{
		return this.masa;
	}
	
	public double getR()
	{
		return this.r;
	}
	
	public void momentBezwladnosci()
	{
		this.mBez = masa*Math.pow(r, 2);
	}
	
	public double getMoment()
	{
		return this.mBez;
	}
	
	public void getInfo()
	{
		System.out.println("Pkt o masie : " + getMasa() + " O promieniu : " + getR() + " Ma moment bezw³adnosci : " +getMoment() );
	}
	
	public void twSteinera(double odlegosc)
	{
		this.twSteiner = this.mBez + (this.masa * Math.pow(odlegosc, 2));
	}
	
	public void getTwSteinera()
	{
		System.out.println("Po zastosowaniu tw steinera ma moment bezwladnosci rowny : " +this.twSteiner);
	}
}
