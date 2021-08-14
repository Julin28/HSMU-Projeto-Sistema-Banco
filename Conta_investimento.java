
public class Conta_investimento extends Conta {

	public Conta_investimento(String nome, String cpf, int agencia, int numero_conta, double saldo) {
		super(nome, cpf, agencia, numero_conta, saldo);
		// TODO Auto-generated constructor stub
	}
	
	
	public void sacar(double saida)
	{
		if(saida > 2*this.saldo)
		{ 
			System.out.println("Saldo insuficiente. Voce possui" + this.saldo + "de saldo");
		}
		else 
		{ 
			this.saldo -= saida;
		}
	}
	
	
	public void depositar(double entrada)
	{
		this.saldo += entrada + 0.01*entrada;
		
	}

}
