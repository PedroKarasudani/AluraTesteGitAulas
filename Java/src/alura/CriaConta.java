package alura;

public class CriaConta {

    public static void main(String[] args) {
        Cliente pedro = new Cliente();
        pedro.setCpf(00000000000);
        pedro.setNome("Pedro Karasudani Lourenco");
        pedro.setProfissao("Programador");
        
        Conta conta = new Conta();
        conta.deposito(100);
        conta.saca(20);
        conta.deposito(20);
        System.out.println(conta.getSaldo());
        
        conta.setAgencia(101001);
        conta.setNumero(201);
        conta.setTitular(pedro);
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
        System.out.println(conta.getTitular().getNome());
        
        Cliente titularDaConta =  conta.getTitular();
        titularDaConta.setProfissao("engenheiro");
        
        System.out.println(titularDaConta);
        System.out.println(pedro);
        System.out.println(conta.getTitular());
    }

}
