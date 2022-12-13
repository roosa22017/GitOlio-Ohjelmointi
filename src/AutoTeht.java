
public class AutoTeht {

	public static void main(String[] args) {
		
		Auto olio1 = new Auto();
		olio1.merkki = "Audi";
		olio1.malli = "A5";
		olio1.bensanMaara = 3;
		
		olio1.naytaTiedot();
		olio1.kiihdyta();
		olio1.naytaTiedot();
		olio1.tankkaa(6);
		
		Auto olio2 = new Auto("BMW", "E87", 10);
		olio2.naytaTiedot();
	
	}

}

class Auto {
	//ominaisuudet
	public String merkki;
	public String malli;
	public int bensanMaara;
	
	public Auto()
	{
		merkki = "";
		malli = "";
		bensanMaara = 0;
	}
	
	public Auto(String merkki, String malli, int bensanMaara)
	{
		this.merkki = merkki;
		this.malli = malli;
		this.bensanMaara = bensanMaara;
	}
	
	public void jarruta()
	{
		System.out.println("Auto jarruttaa.");
	}
	
	public void kiihdyta()
	{
		if (bensanMaara > 0)
		{	
		System.out.println("Auto kiihtyy.");
		bensanMaara = bensanMaara-1;
		}
	}
	
	public void naytaTiedot()
	{
		System.out.println("Auto on " + merkki + " " +  malli + " ja bensaa on jäjellä " +  bensanMaara);
	}
	
	public void tankkaa(int bensaaLisaa)
	{
		System.out.println("Tankissa bensaa: " + bensanMaara);
		System.out.println("Tankkaus: " + bensaaLisaa);
		System.out.println("Tankissa bensaa tankkauksen jälkeen: " + (bensanMaara + bensaaLisaa));
	}
	
}
	