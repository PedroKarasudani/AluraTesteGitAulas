package alura;

public class CriaConta {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposito(100);
        System.out.println(conta.saca(200));
        System.out.println(conta.saldo);
    }

}
