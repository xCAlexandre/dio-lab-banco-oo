import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		List<Conta> contas = new ArrayList<>(); 


		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Conta ccV = new ContaCorrente(venilton);
		Conta poupancaV = new ContaPoupanca(venilton);
		contas.add(0, ccV);

		Cliente carlos = new Cliente();
		carlos.setNome("carlos");
		Conta ccC = new ContaCorrente(carlos);
		Conta poupancaC = new ContaPoupanca(carlos);
		contas.add(1,ccC);

		Cliente alberto = new Cliente();
		alberto.setNome("alberto");
		Conta ccA = new ContaCorrente(alberto);
		Conta poupancaA = new ContaPoupanca(alberto);
		contas.add(2,ccA);

		banco.setContas(contas);


		banco.getContas().forEach(t -> System.out.println(t.cliente.getNome()));

	}

}
