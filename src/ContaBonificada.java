
public class ContaBonificada extends Conta {

	public ContaBonificada(String nomeCliente, String numero, double saldo, double limite) {
		super(nomeCliente, numero, saldo, limite);
	}
	
	public void depositar(double valor)
	{
		super.depositar(valor);
		double bonus = valor * 0.01;
		super.depositar(bonus);
	}
	
}
