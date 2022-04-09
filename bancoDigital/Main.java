package exerciocioDio.bancoDigital;

public class Main {
	public static void main(String[] args) {
		Cliente marcelo = new Cliente();
		marcelo.setNome("Marcelo");
		
		Cliente maria = new Cliente();
		maria.setNome("Maria");
		
		
		Conta cc = new ContaCorrente(marcelo);
		Conta cc2 = new ContaCorrente(maria);
		Conta cp = new ContaPoupanca(marcelo);
		
		cc.dadosDaConta();
		cc2.imprimirExtraro();
		cc.depositar(100);
		cc.dadosDaConta();
		cc.transferir(50, cp);
		cp.dadosDaConta();
		cc.dadosDaConta();
		cc.sacar(45);
		cc.imprimirExtraro();
	}
}
