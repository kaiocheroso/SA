package sa;
import java.util.*;
public class main {
	public static void main(String [] args) {
		ArrayList<Integer> produçao = new ArrayList<>();
		ArrayList<Integer> setorProduçao = new ArrayList<>();
		ArrayList<String> diasSemana = new ArrayList<>();
		diasSemana.addAll(Arrays.asList("Segunda: ", "Terça: ","Quarta: ","Quinta: ","Sexta: "));
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero de setores: ");
		int Setores = entrada.nextInt();
		System.out.println("Digite o numero de maquinas por setor: ");
		int maquinas = entrada.nextInt();
		int produtoSetores = 0;
		int valor = 0;
		int [][] matrix = new int[maquinas*Setores][5]; 
		
		for(int i = 0; i < Setores;i++) {
			System.out.println("Setor "+(i+1));
			for(int j = 0;j < maquinas; j++) {
				System.out.println("Produção maquina "+(j+1));
				for(int a = 0; a < 5;a++) {
					System.out.print(diasSemana.get(a));
					int produto = entrada.nextInt();
					valor += produto;
					matrix[j][a] = produto; 
				}
				produçao.add(valor);
				
				produtoSetores += valor;
				valor = 0;
			}
			setorProduçao.add(produtoSetores);
			produtoSetores = 0;
		}
		
		for(int t = 0; t < produçao.size();t++) {
			System.out.println("Maquina "+(t+1)+" produção " + produçao.get(t));
		}
		
		for(int n = 0; n < setorProduçao.size();n++) {
			System.out.println("Produção do Setor "+(n+1));
			System.out.println("Produção: "+(setorProduçao.get(n)));
		}
		
		for (int b = 0; b < (maquinas*Setores);b++) {
			for(int c = 0; c < 5;c++) {
				System.out.println("Maquina "+(b+1)+" produção " + matrix[b][c]);
			}
		
		}
		
	}
}
