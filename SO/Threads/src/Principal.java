import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws Exception{
		 ArrayList<Character> data = new ArrayList<Character>();
		 Scanner ler = new Scanner(System.in);
		 while(true) {
			 System.out.print("digite: ");
			 char c = (char)System.in.read();
			 ler.nextLine();
			 data.add(c);
			 Thread letra = new ThreadLetra(data); 
			 Thread numero = new ThreadNumero(data);
			 numero.start();
			 letra.start();
			 System.out.println("-------");
			 System.out.println(data);
		 }
		 
	}
 
}
