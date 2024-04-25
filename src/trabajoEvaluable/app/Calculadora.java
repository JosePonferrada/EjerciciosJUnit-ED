package trabajoEvaluable.app;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		System.out.println(factorialRecursivo(5));
		System.out.println(esCapicua(303));
		System.out.println(primoOCompuesto(23));
		System.out.println(siguientePrimo(23));
		System.out.println(calculaPotencia(2, 3));
		System.out.println(cuentaDigitos("0005"));
		
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
	
	/**
	 * Método que nos dice si un número introducido es capicúa o no
	 * @param num
	 * @return
	 */
	public static boolean esCapicua (int num) {
		String original = String.valueOf(num);
        String invertido = new StringBuffer(original).reverse().toString();
        
        return original.equals(invertido);
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
	
	/**
	 * Método que nos devuelve el siguiente número primo al que hemos introducido
	 * @param num
	 * @return
	 */
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
	public static int cuentaDigitos (String num) {
		
//		num.toCharArray().length;
		return num.toCharArray().length;
	}
	
	/**
	 * Método que calcula la potencia de un número tras introducir la base y el exponente
	 * @param base
	 * @param exponente
	 * @return
	 */
	public static double calculaPotencia (int base, int exponente) {
		
		return Math.pow(base, exponente);
		
	}
	
	
	
}
