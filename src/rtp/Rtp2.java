package rtp;
class Music
{ void songs()
	{System.out.println("songs");
	
	}
}
class Hindi extends Music
{ void songs()
	{System.out.println("Hindi songs");
	
	}
}
class English extends Music
{ void songs()
{System.out.println("English songs");

}
}
class Telugu extends Music
{ void songs()
	{System.out.println("Telugu songs");
	
	}
}
class Musim
{ static void musim(Music m1)
	{
	m1.songs();
	
	}
}


public class Rtp2 {
	public static void main(String[] args)
	{  Hindi h=new Hindi();
	   English e=new English();
	   Telugu t=new Telugu();
	   Musim.musim(h);
	   Musim.musim(e);
	   Musim.musim(t);
	}
}

	   
