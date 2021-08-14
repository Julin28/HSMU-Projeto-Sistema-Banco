
public class Conta {
	protected String nome;
	protected String cpf;
	protected int agencia;
	protected int numero_conta;
	protected double saldo;
	
	
	public Conta(String nome, String cpf, int agencia, int numero_conta, double saldo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.agencia = agencia;
		this.numero_conta = numero_conta;
		this.saldo = saldo;
	}

	public void sacar(double saida)
	{
		if(saida > this.saldo)
		{ 
			System.out.println("Saldo insuficiente. Voce possui " + this.saldo + " de saldo");
		}
		else 
		{ 
			this.saldo -=  saida;
		}
	}
	
	public void depositar(double entrada)
	{	
		this.saldo += entrada;
	}
	
	
	public double getSaldo()
	{
		return this.saldo;
	}
	

}
