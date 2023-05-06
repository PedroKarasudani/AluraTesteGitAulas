    
package alura;


public class TesteReferencia {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 100;
        //conta 1 nao é um objeto e uma refencia de objeto
        Conta conta2 = conta1;
        System.out.println("primeiro teste: " + conta1.saldo);
        System.out.println("primeiro teste: " + conta2.saldo);
        
        //essa referencia pode ser alterada tendo dois resultado
        System.out.println("segundo teste: " + conta1.saldo);
        conta2.saldo += 200;
        System.out.println("segundo teste: " + conta2.saldo);
        
        //mas sao a mesma refencia
        System.out.println("terceito teste: " + conta2.saldo);
        System.out.println("terceiro teste: " + conta1.saldo);
        
        
    }
}
