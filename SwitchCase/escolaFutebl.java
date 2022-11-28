import java.util.Scanner;
public class escolaFutebl {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int idadeAluno;
		System.out.println("Digite a idade do aluno:");
		idadeAluno=in.nextInt();
		//Estrutura switch-case
		switch(idadeAluno) {
		case 6:
			System.out.println("Dente de leite");
			break;
		case 7:
			System.out.println("Junior");
			break;
		case 8:
			System.out.println("Junior Max");
			break;
		case 9:
			System.out.println("Junior Master");
			break;
		case 10:
			System.out.println("Master");
			break;
			default:
				System.out.println("A escola não permite aluno dessa idade.");
		}
		
		
	}

}
