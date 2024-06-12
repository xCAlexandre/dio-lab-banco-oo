import java.util.List;
import java.util.stream.Collectors;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public List<Cliente> getTodosClientes(){
		System.out.println("=== Todos Clientes ===");
		return this.contas.stream().map(t -> t.cliente).distinct().collect(Collectors.toList());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
