package alura;

public class CriaConta {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposito(100);
        conta.saca(20);
        conta.deposito(20);
        System.out.println(conta.getSaldo());
        
        conta.setAgencia(101001);
        conta.setNumero(201);
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
        
    }

}
