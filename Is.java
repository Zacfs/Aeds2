import java.io.*;
import java.nio.charset.*;
class Is{
	public static void main(String[] args){
		String s = "";
		InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader c = new BufferedReader(inStream);
			while(!(s.length() == 3 && s.charAt(0)== 'F' && s.charAt(1)=='I' && s.charAt(2)=='M'))
			{
				
					try {
					s = c.readLine(); // Ler entrada
					if(!(s.length() == 3 && s.charAt(0)== 'F' && s.charAt(1)=='I' && s.charAt(2)=='M'))
					{
						print(s); // Imprimir saída caso não FIM
					}
					}
					 catch (IOException e) {
        System.out.println("fail");
    }
				
			}
		
	}	
public static boolean vogal(String s, int x) //Verificar vogais
{
	boolean v = true;
	while(x<s.length() && v)
	{
			if(!(s.charAt(x) == 'a' || s.charAt(x) == 'e' || s.charAt(x) == 'o' || s.charAt(x) == 'u' || s.charAt(x) == 'i'))
			{
				v = false;
			}
			else
			{
				vogal(s, ++x);
			}
	}
	return(v);
}
public static boolean cons(String s,int x)  //Verificar consoantes
{
	boolean v = true;
	while(x<s.length() && v)
		{
			if(s.charAt(x) == 'a' || s.charAt(x) == 'e' || s.charAt(x) == 'o' || s.charAt(x) == 'u' || s.charAt(x) == 'i' || !(Character.isLetter(s.charAt(x))))
			{
				v = false;
			}
			else
			{
				cons(s, ++x);
			}
	}
	return(v);
}
public static boolean isInt(String s, int x) //Verificar int
{
	boolean v = true;
	while(x<s.length() && v)
	{
		if(!('0' <= s.charAt(x)&& s.charAt(x) <= '9'))
		{
				v = false;
		}
		else
			{
				isInt(s, ++x);
			}
	}
	return(v);
}
public static boolean isDouble(String s, int x) //Verificar double
{
	boolean v = true;
	int y = 0;
	if(!('0' <= s.charAt(x)&& s.charAt(x) <= '9' || s.charAt(x) == ',' || s.charAt(x) == '.' ))
		{
				v = false;
		}
		if(s.charAt(x) == ',' || s.charAt(x) == '.')
		{
			y++;
			if(y>1)
			{
				v = false;
			}
		}
	while(x<s.length() && v)
	{
		isDouble(s, ++x);
	}
	return(v);
}
public static void print(String s) //Método para imprimir saídas por método
{
		if(vogal(s,0))
			{
				System.out.print("SIM ");
			}
			else
			{
				System.out.print("NAO ");
			}
			if(cons(s,0))
			{
				System.out.print("SIM " );
			}
			else
			{
				System.out.print("NAO ");
			}
			if(isInt(s,0))
			{
				System.out.print("SIM ");
			}
			else
			{
				System.out.print("NAO ");
			}
			if(isDouble(s,0))
			{
				System.out.print("SIM\n");
			}
			else
			{
				System.out.print("NAO\n");
			}
}
}

