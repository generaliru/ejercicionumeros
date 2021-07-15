import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;	


public class EjerciciosNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresa 3 numeros para ordenarlos:");
		Integer[] arrNums;
		arrNums = new Integer[3];
		System.out.println("Ingresa numero 1:");
		arrNums[0] = in.nextInt();
		System.out.println("Ingresa numero 2:");
		arrNums[1] = in.nextInt();
		System.out.println("Ingresa numero 3:");
		arrNums[2] = in.nextInt();
		
		int aux = 0;
		for(int i = 0; i < arrNums.length; i++) {
			if (aux < arrNums[i]) {
				aux = arrNums[i];
			}
		}
		System.out.println("El numero mayor es: " + aux);
		
		System.out.println("Los numeros ordenados de mayor a menor son: ");
		Arrays.sort(arrNums, Collections.reverseOrder());
		for(int i = 0; i < arrNums.length; i++) {
			System.out.print(arrNums[i] + " ");
		}
		System.out.println("\nLos numeros ordenados de menor a mayor son: ");
		Arrays.sort(arrNums);
		for(int i = 0; i < arrNums.length; i++) {
			System.out.print(arrNums[i] + " ");
		}
	}

}
