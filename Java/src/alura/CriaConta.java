package alura;

public class CriaConta {

    public static void main(String[] args) {
        Conta pedro = new Conta(2000, 30, 1919);
        
        System.out.println(pedro.getSaldo());
        System.out.println(pedro.getNumero());
        System.out.println(pedro.getAgencia());
        System.out.println(Conta.getTotal());
    }
}
