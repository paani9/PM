package rtp;
class Countries
{ void currency()
	{ System.out.println("Currency type");
	}
	
}
class India extends Countries
{void currency()
	{System.out.println("Rupee");
	
	}
}
class America extends Countries
{void currency()
	{System.out.println("Dollar");
	
	}
}
class Simula
{ static void cusim(Countries c)
	{ c.currency();
	
}
}
public class Rtp5 {
public static void main(String[] args)
{ 
	India i=new India();
	America a=new America();
	Simula.cusim(i);
	Simula.cusim(a);
}
}
