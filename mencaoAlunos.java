import java.util.*;
public class mencaoAlunos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double mb, b, r, i, qntalunos, totalMb, totalB, totalR, totalI;
		System.out.println("Digite a quantidade de alunos MB:");
		mb = in.nextDouble();
		System.out.println("Digite a quantidade de alunos B:");
		b = in.nextDouble();
		System.out.println("Digite a quantidade de alunos R:");
		r = in.nextDouble();
		System.out.println("Digite a quantidade de alunos I:");
		i = in.nextDouble();
		qntalunos = mb + b + r + i;
		System.out.println("O total de alunos é: " + qntalunos);
		totalMb = mb / qntalunos * 100;
		System.out.println("A porcentagem de alunos com menção MB é: " + totalMb);
		totalB = b / qntalunos * 100;
		System.out.println("A porcentagem de alunos com menção B é: " + totalB);
		totalR = r / qntalunos * 100;
		System.out.println("A porcentagem de alunos com menção R é: " + totalR);
		totalI = i / qntalunos * 100;
		System.out.println("A porcentagem de alunos com menção I é: " + totalI);
		
	}
}

