package rtp;

class Fruit
{ void colour()
	{
	System.out.println("colour");
	
	}
}

class Apple extends Fruit
{ void colour()
	{	System.out.println("Red");

     }
}
class Banana extends Fruit
{ void colour()
{	System.out.println("Yellow");

}
}
class Watermelon extends Fruit
{ void colour()
{	System.out.println("Green");

}
}
class Stimulator
{static void ansim(Fruit f1)
	{
	f1.colour();
	
	}
}
public class Rtp1
{public static void main(String[] args)
	{ Apple a1=new Apple();
	  Banana b1=new Banana();
	  Watermelon w1=new Watermelon();
	  
	 Stimulator.ansim(a1);
	 Stimulator.ansim(b1);
	 Stimulator.ansim(w1);
	 
	}
}
	


