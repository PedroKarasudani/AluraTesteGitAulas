
package alura;

public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;
    
    public void deposito(double valor){
        saldo += valor;
    }
}
