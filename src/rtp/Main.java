package rtp;
class Telegram
{
	static void send(int no)
	{System.out.println("send no is"+no);
}

static void send(int no,String text)
{System.out.println("send no is "+no+" send text is "+text);
}

static void send(String text)
{System.out.println(" send text is "+text);
}
}

public class Main {
public static void main(String[] args)
{Telegram.send(24);
Telegram.send("Hello");
Telegram.send(20,"Hello");
}
}
