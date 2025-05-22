package sa;
import java.util.*;
public class main {
	static ArrayList<Integer> produçao = new ArrayList<>();
	static ArrayList<Integer> setorProduçao = new ArrayList<>();
	static ArrayList<String> diasSemana = new ArrayList<>(Arrays.asList("Segunda: ", "Terça: ","Quarta: ","Quinta: ","Sexta: "));
	
	//variaveis
	static int Setores = 0;
	static int maquinas = 0;
	static int [][] matrix;
	static int produtoSetores = 0;
	static int valor = 0;
	static int valor1 = 0;
	
	public static void informar(Scanner entrada) {
		
		System.out.println("Digite o numero de setores: ");
		Setores = entrada.nextInt();
		System.out.println("Digite o numero de maquinas por setor: ");
		maquinas = entrada.nextInt();
		produtoSetores = 0;
		valor = 0;
		valor1 = 0;
		matrix = new int[maquinas*Setores][5]; 
		
		for(int i = 0; i < Setores;i++) {
			System.out.println("Setor "+(i+1));
			for(int j = 0;j < maquinas; j++) {
				System.out.println("Produção maquina "+(j+1));
				for(int a = 0; a < 5;a++) {
					System.out.print(diasSemana.get(a));
					int produto = entrada.nextInt();
					valor += produto;
					matrix[valor1][a] = produto; 
				}
				valor1 = valor1+1;
				produçao.add(valor);
				
				produtoSetores += valor;
				valor = 0;
			}
			setorProduçao.add(produtoSetores);
			produtoSetores = 0;
		}
	}
	
	public static void executar(int maquinas, int Setores, int [][]matrix) {
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
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		
		do {
			System.out.println("-----Menu-----");
			System.out.println("1-Informar dados");
			System.out.println("2-Analizar dados");
			System.out.println("3-Sair");
			opcao = entrada.nextInt();
			switch (opcao){
			case 1: informar(entrada);break;
			case 2: executar(maquinas, Setores, matrix); break;
			case 3: System.out.println("Saindo..."); break;
			default: System.out.println("Opcão inválida"); break;
			}
		}while(opcao != 3);
		
	}
	
}
