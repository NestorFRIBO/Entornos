
public class ExamenED2 {

	public static void main(String[] args) {
			//Declaramos los Strings
			String mensaje="";
			String mensajeCodificado="APUQTI OSEE  LIT OAM SUGPA OUQ EOCONCZO";
			String mensajetemporal="";

			mensaje=mensajeCodificado.toLowerCase(); /*Cambiamos de mayusculas a mayusculas/*

			/*Cambiamos el orden de las letras*/

			for(int i=0;i<mensaje.length();i=i+2){

				if(i+1==mensaje.length()){

					mensajetemporal=mensajetemporal+mensaje.charAt(i);

				}else{

					mensajetemporal=mensajetemporal+mensaje.charAt(i+1)+mensaje.charAt(i);

					}

					}

				mensaje=mensajetemporal;
				System.out.println(mensaje);/*Imprimimos el mensajeCodificado*/

		}

	}



