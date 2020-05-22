
public class ContaLimiteEspecial extends Conta {

	public ContaLimiteEspecial(String nomeCliente, String numero, double saldo, double limite) {
		super(nomeCliente, numero, saldo, limite);
	}
	
	public boolean sacar(double valor)
	{
		if( (getSaldo() - valor) < (-2*getLimite()) )
		{
			return false;
		}else {
			setSaldo(getSaldo() - valor);
			return true;
		}
			
	}

}
