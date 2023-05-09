
package alura;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private String titular;
    
    public void deposito(double valor){
        this.saldo += valor;
    }
    
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transfere(double valor, Conta conta){
        if(this.saldo >= valor){
            this.saldo -= valor;
            conta.deposito(valor);
            return true;
        }
        return false;
    }
    
    public double leiaSaldo(){
        return this.saldo;
    }
}

