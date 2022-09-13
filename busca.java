import java.util.*;
import java.io.*;
import java.nio.*;
public class busca{
	public static void main(String[] args)
	{		
		int x = 0;
		Scanner a = new Scanner(System.in);
		int y = 0;
		while(a.hasNext())
		{
			x = a.nextInt();
			y = 4*x;
			System.out.println(y);
		}		
	}
}
