
package alura;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiroUsuario = new Conta();
        primeiroUsuario.saldo = 200;
    
        primeiroUsuario.deposito(200);
                   
        boolean statusRetirada = primeiroUsuario.saca(50);
        System.out.println(statusRetirada);
        System.out.println(primeiroUsuario.saldo);
        
    }
    
        
}
