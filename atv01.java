package vetores;
import java.util.Scanner;

public class atv01 {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		
		String v[] = new String [5];
		
		for (int i = 0; i<5; i++) {
			System.out.print("Informe um nome: ");
			v[i]=jc.next();
		}
		
		for (int i = 0; i<5; i++) {
			System.out.println(i+": "+v[i]);
		}
		
		
		
		
	}

}
