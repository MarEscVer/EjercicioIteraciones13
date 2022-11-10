package unico;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

//Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
		
		final int COND = 4;
		final int TOPE = 6;
		
		int nota;
		int suspensos = 0;
		int aprobados = 0;
		int condicionados = 0;
		int i;
		
		for (i=1; i <=TOPE; i++) {
			System.out.print("Introduce las calificaciones [" + i + " - " + TOPE + "]: ");
			nota = Integer.parseInt(teclado.nextLine());
			
			if (nota == 4) {
				condicionados++;
			} else {
				if (nota > 4) {
					aprobados++;
				} else {
					suspensos++;
				}
			}
		}
		System.out.println("Hay un total de " + suspensos + " alumnos suspensos.");
		System.out.println("Hay un total de " + condicionados + " alumnos condicionados.");
		System.out.println("Hay un total de " + aprobados + " alumnos aprobados.");
	}
}
