import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//variaveis
		Palindromo palavra = new Palindromo();
		String txt;
		boolean fim = false;
		
		//loop até o usuário digitar que quer sair
		while(!fim) {
			palavra.c1(); // Uso do construtor sem parametros
			
			System.out.print("Insira a frase ou palavra desejada: ");
			txt = input.nextLine(); 
			if (txt.equals("/sair")) {
				fim = true;
				break;
				}
			
			palavra.c2(txt); // Uso do construtor com parametros, colocando txt para ser analisado
			txt = palavra.Getter();
			palavra.Setter(txt);
			
			if(palavra.verificar() == true) {System.out.println("É um palindromo");}
			else {System.out.println("Não é um palindromo");}
			
		}
	}
}
