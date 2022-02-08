
public class Main {

	public static void main(String[] args) {
		Cliente Guilherme = new Cliente();
		Guilherme.setNome("Guilherme");
		
		
		ContaCorrente cc = new ContaCorrente(Guilherme);
		ContaPoupanca poupanca = new ContaPoupanca(Guilherme);
		
		cc.depositar(100);
		cc.tranferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
