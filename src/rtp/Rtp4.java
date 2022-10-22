package rtp;
class Stories
{ void story()
	{System.out.println("Stories");
}

}
class Ms extends Stories
{void story()
	{System.out.println("True Wealth, The ship.....");
}
}
class As extends Stories
{ void story()
	{
	System.out.println("The clever crab,The mouse,.....");
	
	}
}
class Simul
{ static void st (Stories s)
	{
	s.story();
	}
}

public class Rtp4 {
	public static void main(String[] args)
	{ 
		Ms m=new Ms();
		As a=new As();
		Simul.st(m);
		Simul.st(a);
	}

		
	}


