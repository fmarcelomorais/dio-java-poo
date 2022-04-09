package exerciocioDio.bancoDigital;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;	
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	
	@Override
	public void sacar(double valor) {
		if(this.saldo < valor) {
			System.out.println("Saldo insuficiente");
			return;
		}
		saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		if(this.saldo < valor) {
			System.out.println("Saldo insuficiente");
			return;
		}
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	protected void dadosDaConta() {
		System.out.printf("Agencia: %d \n", this.agencia);
		System.out.printf("Conta: %d \n", this.numero);
		System.out.printf("Cliente: %s \n", this.cliente.getNome());
		System.out.println(String.format("Saldo Atual R$ %.2f", this.saldo));
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
}
