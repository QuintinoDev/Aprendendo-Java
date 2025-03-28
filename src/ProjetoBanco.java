import java.util.Scanner;

public class ProjetoBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sacar;
        double depositar;
        var saldo = 2500.00;
        var opcao = 0;
        System.out.println("""
                ********************************************
                Dados iniciais do cliente:
                
                Nome: João Victor Quintino de Brito
                Tipo da conta: Corrente
                Saldo atual: R$ 2500.00
                ********************************************""");
        while (opcao != 4 ){
            System.out.println("""
                    
                    Operações
                    
                    1 - Consultar saldo
                    2 - Depositar
                    3 - Sacar
                    4 - Sair
                    
                    Digite a Opção desejada:
                    """);
            opcao = scanner.nextInt();
            if (opcao == 1){
                System.out.println("O saldo atual é de: "+saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a depositar: ");
                depositar = scanner.nextDouble();
                saldo += depositar;
                System.out.println("Saldo depositado com sucesso!");
                System.out.println("Seu saldo agora é de: "+saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja sacar: ");
                sacar = scanner.nextDouble();
                if (sacar < saldo) {
                    saldo -= sacar;
                    System.out.println("Seu saldo atual é de: "+saldo);
                } else {
                    System.out.println("Não há saldo suficiente para fazer esse saque.");
                }
            }if (opcao > 4 ) {
                System.out.println("Opcao invalida!");
            }
        }
    }
}
