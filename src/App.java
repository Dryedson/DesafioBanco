public class App {
    public static void main(String[] args) throws Exception {
        // Criar instância do banco
        Banco banco = new Banco();
        
        Cliente cliente = new Cliente();
        cliente.setNome("Dryedson");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria");

        // Adicionar clientes ao banco
        banco.adicionarCliente(cliente);
        banco.adicionarCliente(cliente2);

        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente2);

        contaCorrente.depositar(100);
        contaCorrente.ImprimirInfos();
        contaCorrente.transferir(50, contaPoupanca);
        contaCorrente.ImprimirInfos();

        contaPoupanca.ImprimirInfos();
        contaPoupanca.depositar(200);
        contaPoupanca.ImprimirInfos();

        // Agora chamamos o método no objeto banco
        System.out.println("\n=== Lista de Clientes ===");
        banco.listarClientes();
    }
}