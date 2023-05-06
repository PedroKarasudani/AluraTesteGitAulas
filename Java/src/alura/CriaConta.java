
package alura;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiroUsuario = new Conta();
        primeiroUsuario.saldo = 200;
        
        Conta segundoUsuario = new Conta();
        segundoUsuario.saldo = 300.25;
        
        
        System.out.println("Saldo do primeiro usuario: " + primeiroUsuario.saldo);
        System.out.println("Saldo do segundo usuario: " + segundoUsuario.saldo);
        
     
    }
}
