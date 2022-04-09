package exerciocioDio.bancoDigital;

public class ContaCorrente extends Conta {	
		
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	
	}

	public void imprimirExtraro() {
		System.out.println("Extrato Conta Corrente ====");
		super.dadosDaConta();
		System.out.println("\n============");
	}

	
	
}
