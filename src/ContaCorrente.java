public class ContaCorrente extends Conta {
    @Override
    protected void ImprimirInfos() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.ImprimirInfos();
    }
  public ContaCorrente(Cliente cliente) {
      super(cliente);
  }

}  