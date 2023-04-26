package View;
import Controller.Ordenacoes;
public class Exec1 {

	public static void main(String[] args) {
		int[] VT = {89, 54, 18, 71, 93, 45, 19, 14, 99, 2, 27, 3, 58, 91, 75};
		Ordenacoes O = new Ordenacoes();
		
		VT = O.quickSort(VT, 0, VT.length-1);
		for (int J = 0;J< VT.length;J++) {
			System.out.println(VT[J]);
		}

	}

}
