
/* Zalozenie:
 - WALEC;
 - Promien ustawiamy w konstruktorze zar�wno jak ilosc pkt�w losowanie random byloby nie poprawne z teoria,
 - Zdefiniowane metody do liczenia Ix, Iz oraz Tw steinera,
 - tw steinera uzywamy wywolujac metode w kt�rej jako parametr podajemy odgleglosc przesuniecia osi.



*/
public class Bryla {

	private double height;
	@SuppressWarnings("unused")
	private double width;
	
	private Pkt[] punkt;//tworzymy tablice obiektów klasy Pkt
	private int iloscPktow;
	private double ix;
	private double masa;
	private double promien;
	private double iz;
	private double steinerIx;
	private double steinerIz;
	double odlegosc;
	
	// konstruktor zawierajacy parametry, ile obiektów ma stworzyc, oraz jaki promień maja miec wszystkie pkty
	public Bryla(double promien,int iloscPktow)
	{
		punkt = new Pkt[this.iloscPktow = iloscPktow];
		
		for(int i = 0; i < punkt.length; i++)
		{
			punkt[i] = new Pkt(this.promien = promien,Math.random());
		}
	
	}
	
	public int getIlosc()
	{
		return this.iloscPktow;
	}
	
	public void calcMasa()
	{
		for(int i = 0; i < punkt.length; i++)
		{
			this.masa += (punkt[i].getMasa())*getIlosc();
		}
	}
	
	public void calcHeight()
	{
		for(int i = 0; i < punkt.length; i++)
		{
			this.height += 2*(punkt[i].getR())*getIlosc();
		}
	}
	public double getHeight()
	{
		return this.height;
	}
	public double getMasa()
	{
		return this.masa;
	}
	private double getPromien()
	{
		return this.promien;
	}
	
	//Ix = Iy(z teori)
	public void calcIx()
	{
		this.ix = ((3*Math.pow(2, 2) + Math.pow(this.height,2))*getMasa())/12;
	}
	public double getIx()
	{
		return this.ix;
	}
	//Iz
	
	public void calcIz()
	{
		this.iz = (getMasa()*getPromien())/12 ;
	}
	public double getIz()
	{
		return this.iz;
	}
	
	public void twSteineraIx(double odlegosc)
	{
		
		this.steinerIx = getIx() + Math.pow(odlegosc,2)*getMasa();
	}
	public double getSIx()
	{
		return this.steinerIx;
	}
	
	public void twSteineraIz(double odlegosc)
	{
		this.steinerIz = getIz() + Math.pow(odlegosc, 2)*getMasa();
	}
	public double getSIz()
	{
		return this.steinerIz;
	}
}
