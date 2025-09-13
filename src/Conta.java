public abstract class Conta implements InterfaceConta {
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    Cliente cliente;

    protected Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }
    
    protected Conta(int agencia, int conta){
        this.agencia = agencia;
        this.conta = conta;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println(String.format("Depósito: %.2f", valor));
        System.out.println(String.format("Saldo atual: %.2f", saldo));
    }
    @Override
    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public int getAgencia(){
        return agencia;
    }

    public int getConta(){
        return conta;
    }

    public double getSaldo(){
        return saldo;
    }

    protected void ImprimirInfos(){
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}

