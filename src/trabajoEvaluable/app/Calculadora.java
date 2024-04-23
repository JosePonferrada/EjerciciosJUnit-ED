package trabajoEvaluable.app;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
				
		
	}

	/**
	 * Método que calcula el factorial de un número introducido
	 * @param num
	 */
	public static int factorialRecursivo (int num) {
		Scanner sc = new Scanner(System.in);
		while(num < 1) {
			System.out.println("Error. Introduzca un número positivo mayor que 0");
			num = sc.nextInt();
		}
		if (num == 1) {
			return 1;
		}
		return num * factorialRecursivo(num - 1);
	}
	
	public static boolean esCapicua (int num) {
		
	}
	
	/**
	 * Método que comprueba si un número introducido es primo o compuesto
	 * @param num
	 */
	public static boolean primoOCompuesto (int num) {
		boolean esPrimo = true;
		
		if (num <= 1) esPrimo = false;
		else {
			int posibleDivisor = 2;
			while (posibleDivisor < num) {
				if (num % posibleDivisor == 0) {
					esPrimo = false;
					break;
				}
				posibleDivisor++;
			}
		}
		
		return esPrimo;
		
	}
	
	public static int siguientePrimo (int num) {
		
		int i = num + 1;
		while (!primoOCompuesto(i)) i++;
		
		return i;
	}
	
	/**
	 * Método que nos cuenta los dígitos de un número introducido
	 * @param num
	 * @return
	 */
	public static int sumaRecursivaDigitos (int num) {
		
		if (num == 0) {
			return 0;
		}
		
		return num % 10 + sumaRecursivaDigitos(num / 10);
		
	}
	
	public static double calculaPotencia (int base, int exponente) {
		
		return Math.pow(base, exponente);
		
	}
	
	
	
}
