import java.util.Scanner;

public class for2
{ 
	public static void main(String args[]){
		Scanner teclado=new Scanner(System.in);


		System.out.println("valor de la anchura: ");
		int valor1 = teclado.nextInt();
		System.out.println("valor d ela Altura: ");
		int valor2 = teclado.nextInt();


		for(int i=0; i<=valor1; i++){
			System.out.print("*");

		}

		for(int j=0; j<=valor2; j++){
			System.out.println("*");
		}
	}
}
