package utils;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Utils {

	/**
	 * 
	 * @return
	 */
	public static int obtenerNumeroAzar () {
		 return (int) Math.round(Math.random() * 100);
	}
	/**
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	public static int obtenerNumeroAzarLimites (int min, int max) {
		 return (int) Math.round(Math.random() * (max - min)) + min;
	}
	/**
	 *  
	 * @return
	 */
	public static int obtenerEnteroPorScanner() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				return sc.nextInt();
			} catch (Exception ex) {
				System.out.println("Error, introduce un número entero: ");
				sc.nextLine();
			}
		}
	}
	
	public static int obtenerEnteroPorScannerConMSG(String string) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				return sc.nextInt();
			} catch (Exception ex) {
				System.out.println("Error, introduce un número entero: ");
				sc.nextLine();
			}
		}
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static int obtenerEnteroPorJOptionPane() {
		String str = JOptionPane.showInputDialog("Introduce un número");
		int numEntero = Integer.parseInt(str);
		return numEntero;
	}
	/**
	 * 
	 * @param mensaje
	 * @return
	 */
	public static int obtenerEnteroPorJOptionPaneMSGCustom (String mensaje) {
		String str = JOptionPane.showInputDialog(mensaje);
		int numEntero = Integer.parseInt(str);
		return numEntero;
	}
	/**
	 * 
	 * @param var1
	 * @param var2
	 */
	public static void comparaDosNumeros (int var1, int var2) {
		int numMayor;
		
		if (var1 > var2) {
			numMayor = var1;
			System.out.println("El número mayor es: " + numMayor);
			
		} else if (var1 < var2) {
			numMayor = var2;
			System.out.println("El número mayor es: " + numMayor);
			} else { 
				System.out.println("Los números son iguales.");
			}
	}
	/**
	 * 
	 * @param numero
	 */
	public static void parOImpar (int numero) {
		if ((numero % 2) == 0) { System.out.println("El número introducido es par.");
		} else { System.out.println("El número introducido es impar.");
		}
	}
	/**
	 * 
	 * @param numero
	 */
	public static void parOImparConAND (int numero) {
		if ((numero & 1) == 0) { System.out.println("El número introducido es par.");
		} else { System.out.println("El número introducido es impar.");
		}
	}
	/**
	 * 
	 * @param num
	 */
	public static void primoOCompuestoConWhile (int num) {
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
		
		if (esPrimo) System.out.println(num + " es un número primo.");
		else System.out.println(num + " no es un número primo.");
		
	}
	/**
	 * 
	 * @param limitSup
	 * @param limitInf
	 * @param num
	 */
	public static void primoOCompuestoEntreLimites (int limitSup, int limitInf, int num) {
		int numActual = limitInf;
		
		while (numActual < limitSup) {
			boolean esPrimo = true;
		
			if (numActual <= 1) esPrimo = false;
			else if (numActual <= 3) esPrimo = true;
			else if (numActual % 2 == 0 || numActual % 3 == 0) esPrimo = false;
			else {
				int posibleDivisor = 5;
				while (posibleDivisor * posibleDivisor <= numActual) {
					if (numActual % posibleDivisor == 0 || numActual % (posibleDivisor + 2) == 0) {
						esPrimo = false;
						break;
					}
					posibleDivisor += 6;
				}
			}
			if (esPrimo) System.out.println(numActual + " es un número primo.");
			else System.out.println(numActual + " no es un número primo.");
			
			numActual++; // Si ponemos el incremento fuera del while se queda en bucle el primer número.
		}
	}
	/**
	 * 
	 * @param num
	 */
	public static void pasaDecimalABinario (int num) {
		if (num == 0) System.out.println("0");
		else {
			boolean hayUno = false;
			
			for (int i = 31; i >= 0; i--) {
				int bit = (num >> i) & 1; // Tenemos el desplazamiento de Bits explicado en el capitulo 1 ejemplo 7 ¡IMPORTANTE!
				if (bit == 1) hayUno = true;
				if (hayUno) System.out.print(bit); // Si ponemos el println nos sale cada bit en una línea.
			}	
		}	
	}
	/**
	 * 
	 * @param num
	 */
	public static void calculaFactorialConWhile (int num) {
		if (num < 0) System.out.println("No es posible calcular el factorial de un número negativo.");
		else {
			int factorial = 1;
			int i = 1;
			
			while (i <= num) {
				factorial *= i;
				i++;
			}
			System.out.println("El factorial de " + num + " es " + factorial);
		}	
	}
	/**
	 * 
	 * @param num
	 * @param suma
	 */
	public static void sumaDigitos (int num, int suma) {
		while (num != 0) {
			int digito = num % 10;
			suma += digito;
			num /= 10;
		}
        System.out.println("La suma de los dígitos es: " + suma);
	}
	/**
	 * 
	 * @param numIntro
	 * @param numeroPensado
	 */
	public static void adivinaNumeroPensado (int numIntro, int numeroPensado) {
		System.out.println("Intenta adivinar el número que he pensado.");
		
		while (numIntro != numeroPensado) {
			Scanner sc = new Scanner (System.in);
			numIntro = sc.nextInt();

			if (numIntro < numeroPensado) {
				System.out.println("El número que he pensado es superior a ese");
			}
				else if (numIntro > numeroPensado) {
					System.out.println("El número que he pensado es inferior a ese");	
				}
				else JOptionPane.showMessageDialog(null, "Correcto");
			}
	}
	/**
	 * 
	 * @param limite
	 */
	public static void muestraTerminosFibonacci (int limite) {
		int numPrim = 1, numSeg = 1, i = 0;
		 
		while (i < limite) {
            System.out.print(numPrim + " " ); //Necesitaba añadir espacios entre dichos números por lo tanto añado un "" con solo espacios
            int auxiliar = numPrim;   //Añadimos la variable auxiliar para ir haciendo la "rotación"
            numPrim = numSeg;
            numSeg = auxiliar + numSeg;
            i++;
        }
	}
	/**
	 * Método que da la vuelta al string introducido.
	 * @param str
	 */
	public static void ordenInverso (String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static String ordenInverso2 (String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		return str;
	}
	

	/**
	 * 
	 * @return
	 */
	public static String obtenerCadena () {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	/**
	 * 
	 * @return
	 */
	public static String obtenerCadenaConDescripcion (String desc) {
		Scanner sc = new Scanner(System.in);
		System.out.println(desc);
		return sc.nextLine();
	}
	
	/**
	 * 
	 * @param str
	 */
	public static void quitaEspaciosAString (String str) {
		
		String strNoSpaces = "";
//		boolean enPalabra = false;
		
		for (int i = 0; i < str.length(); i++) {
			boolean enPalabra = false; // Lo tenemos que poner dentro del for para que cada vez que 
			// cambie de letra se ponga a false y no quede en true, ya que solo mostraría la primera letra 
			// de cada palabra.

			if (str.charAt(i) != ' ') {
				if (enPalabra == false) {
					strNoSpaces += str.charAt(i);
					enPalabra = true;
					
				}
			} else {
				enPalabra = false;
			}
		}
		System.out.println(strNoSpaces);
	}
	
	/**
	 * 
	 * @param str
	 * @param desplazamiento
	 * @return
	 */
	public static String cifraString (String str, int desplazamiento) {
		
		String stringCifrada = "";
		
		for (int i = 0; i < str.length(); i++) {
			char letraStr = str.charAt(i);
			//Vemos si es una letra lo primero, y luego clasificamos mayúsculas y minúsculas.
			if ((letraStr >= 97 && letraStr <= 122) || (letraStr >= 65 && letraStr <= 90)) {
				
				if (letraStr >= 97 && letraStr <= 122) {
					stringCifrada += (char) ((((letraStr - 97) + desplazamiento) % 26) + 97);
				}
				else {
					stringCifrada += (char) ((((letraStr - 65) + desplazamiento) % 26) + 65);
				}
			}
			else { //Else para espacios
				stringCifrada += letraStr;
			}
		}
		return stringCifrada;
		}	
	
	/**
	 * 
	 * @param strOrig
	 * @param stringAComparar
	 * @return
	 */
	public static int cuentaOcurrenciasEnString (String strOrig, String stringAComparar) {
		
		int contOcurrencias = 0;
		
		for (int i = 0; i < strOrig.length(); i++) {
			char letraStrOrig = strOrig.charAt(i);
			char letraInicialStringAComparar = stringAComparar.charAt(0);
			

			if (letraStrOrig == letraInicialStringAComparar) {
				boolean coincidenciaTotal = true;
				for (int j = 0; j < stringAComparar.length(); j++) {
					if (strOrig.charAt(i + j) != stringAComparar.charAt(j)) {
						coincidenciaTotal = false;
					}
				}
				if (coincidenciaTotal) contOcurrencias++;
			}
		}
		return contOcurrencias;
	}
	
	/**
	 * 
	 * @param strOrig
	 * @return
	 */
	public static String encuentraStringMasLarga (String strOrig) {
		
		String cadenaMasLarga = "";
		String posibleMasLarga = "";

		for (int i = 0; i < strOrig.length(); i++) {
			
			if (strOrig.charAt(i) != ' ') {
				posibleMasLarga += strOrig.charAt(i);
			} else { 
				if (posibleMasLarga.length() > cadenaMasLarga.length()) {
					cadenaMasLarga = posibleMasLarga;
				}
				posibleMasLarga = "";

			}
			
		}
		if (posibleMasLarga.length() > cadenaMasLarga.length()) {
			cadenaMasLarga = posibleMasLarga;
		}
						
		return cadenaMasLarga;	
	}
	
	/**
	 * 
	 * @param strOrig
	 * @return
	 */
	public static String invierteCadaPalabraDelString (String strOrig) {
		
		String actualWord = "";
		String inverted = "";
		
		for (int i = 0; i < strOrig.length(); i++) {
					
			if(strOrig.charAt(i) != ' ') {
				actualWord += strOrig.charAt(i);
				
			} else {
				
				for (int j = (actualWord.length() - 1); j >= 0; j--) {
					inverted += actualWord.charAt(j);
				}
				inverted += " ";
				actualWord = "";
			}	
		}
		for (int j = actualWord.length() - 1; j >= 0; j--) {
			inverted += actualWord.charAt(j);	
		}	
		return inverted;
	}
	
	/**
	 * 
	 * @param strOrig
	 * @return
	 */
	public static boolean esPangrama(String strOrig) {
		
		int abecedario[]= new int [26]; //Todas las letras del abecedario(26) si paso por todas las posiciones y está es un pangrama.
		int letraEncontrada = 0; //Contador de letras encontradas, al final tiene que dar 26
		
		for (int i = 0; i < strOrig.length(); i++) {
			char letraString = strOrig.charAt(i);
			int indiceAbecedario = letraString - 'a'; //Para que la 'a' sea el i=0
			if(letraString >= 97 && letraString <= 122) {
				if(abecedario[indiceAbecedario] == 0) {
					abecedario[indiceAbecedario] = 1; //Se marca la letra como encontrada.
					letraEncontrada++;
				}
			}
		}
//		System.out.println(letraEncontrada);
		return (letraEncontrada == 26)? true : false;
	}
		
	/**
	 * 
	 * @param str
	 */
	public static void cuentaVocalesYConsonantesConSwitch1 (String str) {
		int contVoc = 0, contCons = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) > 64 && str.charAt(i) < 91) || (str.charAt(i) > 96 && str.charAt(i) < 123)) {
				switch (str.charAt(i)) {
				case 'A':
				case 'a':
				case 'e':
				case 'E':
				case 'I':
				case 'i':
				case 'o':
				case 'O':
				case 'U':
				case 'u': contVoc++;
				break;
				default: contCons++;
				break;
				}
			}
		}
		System.out.println("Hay " + contVoc + " vocales y " + contCons + " consonantes.");
	}
	
	/**
	 * 
	 * @param str
	 */
	public static void cuentaVocalesYConsonantes (String str) {
		int contVoc = 0, contCons = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) > 64 && str.charAt(i) < 91) || (str.charAt(i) > 96 && str.charAt(i) < 123)) {
				//Con ese if comprobamos que se trata de una letra
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || 
					str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || 
					str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || 
					str.charAt(i) == 'U') {
					contVoc++;
				}
				else contCons++;
			}
		}
		System.out.println("Hay " + contVoc + " vocales y " + contCons + " consonantes.");
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean esPalindromo (String str) {
//		boolean esPalindromo = false;
		System.out.println(str);
//		String str2 = Utils.ordenInverso2(str);
		System.out.println(); 
		
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
				return true; //En el momento que vemos que coinciden, devolvemos un true.
			}	
		}
		return false; //En caso de que se complete el bucle sin devolver un true, devolvemos un false.
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static int cuentaNumeroPalabras (String str) {
		int wordsCount = 0;
		boolean enPalabra = false;
		
		
		for (int i = 0; i < str.length(); i++) {
		
			if (str.charAt(i) != ' ') {
				if (enPalabra == false) {
					wordsCount++;
					enPalabra = true;
				}
			} else {
				enPalabra = false;
			}
		}
		
	return wordsCount;	
	}
	
	/**
	 * 
	 * @param string1
	 * @param string2
	 * @return
	 */
	public static int comparaLexicograficamente (String string1, String string2) {
		
		int i = 0;
        while (i < string1.length() && i < string2.length()) {
        	if (string1.charAt(i) != string2.charAt(i)) {
        		return string1.charAt(i) - string2.charAt(i);
        	}
        	i++;
		}
		return string1.length() - string2.length();		
	}
	
	/**
	 * 
	 * @param string1
	 * @param string2
	 * @return
	 */
	public static int comparaLexicograficamente2 (String string1, String string2) {
		
		for (int i = 0; i < string1.length() && i < string2.length(); i++) {
			char letraCadena1 = string1.charAt(i);			
			char letraCadena2 = string2.charAt(i);	
			if (letraCadena1 < letraCadena2) {
				return -1;
			}
			else if (letraCadena1 > letraCadena2) {
				return 1;
			}
		}
		if (string1.length() < string2.length()) {
			return -1;
		}
		else if (string1.length() > string2.length()) {
			return 1;
		}
		return 0;	
	}
	
	/**
	 * 
	 * @param string1
	 * @return
	 */
	public static String cambiaMinusculasAMayusculas (String string1) {
		String cambio = ""; //Creamos el string vacío, para luego concatenar con letra.
		
		for (int i = 0; i < string1.length(); i++) {
			char letra = string1.charAt(i);
			if (string1.charAt(i) >= 65 && string1.charAt(i) <= 90) {
				letra = (char) (letra + 32);
			}
			cambio += letra; //Concatenamos.
		}	
		return cambio;
	}
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static String comprimirRunLength(String s) {
        String resultado = "";

        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                resultado += count + String.valueOf(s.charAt(i - 1));
                count = 1;
            }
        }

        resultado += count + String.valueOf(s.charAt(s.length() - 1));

        return resultado;
    }
	
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static String descomprimirRunLength(String s) {
        String resultado = "";

        for (int i = 0; i < s.length(); i += 2) {
            int count = Character.getNumericValue(s.charAt(i));
            char caracter = s.charAt(i + 1);

            for (int j = 0; j < count; j++) {
                resultado += caracter;
            }
        }

        return resultado;
    }
	
	/**
	 * 
	 * @param texto
	 * @param anagrama
	 * @return
	 */
	public static Boolean esAnagrama (String texto, String anagrama) {
		boolean esIgual = false;
		char arrayTexto[] = new char[texto.length()];
		char arrayAnagrama[] = new char[anagrama.length()];
		
		if (arrayTexto.length != arrayAnagrama.length) {
			return false;
		}
		else {
			
			for (int i = 0; i < (arrayTexto.length - 1);i++) {
				arrayTexto[i] = texto.charAt(i);
				arrayAnagrama[i] = anagrama.charAt(i);
			}
			for (int i = 0; i < (arrayAnagrama.length - 1);i++) {
				
			}
			
		}
		return true;
	}
	
	/**
	 * 
	 * @param cadena1
	 * @param cadena2
	 * @return
	 */
	public static boolean esRotacionDeString(String cadena1, String cadena2) {
        // Verificamos si ambas cadenas tienen la misma longitud y no son nulas
        if (cadena1 == null || cadena2 == null || cadena1.length() != cadena2.length()) {
            return false;
        }

        int len = cadena1.length();

        // Buscamos el primer carácter de cadena2 en cadena1
        int index = cadena1.indexOf(cadena2.charAt(0));

        // Si no encontramos el primer carácter, o si las subcadenas no coinciden, devolvemos false
        if (index == -1 || !cadena1.substring(index, len).equals(cadena2.substring(0, len - index))) {
            return false;
        }

        // Verificamos si el resto de la cadena2 coincide con la parte restante de cadena1
        return cadena1.substring(0, index).equals(cadena2.substring(len - index));
    }
	
	/**
	 * 
	 * @param cadenaOriginal
	 * @param subcadena
	 * @param cadenaReemplazo
	 * @return
	 */
	public static String reemplazarSubcadena(String cadenaOriginal, String subcadena, String cadenaReemplazo) {
        // Verificamos si la cadena original o la subcadena son nulas o vacías
        if (cadenaOriginal == null || subcadena == null || cadenaOriginal.isEmpty() || subcadena.isEmpty()) {
            return cadenaOriginal;
        }

        // Reemplazamos todas las ocurrencias de la subcadena con la cadena de reemplazo
        StringBuffer nuevaCadena = new StringBuffer();
        int index = 0;

        while (index < cadenaOriginal.length()) {
            int indexOfSubcadena = cadenaOriginal.indexOf(subcadena, index);

            // Si no hay más ocurrencias de la subcadena, copiamos el resto de la cadena original
            if (indexOfSubcadena == -1) {
                nuevaCadena.append(cadenaOriginal, index, cadenaOriginal.length());
                break;
            }

            // Copiamos la parte de la cadena original antes de la ocurrencia de la subcadena
            nuevaCadena.append(cadenaOriginal, index, indexOfSubcadena);

            // Agregamos la cadena de reemplazo en lugar de la subcadena
            nuevaCadena.append(cadenaReemplazo);

            // Actualizamos el índice para comenzar la búsqueda después de la ocurrencia de la subcadena
            index = indexOfSubcadena + subcadena.length();
        }

        return nuevaCadena.toString();
    }
	
	/**
	 * 
	 * @param descripcion
	 * @return
	 */
	public static String obtenerCadenaConDescripcion2(String descripcion) {
        return JOptionPane.showInputDialog(descripcion);
	}
	
	/**
	 * 
	 * @param mensaje
	 * @return
	 */
	public static float obtenerFloatPorJOptionPaneMSGCustom(String mensaje) {
        String str = JOptionPane.showInputDialog(mensaje);
        try {
            float numFloat = Float.parseFloat(str);
            return numFloat;
        } catch (NumberFormatException e) {
            // Manejar la excepción si la entrada no es un número float válido
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número decimal válido.");
            return obtenerFloatPorJOptionPaneMSGCustom(mensaje); // Llamada recursiva
        }
    }
	
	public static int obtenerEnteroPorJOptionPaneMSGCustomConErrorMSG(String mensaje) {
        String str = JOptionPane.showInputDialog(mensaje);
        try {
            int numEntero = Integer.parseInt(str);
            return numEntero;
        } catch (NumberFormatException e) {
            // Manejar la excepción si la entrada no es un número entero válido
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número entero válido.");
            return obtenerEnteroPorJOptionPaneMSGCustomConErrorMSG(mensaje); // Llamada recursiva
        }
    }
	
	public static float obtenerFloatPorJOptionPaneMSGCustomConErrorMSG(String mensaje) {
	    String str = JOptionPane.showInputDialog(mensaje);
	    try {
	        float numFloat = Float.parseFloat(str);
	        return numFloat;
	    } catch (NumberFormatException e) {
	        // Manejar la excepción si la entrada no es un número flotante válido
	        JOptionPane.showMessageDialog(null, "Por favor, ingrese un número flotante válido.");
	        return obtenerFloatPorJOptionPaneMSGCustomConErrorMSG(mensaje); // Llamada recursiva
	    }
	}
	
	public static void ordenaListaEnterosPorBurbuja(List<Integer> l) {
		boolean hayIntercambio;
		
		do {
			hayIntercambio = false;
			
			for (int i = 0; i < l.size() - 1; i++) {
				if (l.get(i).intValue() > l.get(i + 1).intValue()) {
				int aux = l.get(i).intValue();
				l.set(i, l.get(i + 1).intValue());
				l.set(i + 1, aux);
				hayIntercambio = true;
				}
			}
		}
		while (hayIntercambio);
	}
	
	
}
