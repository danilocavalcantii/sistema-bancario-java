package empresa;

public class Conta {

    private int numero;
    private String titular;
    private double saldo;
    private double limite;

    // Construtor
    public Conta(int numero, String titular, double saldo, double limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    // Método sacar
    public boolean sacar(double valor) {
        if (valor <= 0 || valor > (saldo + limite)) {
            return false;
        }

        saldo -= valor;
        return true;
    }

    // Método depositar
    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }

        saldo += valor;
        return true;
    }

    // Getters (boa prática)
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    // Método para exibir dados
    public void exibirConta() {
        System.out.println("Nome: " + titular);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("------------------------");
    }
}}

}
