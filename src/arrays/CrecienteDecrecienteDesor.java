package arrays;

import java.util.Scanner;

public class CrecienteDecrecienteDesor {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int A[] = new int[10];

		int contAsc = 0, contDesc = 0, contIguales = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digita el n�mero " + (i + 1) + ".- ");
			A[i] = entrada.nextInt();

		}

		int i = 0;
		int j = 0;

		do {

			if (A[j] < A[j + 1]) {

				contAsc++;
			}

			else if (A[j] > A[(j + 1)]) {
				contDesc++;
			} else if (A[j] == A[j + 1]) {
				contIguales++;
			}

			i++;
			j++;
		} while (i <= 8);

		if (contAsc != 9 && contDesc != 9 && contIguales != 9) {
		
			System.out.println("Los n�meros estan desordenados");
		}
		
		else if (contAsc == 9){
			System.out.println("Los n�meros est�n de forma Ascendente");
		}

		else if (contDesc == 9) {
			System.out.println("Los n�meros est�n en orden Descendente"); } 
		
		else if (contIguales == 9) {
			System.out.println("Todos lo n�meros son iguales");
		}

		System.out.println("El contador ascendente es: " + contAsc + "\nEl contador descendente es: " + contDesc
				+ "\nEl contador iguales es: " + contIguales);
	}
}
