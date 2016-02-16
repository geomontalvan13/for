import java.Util.scanner;
public class Forr
{
	public static void main (String args[]){

		int numero;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Altura: ");
		numero = teclado.nextInt();
		for (int i=1; i<=numero; i++){
			System.out.print("*");
		}
		System.out.println("\n");
	}
}