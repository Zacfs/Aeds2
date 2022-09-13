import java.util.*;
import java.io.*;
import java.nio.*;
public class hall{
        public static void main(String[] args)
        {
                System.out.println("HALL OF MURDERERS");
                String x;
                int cont = 0;
                String[] murd = new String[100];
                String[] vic = new String[100];
                Scanner a = new Scanner(System.in);
                        while(a.hasNext())
                        {
                        murd[cont] = a.next();
                        if(!(murd[cont].charAt(0)=='F' && murd[cont].charAt(1) == 'I' && murd[cont].charAt(2) == 'M'))
                        {
                        vic[cont] = a.next();
                        cont++;
                        }
                        }
                        int cont2 = cont;
                        for(int i = 0;i<cont;i++)
                        {
                                for(int v = 0;v<cont;v++)
                                {
                                        if(murd[i].charAt(0) == vic[v].charAt(0) &&murd[i].charAt(1) == vic[v].charAt(1) && murd[i].charAt(2) == vic[v].charAt(2) )
                                        {murd[i] = "morto";
                                        cont2--;}
                                }
                        }
                                int cont3 = 0;
                                int cont4 = 0;
                                String[] murd2 = new String[cont2];
                                        while(cont3<cont2)
                                        {
                                        if(murd[cont4] != "morto")
                                        {
                                                murd2[cont3] = murd[cont4];
                                                System.out.println(murd[cont4]);
                                                System.out.println(murd2[cont3]);
                                                cont3++;
                                        }
                                        else
                                        {
                                                cont4++;
                                        }
                                        }
                                

                                int[] mor = new int[cont2];
                                for(int i = 0; i<cont2;i++)
                                {mor[i] = 1;}
                                                for(int y = 0; y<cont2; y++)
                                                {
                                                        for(int v = 0;v<cont2;v++)
                                                        {
                                                        if(murd2[y].charAt(0) == murd2[v].charAt(0) && murd2[y].charAt(1) == murd2[v].charAt(1) && murd2[y].charAt(2) == murd2[v].charAt(2))
                                                        {
                                                        mor[y] = mor[y]++;
                                                        }
                                                        }
                                                }
                                        for(int i = 0;i<cont2;i++)
                                        {
                                                System.out.println(murd2[i] + " " + mor[i]);
                                        }
                        a.close();
        }
}