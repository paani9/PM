package rtp;
class Amazon
{
  void shopping()
  {
	  System.out.println("shopping");
	  
  }
}
class Eledev extends Amazon
{ void shopping()
	{
	 System.out.println("Mobiles,Laptops.....");
	}
}
class Fasbea extends Amazon
{ void shopping()
	{
	System.out.println("Women's Fashions,Men's Fashoins,Beauty products.....");
	
	}
}
class Grofood extends Amazon
{ void shopping()
	{ 
	System.out.println("Beverages,Dry fruits,snacks,Breakfast essentials.....");
	}
}
class Sim
{ static void amsim(Amazon a1)
	{
	a1.shopping();
	}
	

}
public class Rtp3 {
	public static void main(String[] args)
	{
Eledev e=new Eledev();
Fasbea f=new Fasbea();
Grofood g=new Grofood();
Sim.amsim(e);
Sim.amsim(f);
Sim.amsim(g);
	}
}




