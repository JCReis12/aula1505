package vetores;
import java.util.Scanner;

public class Vet {

	public static void main(String[] args) {
		Scanner jc = new Scanner (System.in);
		
		int v[] = new int [5];
		
		for (int i = 0; i<5; i++) {
			System.out.println("Informe um valor"+i+"...:");
			v[i]=jc.nextInt();
		}
		
		for (int i = 0; i<5; i++) {
			System.out.println(v[i]);
		}
		
		
		
		
	}

}
