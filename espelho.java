import java.io.*;
import java.nio.charset.*;
import java.util.Scanner;
class espelho{
	public static void main(String[] args){
		int i = 0;
		int cont = 0;
		int x = 0;
		StringBuilder b = new StringBuilder();
		String c ="";
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		i = sc.nextInt();
		x = sc.nextInt();
		cont = i;
		while(cont<=x)
		{
		System.out.print(cont);
		cont++;
		}
		while(cont>i)
		{
			cont--;
			int y = 0;
			c = String.valueOf(cont);
			for(y = c.length()-1;y>=0;y--)
			{
			   b.append(c.charAt(y));
			}
			c = b.toString();
		}
		System.out.print(c);
		b.setLength(0);
		System.out.print("\n");
}
sc.close();
	}
}

