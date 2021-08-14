import java.util.Iterator;

public class Banco_dados {
	private Conta[] lista_contas;
	
	public void addConta(Conta conta)
	{
		int insert_index = 0;
		
		for (int i = 0; i < this.lista_contas.length; i++) {
			if(this.lista_contas[i] == null)
			{
				insert_index = i;
				continue;
			}
			
			if(this.lista_contas[i].cpf == conta.cpf)
			{ 
				return; //sai da funcao
			}
		}
		
		this.lista_contas[insert_index] = conta;
		
	}

	public Banco_dados(Conta[] lista_contas) {
		super();
		this.lista_contas = lista_contas;
	}
	
	public void Imprimir_contas()
	{
		for (int i = 0; i < this.lista_contas.length; i++) {
			if(this.lista_contas[i] != null)
			{
				System.out.println(this.lista_contas[i].cpf);
			}
					
			
		}
	}

}
