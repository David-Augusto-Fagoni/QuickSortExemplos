package View;
import Controller.Ordenacoes;
public class Exec2 {

	public static void main(String[] args) {
		int[] VT = {12, 13, 14, 15, 51, 53, 57, 25, 26, 27, 90};
		Ordenacoes O = new Ordenacoes();
		
		VT = O.quickSort(VT, 0, VT.length-1);
		for (int J = 0;J< VT.length;J++) {
			System.out.println(VT[J]);
		}

	}

}
