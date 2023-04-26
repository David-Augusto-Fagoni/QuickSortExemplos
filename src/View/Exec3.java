package View;
import Controller.Ordenacoes;
public class Exec3 {

	public static void main(String[] args) {
		int[] VT = {99, 98, 97, 96, 95, 94, 93, 92, 91};
		Ordenacoes O = new Ordenacoes();
		
		VT = O.quickSort(VT, 0, VT.length-1);
		for (int J = 0;J< VT.length;J++) {
			System.out.println(VT[J]);
		}

	}

}
