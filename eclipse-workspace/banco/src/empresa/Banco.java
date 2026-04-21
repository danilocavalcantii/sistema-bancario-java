package empresa;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Conta> contas = new ArrayList<>();

	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}

	public void listarContas() {
		for (Conta c : contas) {
			c.exibirConta();
		}
	}
}