public class ContaPoupanca extends Conta {
    @Override
    protected void ImprimirInfos() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.ImprimirInfos();
    }
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
}
