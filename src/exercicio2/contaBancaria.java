package exercicio2;

public class contaBancaria {
    public int saldo;
    public String titular;

    public void depositar(int deposito){
        this.saldo += deposito;
        System.out.println(this.saldo);
    }
    public void sacar(int saque){
        this.saldo -= saque;
        System.out.println(this.saldo);
    }
}
