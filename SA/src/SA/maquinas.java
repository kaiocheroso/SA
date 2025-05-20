package SA;
import java.util.*;
public class maquinas {
	static Scanner entrada = new Scanner(System.in);
	static ArrayList<Integer> maquinas = new ArrayList<>();
	static ArrayList<String> setores = new ArrayList<>();
	static ArrayList<Integer> pecas = new ArrayList<>();
	
	public static void main(String[] args) {
		System.out.println("Digite o numeros de setores");
		int valor = entrada.nextInt();
		int i = 0;
		while (i < valor) {
			entrada.nextLine();
			System.out.println("Digite o nome do setor: ");
			String setor = entrada.nextLine();
			setores.add(setor);
			i++;
		}
		
			
		
	}
	//public static void main(String[] args) {
		//int[][] matrix = int[maquinas.size()][5];
		//System.out.println("Digite o nome do setor: ");
		//String setor = entrada.nextLine();
		//setores.add(setor);
		//for (int i = 0; i < setores.size();i++) {
		//	System.out.println("Setor " +setores.get(i));
		//	for(int j = 0; j < maquinas.size();j++) {
		//		System.out.prinltn("Maquina "+(j+1));
		//		for
		//	}
		//}
		
			
		
	}
	

	//public static void main(String[] args) {
	//	Scanner entrada = new Scanner(System.in);
	//}

//}
