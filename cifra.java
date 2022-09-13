import java.io.*;
import java.nio.charset.*;
class cifra{
	public static void main(String[] args){
		String s = "";
		InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader c = new BufferedReader(inStream);
		StringBuilder b = new StringBuilder();
		while(!(s.length() == 3 && s.charAt(0)== 'F' && s.charAt(1)=='I' && s.charAt(2)=='M'))
	    {
			try {
       
			s = c.readLine();
			if(!(s.length() == 3 && s.charAt(0)== 'F' && s.charAt(1)=='I' && s.charAt(2)=='M'))
			{
		for(int x = 0; x<s.length(); x++)
		{
			b.append((char)(s.charAt(x)+3));
		}
		s = b.toString();
		b.setLength(0);
		System.out.println(s);
			}
	    }
    catch (IOException e) {
        System.out.println("fail");
    }
			}
	    
	}
}	
