
public class Conta {
	private String nomeCliente;
	private String numero;
	private double saldo;
	private double limite;
	
	public Conta(String nomeCliente, String numero, double saldo, double limite) {
		super();
		this.nomeCliente = nomeCliente;
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}



	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public double getLimite() {
		return limite;
	}



	public void setLimite(double limite) {
		this.limite = limite;
	}



	public void depositar(double valor)
	{
		this.saldo = this.saldo + valor;
	}
	
	public boolean sacar(double valor)
	{
		if((this.saldo - valor) < (-1*limite))
		{
			return false;
		}else {
			this.saldo = this.saldo - valor;
			return true;
		}
			
	}
}
