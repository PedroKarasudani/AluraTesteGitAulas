
package alura;

public class CriaConta {
    public static void main(String[] args) {
        Conta contaPedro = new Conta();
        contaPedro.deposito(200);          

        
        
        
        Conta contaBarbara = new Conta();
        contaBarbara.deposito(1000.25);
        
        if(contaBarbara.transfere(500, contaPedro)){
            System.out.println("Transferencia feita com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
            
        }
        
        System.out.println(contaPedro.saldo);
        System.out.println(contaBarbara.saldo);
        
    }
    
        
}
