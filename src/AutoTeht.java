
public class AutoTeht {

	public static void main(String[] args) {
		

	}

}

class Auto {
	//ominaisuudet
	public String merkki;
	public String malli;
	public int bensanMaara;
	
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
	
	
	}
	