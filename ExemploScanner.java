import java.util.Scanner;
class ExemploScanner{
	public static void main(String[] args){
		String s = "";
		int x = 0;
		double r = 0.0;
		char a = '0';
		Scanner entrada = new Scanner(System.in);
	        x = entrada.nextInt();
       		r = entrada.nextDouble();
 		a = entrada.next().charAt(0);
		s = entrada.next();
		System.out.println(x);
		System.out.println(s);
		System.out.println(r);
		System.out.println(a);
	}
}	
