import java.util.ArrayList;
import java.util.List;

public class Banco {
    int contadorCliente = 1;
    private List<Cliente> clientes;
    private String nome;

    public Banco() {
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarCliente(Cliente cliente) {
        if (cliente != null) {
            this.clientes.add(cliente);
        }
    }
    
    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
            return;
        }
        
        for (Cliente cliente : clientes) {
            System.out.println("Cliente " + contadorCliente + ": " + cliente.getNome());
            contadorCliente++;
        }

    }

    // Método opcional para obter a lista de clientes
    public List<Cliente> getClientes() {
        return clientes;
    }
}