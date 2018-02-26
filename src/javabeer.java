import java.util.Scanner;

public class javabeer {
	public static void main(String[] args) {
		int cer = 99;
		
		while(cer > 0) {
			System.out.println(cer+" cerveja(s) na freezer\nPego uma garrafa passo pra frente");
			cer -= 1;
			System.out.println("Agora tem "+cer+" cerveja(s) na freezer\n");
		
			if(cer == 0) {
				System.out.println("Deseja reabastecer?\n1-Sim\n2-Não\n");
				Scanner leitor = new Scanner(System.in);
				int resp = leitor.nextInt();
			
				if(resp == 1) {
					System.out.println("Quantas deseja reabastecer?");
					Scanner leitor1 = new Scanner(System.in);
					cer = leitor.nextInt();
				}
			}
		}
	}

}
