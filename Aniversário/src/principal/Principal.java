package principal;

import java.util.Scanner;
import br.edu.utilidades.Data;

public class Principal {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o dia do seu nascimento: ");
	    d1.setDia(sc.nextInt());
	    System.out.println("Digite o número do mês do seu nascimento: ");
	    d1.setMes(sc.nextInt());
	    System.out.println("Digite o ano do seu nascimento: ");
	    d1.setAno(sc.nextInt());
	    d1.mostrarData();

	}

}
