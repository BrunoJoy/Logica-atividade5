public class Main {

	public static void main(String[] args) {
		System.out.println("-------------------Conta------------------------------");
		Conta c = new Conta("Jonas Araujo", "213", 100, 50);
		System.out.println("Saldo atual da conta de "+c.getNomeCliente()+ " é de: "+c.getSaldo());
		c.depositar(200);
		System.out.println("Saldo atual da conta de "+c.getNomeCliente()+ " é de: "+c.getSaldo());
		boolean resultado = c.sacar(360);
		if(!resultado)
		{
			System.out.println("Operação de saque não realizada.");
		}else
		{
			System.out.println("Operação de saque realizada com sucesso.");
		}
		System.out.println("Saldo atual da conta de "+c.getNomeCliente()+ " é de: "+c.getSaldo());
		boolean resultado2 = c.sacar(50);
		if(!resultado2)
		{
			System.out.println("Operação de saque não realizada.");
		}else
		{
			System.out.println("Operação de saque realizada com sucesso.");
		}
		System.out.println("Saldo atual da conta de "+c.getNomeCliente()+ " é de: "+c.getSaldo());
		
		
		
		System.out.println("-------------------Conta bonificada------------------------------");
		
		
		
		ContaBonificada cb = new ContaBonificada("João Batista", "400", 100, 50);
		System.out.println("Saldo atual da conta de "+cb.getNomeCliente()+ " é de: "+cb.getSaldo());
		cb.depositar(200);
		System.out.println("Saldo atual da conta de "+cb.getNomeCliente()+ " é de: "+cb.getSaldo());
		boolean resultado3 = cb.sacar(360);
		if(!resultado3)
		{
			System.out.println("Operação de saque não realizada.");
		}else
		{
			System.out.println("Operação de saque realizada com sucesso.");
		}
		System.out.println("Saldo atual da conta de "+cb.getNomeCliente()+ " é de: "+cb.getSaldo());
		boolean resultado4 = cb.sacar(50);
		if(!resultado4)
		{
			System.out.println("Operação de saque não realizada.");
		}else
		{
			System.out.println("Operação de saque realizada com sucesso.");
		}
		System.out.println("Saldo atual da conta de "+cb.getNomeCliente()+ " é de: "+cb.getSaldo());
		
		System.out.println("-------------------Conta limite especial------------------------------");
		
		
		
		ContaLimiteEspecial cls = new ContaLimiteEspecial("Marcone Soares", "789", 100, 50);
		System.out.println("Saldo atual da conta de "+cls.getNomeCliente()+ " é de: "+cls.getSaldo());
		cls.depositar(200);
		System.out.println("Saldo atual da conta de "+cls.getNomeCliente()+ " é de: "+cls.getSaldo());
		boolean resultado5 = cls.sacar(360);
		if(!resultado5)
		{
			System.out.println("Operação de saque não realizada.");
		}else
		{
			System.out.println("Operação de saque realizada com sucesso.");
		}
		System.out.println("Saldo atual da conta de "+cls.getNomeCliente()+ " é de: "+cls.getSaldo());
		boolean resultado6 = cls.sacar(50);
		if(!resultado6)
		{
			System.out.println("Operação de saque não realizada.");
		}else
		{
			System.out.println("Operação de saque realizada com sucesso.");
		}
		System.out.println("Saldo atual da conta de "+cls.getNomeCliente()+ " é de: "+cls.getSaldo());

	}

}
