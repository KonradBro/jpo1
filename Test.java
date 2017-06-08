
public class Test {
static Pkt punkcik1;
static Pkt punkcik3;
static Bryla bryla;
	public static void main(String[] args) {
	
		punkcik3 = new Pkt();
		punkcik3.momentBezwladnosci();
		punkcik3.getInfo();
		
		punkcik1 = new Pkt(10,90);
		punkcik1.momentBezwladnosci();
		punkcik1.twSteinera(19.9);
		punkcik1.getInfo();
		punkcik1.getTwSteinera();
		//zmiana masy za pomoca akcesora
		punkcik1.setMasa(20);
		punkcik1.momentBezwladnosci();
		punkcik1.twSteinera(19.9);
		punkcik1.getInfo();
		punkcik1.getTwSteinera();
		
		//tworzenie obiektu bryla klasy Bryla
		bryla = new Bryla(9,20);
		
		Pkt[] punkcik2 = new Pkt[6]; // tablica 6 obiektow klasy pkt
		
		
		
		
		for(int i = 0; i<punkcik2.length; i++)
		{
			punkcik2[i] = new Pkt(Math.random()*20,Math.random()*20); // losowanie wartosci promienia i masy ( zeby nie bylo nudno)
		}
		
		for(int i =0; i<punkcik2.length;i++) // stosowanie metod dla poszczegolnych obiektow
		{
			punkcik2[i].momentBezwladnosci();
			punkcik2[i].getInfo();
			punkcik2[i].twSteinera(Math.random());
			punkcik2[i].getTwSteinera();
		}
		
		bryla.calcHeight();
		bryla.calcMasa();
		bryla.calcIx();
		bryla.calcIz();
		//info o bryle
		System.out.println("Wysokosc bryly rowna sie : " + bryla.getHeight() +  " Moment bezwladnosci Ix  : " +bryla.getIx() + " Moment bezwladnosci Iz : " +bryla.getIz());
		
		// tw steinera dla bryly 
		bryla.twSteineraIx(20);
		bryla.twSteineraIz(30);
		//wypis tw sterinera
		System.out.println("Po zastosowaniu tw steinera momenty bezwladnosci wynosza : Ix steiner : " +bryla.getSIx() +  " Iz Steiner " +bryla.getSIz());
		
	}

}
