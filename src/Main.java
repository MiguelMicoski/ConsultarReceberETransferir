import java.text.MessageFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nomeCliente = "Miguel";
        String tipoConta = "Corrente";
        double saldo = 2600.00;
        int opcao = 0;
        double valorAReceber;
        double valorATransferir = 0;


        String mensagemInicial = MessageFormat.format("""
                ************************************
                Dados iniciais do cliente:
                                            
                Nome: {0}
                Tipo Conta: {1}
                Saldo Inicial: {2}
                ************************************
                                            
                """, nomeCliente, tipoConta, saldo);

        String menu = """
                Operações:
                                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;
        System.out.println(mensagemInicial);
        System.out.println();


        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitor.nextInt();

            if (opcao == 1)
            {
                System.out.println("Seu saldo é: " + saldo);
            }
            else if (opcao == 2)
            {
                System.out.println("Digite o valor a ser recebido: ");
                valorAReceber = leitor.nextInt();
                saldo += valorAReceber;
                System.out.println("Seu novo saldo é: " + saldo);
            }

            else if (opcao == 3)
            {
                System.out.println("Digite o valor que quer transferir: ");
                valorATransferir = leitor.nextInt();
                if (valorATransferir > saldo)
                {
                    System.out.println("O valor a transferir é maior que o seu saldo");
                }
                else
                {
                    saldo -= valorATransferir;
                    System.out.println("Seu novo saldo é: " + saldo);
                }
            }

            else if (opcao != 4)
            {
                System.out.println("Opção inválida");
            }


        }

    }

}