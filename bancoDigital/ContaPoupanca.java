package exerciocioDio.bancoDigital;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}

	public void imprimirExtraro() {
		System.out.println("Extrato Conta Poupan�a ====");
		super.dadosDaConta();
		System.out.println("\n============");
	}
}
