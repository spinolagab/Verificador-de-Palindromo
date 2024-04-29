public class Palindromo {
	
	private String texto;
	
	// construtor 1 sem parametros
	public void c1() {
		this.texto = "";
	}
	
	// construtor 2 que recebe string como parametro
	public void c2(String param) {
		this.texto = param;
	}
	
	// Getter
	public String Getter() {
		return texto;
	}
	
	// Setter
	public void Setter(String parametro) {
		if (parametro.equals("\0")) {
			return;
		}
		texto = parametro;
	}
	
	// Verificar se é palindromo ou não
	public boolean verificar() {
		//Variáveis
		String inverso = "";
		char[] suporte = texto.toCharArray(); 
		int i;
		for (i = suporte.length - 1; i >= 0; i--) {
			inverso = inverso + texto.charAt(i);
		}
		
		/*Remove os espaços e compara o texto com seu inverso ignorando a diferença
		entre letras maiúsculas e minúsculas
		*/
		if(inverso.replaceAll(" ", "").equalsIgnoreCase(texto.replaceAll(" ", ""))) {
			return true;
		}
		else {
			return false;
		}
	}	
}
