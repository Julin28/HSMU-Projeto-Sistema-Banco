import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Conta[] lista_contas = {null, null, null}; 
		
		Conta_investimento julio_i = new Conta_investimento("Júlio Leandro Correia", "478.418.278-06", 0102 , 20345, 0);
		Conta_corrente julio_c = new Conta_corrente("Júlio Leandro Correia", "478.418.278-06", 0103 , 20346, 0);
		Conta_corrente tiago_c = new Conta_corrente(null, "4444.4.44..4", 0, 0, 0);
		Banco_dados yebanc = new Banco_dados(lista_contas);
		
		yebanc.Imprimir_contas();
		
		yebanc.addConta(tiago_c);
		
		yebanc.Imprimir_contas();
		
		yebanc.addConta(julio_c);
		
		yebanc.Imprimir_contas();
		
		julio_i.depositar(100);
		
		julio_i.sacar(25);
		
		System.out.println(julio_i.getSaldo());

	
		
		
		
		
		
		
		
	}

}
