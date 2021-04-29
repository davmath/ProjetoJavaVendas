import java.util.Scanner;

public class Principal {

	public static void main (String[]args) {
		String nome, cpf;
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		int opcao;
		
		do {
			System.out.println("\n--PROJETO DE VENDAS--\n");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Listar Clientes");
			System.out.println("0 - Sair");
			System.out.print("\nDigite a opção desejada: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("\n--CADASTRAR CLIENTE--\n");
				System.out.print("\nDigite o nome do cliente: ");
				cliente.setNome(sc.next());
				System.out.print("Nome: " + cliente.getNome());
				
				System.out.print("\nDigite o CPF do cliente: ");
				cliente.setCPF(sc.next());
				System.out.print("CPF: " + cliente.getCPF());
				System.out.println("\n-------------------------------------------------------------------------------------------------------------");
									

				
				break;
			case 2:
				System.out.println("\n--LISTAR CLIENTE--\n");
				break;
			case 0:
				System.out.println("\n--SAINDO--\n");
				break;
			default:
				System.out.println("\n--OPÇÃO INVÁLIDA--\n");
				break;
			}
			
			
			
		} while(opcao != 0);
		
		sc.close();
	}
	
}
