import java.util.Scanner;

public class ProjetoBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorTransferido;
        double valoRecebido;
        double saldo = 2500.00;
        int opcao = 0;
        System.out.println("""
                ********************************************
                Dados iniais do cliente:
                
                Nome:  João Victor Quintino de Brito
                Tipo conta: Corrente
                Saldo inicial: R$ 2500.00
                ********************************************""");
        while (opcao != 4 ){
            System.out.println("""
                    
                    Operações
                    
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    
                    Digite a Opção desejada:
                    """);
            opcao = scanner.nextInt();
            if (opcao == 1){
                System.out.println("O saldo da sua conta é: "+saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber");
                valoRecebido = scanner.nextDouble();
                saldo += valoRecebido;
                System.out.println("Saldo atualizado: " +saldo);
            } else if (opcao == 3) {
                System.out.println("Infome o valor que deseja transferir");
                valorTransferido = scanner.nextDouble();
                if (valorTransferido < saldo) {
                    saldo = saldo - valorTransferido;
                    System.out.println("Seu saldo atual agora é de: " + saldo);
                } else {
                    System.out.println("Não há saldo sufiente para fazer essa transferência.");
                }
            }
            if (opcao > 4 ) {
                System.out.println("Opcao invalida!");
            }
        }
    }
}
