
public class P2 {
	{
}
	public static void main(String[] args) {
		//String a codificar
		String frase="Paco es un cachondo";
		//Convertimos vocales en mayusculas
		frase=frase.replaceAll("a", "a");
		frase=frase.replaceAll("e", "e");
		frase=frase.replaceAll("i", "i");
		frase=frase.replaceAll("o", "o");
		frase=frase.replaceAll("u", "u");
		//Por pantalla
		System.out.println(frase);
}
}