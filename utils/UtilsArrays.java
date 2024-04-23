package utils;


public class UtilsArrays {

	
	/**
	 * 
	 * @param a
	 */
	public static void imprimeArray (int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	/**
	 * 
	 * @param a
	 * @param limInf
	 * @param limSup
	 */
	public static void inicializaArray (int a[], int limInf, int limSup) {
		for (int i = 0; i < a.length; i++) {
			a[i] = Utils.obtenerNumeroAzarLimites(limInf, limSup);
		}
	}
	
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int suma (int array[]) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	}
	
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static float promedia (int array[]) {
		return suma(array) / (float) array.length;
	}
	
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int mayor (int array[]) {
		int mayor = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > mayor) mayor = array[i];
		}
		return mayor;
	}
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int menor (int array[]) {
		int menor = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < menor) menor = array[i];
		}
		return menor;
	}
	/**
	 * 
	 * @param numeros
	 * @param i
	 */
	public static void poneArrayOrdenInverso (int numeros[], int i) {
		for (i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100); 
		}
		for (i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " "); // Array sin invertir	
		}
		System.out.println("\n"); // Salto de línea
		
		for (i = numeros.length - 1; i >= 0; i--) { // numeros.length - 1 porque sería el número 151
			System.out.print(numeros[i] + " "); // Mostramos el array invertido
		}
	}
	/**
	 * 
	 * @param numToFind
	 * @param numeros
	 */
	public static void buscaPosicionValor (int numToFind, int numeros[]) {
		int pos = -1; // pos = -1 en un array indica un resultado no válido. No está en los límites del array entonces se inicializa fuera de éste
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numToFind) {
				pos = i; // Si pos = -1 sabemos que ese número no se encuentra en el array ya que está fuera de los límites.
				break;
			}
		}
		System.out.println("El número " + numToFind + " está en la posición: " + pos);
	}
	/**
	 * 
	 * @param numeros
	 */
	public static void sumaIndicesParesArray (int numeros[]) {
		int i, evenIndexSum = 0;
		for (i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 100); 
		}
		for (i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " "); // Mostramos el array	
		}
		System.out.println("\n"); // Salto de línea
		
		for (i = 0; i < numeros.length; i += 2) { //Si voy sumando de dos en dos me muevo solo en los pares.
			evenIndexSum += numeros[i];
		}
		
		System.out.println("La suma de los números pares es: " + evenIndexSum);
		
	}
	

	/**
	 * 
	 * @param filas
	 * @param cols
	 * @param valorInicial
	 * @return
	 */
	public static int[][] creaEInicializaMatriz (int filas, int cols, int valorInicial) {
		int m[][] = new int[filas][cols];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = valorInicial;
			}
		}
		
		return m;
	}
	
	
	/**
	 * 
	 * @param filas
	 * @param cols
	 * @param minimo
	 * @param maximo
	 * @return
	 */
	public static int[][] creaEInicializaMatrizAlAzar (
			int filas, int cols, int minimo, int maximo) {
		
		int m[][] = new int[filas][cols];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = Utils.obtenerNumeroAzarLimites(minimo, maximo);
			}
		}
		
		return m;
	}
	
	
	/**
	 * 
	 * @param m
	 */
	public static void imprimeMatriz (int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}

	/**
     * Método que imprime en pantalla las posibles posiciones (2) que podría tomar
     * una pieza de ajedrez (Alfil) en un tablero de ajedrez.
     * @param m Matriz con valores.
     * @param fila Fila donde se encuentra el alfil.
     * @param columna Columna donde se encuentra el alfil.
     */
    public static void imprimePosiblesPosicionesAlfil(int[][] m, int fila, int columna) {

            // Coloco el alfil en la posición indicada por el usuario.
            m[fila][columna] = 1;

            // Posiciones de la Diagonal Principal Inferior.
            for (int i = fila + 1, j = columna + 1; (i < m.length) && (j < m[i].length);
                            i++, j++) {
                    m[i][j] = 2;
            }

            // Posiciones de la Diagonal Principal Superior.
            for (int i = fila - 1, j = columna - 1; (i >= 0) && (j >= 0);
                            i--, j--) {
                    m[i][j] = 2;
            }

            // Posiciones de la Diagonal Secundaria Inferior.
            for (int i = fila + 1, j = columna - 1; (i < m.length) && (j >= 0);
                            i++, j--) {
                    m[i][j] = 2;
            }

            // Posiciones de la Diagonal Secundaria Superior.
            for (int i = fila - 1, j = columna + 1; (i >= 0) && (j < m[i].length);
                            i--, j++) {
                    m[i][j] = 2;
            }

            UtilsArrays.imprimeMatriz(m);

    }
    
    /**
	 * 
	 * @param array
	 * @param startIndex
	 * @param endIndex
	 */
	public static void rafanacci(double[] array, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            array[i] = (array[i - 1] * array[i - 2]) + (0.5 * array[i - 1]);
        }
    }
	
	/**
	 * Inicializa matriz eligiendo valor
	 * @param filas
	 * @param columnas
	 * @param valorInicial
	 * @return
	 */
	public static int[][] inicializarMatriz(int filas, int columnas, int valorInicial) {
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = valorInicial;
            }
        }

        return matriz;
    }
	
	/**
	 * Método que elimina el elemento del array y desplaza el resto para que quede libre la posición final
	 * @param array
	 * @param posicion
	 */
	public static void eliminarElementoArray(int[] array, int posicion) {
        for (int i = posicion; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
	}
	
	public static void encuentraMaxYMinEnMatriz (int matriz[][]) {
		//Vamos a inicializar las variables fuera de los límites para no influir en ellos y sea reemplazado 100%
		
		int maximo = -1;
		int minimo = 1001;
		int posMaxFila = -1, posMaxColumna = -1;
		int posMinFila = -1, posMinColumna = -1;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] > maximo) {
					maximo = matriz[i][j];
					posMaxFila = i;
					posMaxColumna = j;
				}
				if(matriz[i][j] < minimo) {
					minimo = matriz[i][j];
					posMinFila = i;
					posMinColumna = j;
				}
			}
		}
		System.out.println("La posición del mayor encontrado es: Fila " + posMaxFila + ", Columna " + posMaxColumna);
		System.out.println("La posición del menor encontrado es: Fila " + posMinFila + ", Columna " + posMinColumna);
	}
	
	/**
	 * 
	 * @param matriz
	 */
	public static void rellenarMatrizEntre0Y1000SinRepetirValores(int matriz[][]) {
		
		int randomNum;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				do {
					randomNum = Utils.obtenerNumeroAzarLimites(0, 1000);
				} while (estaNumeroEnMatriz(matriz, randomNum));
				matriz[i][j] = randomNum; //Si llegamos aquí es que el número aún no ha aparecido por lo que lo añadimos a la matriz
			}
		}
	}
	
	/**
	 * 
	 * @param matriz
	 * @param num
	 * @return
	 */
	public static boolean estaNumeroEnMatriz (int matriz [][], int num) {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == num) return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param a
	 */
	public static void ordenaPorBurbuja(int a[]) {
		boolean hayIntercambio;
		
		do {
			hayIntercambio = false;
			
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
				int aux = a[i];
				a[i] = a[i + 1];
				a[i + 1] = aux;
				hayIntercambio = true;
				}
			}
		}
		while (hayIntercambio);
		UtilsArrays.imprimeArray(a);
	}
	
	/**
	 * 
	 * @param a
	 */
	public static void ordenaPorInsercionDirecta(int a[]) { 
		
		for (int i = 1; i < a.length; i++) {
			int aux = a[i]; //Cambio
			int j = i - 1;
			while (j >= 0 && a[j] > aux) {
				a[j + 1] = a[j]; //Cambio
				j--;
			}
			a[j + 1] = aux; //Cambio
		}
		
		UtilsArrays.imprimeArray(a);
		
	}
	
	/**
	 * 
	 * @param a
	 */
	public static void ordenaPorShell(int a[]) { 
		for (int gap = (a.length / 10); gap > 0; gap /= 2) {
			for (int i = gap; i < a.length; i++) {
				int aux = a[i], j; //Tenemos que crear "j" aquí ya que si la creamos dentro del for su ámbito de vida no nos permite usarla 
//				fuera de éste para hacer el cambio con aux.
				for (j = i; j >= gap && a[j - gap] > aux; j -= gap) {
					a[j] = a[j - gap];
				}
				a[j] = aux;
			}
		}
		UtilsArrays.imprimeArray(a);
	}
	
	/**
	 * 
	 * @param a
	 */
	public static void ordenaPorSeleccion(int a[]) { 
		
		for (int i = 0; i < a.length - 1; i++) {
			int lowest = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[lowest]) {
					lowest = j;
				}
			} //Intercambios en el primer for
			int aux = a[lowest]; 
			a[lowest] = a[i];
			a[i] = aux;
		}	
		UtilsArrays.imprimeArray(a);
	}
	
	/**
	 * 
	 * @return
	 */
	public static int[][] generarTableroAjedrezParaDamas() {
        int[][] tablero = new int[8][8];

        // Inicializar el tablero con 0
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 0;
            }
        }

        // Colocar las damas en la posición inicial
        for (int i = 0; i < tablero.length; i += 2) {
            tablero[0][i] = 1;  // Fila 1
            tablero[2][i] = 1;  // Fila 3
            tablero[6][i] = 1;  // Fila 7
        }

        for (int i = 1; i < tablero.length; i += 2) {
            tablero[1][i] = 1;  // Fila 2
            tablero[5][i] = 1;  // Fila 6
            tablero[7][i] = 1;  // Fila 8
        }

        return tablero;
    }
	
	/**
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean sonAnagramasDosCadenas(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
                return false;
        }

        char[] arrayChar1 = obtenArrayCharAPartirDeString(str1);
        char[] arrayChar2 = obtenArrayCharAPartirDeString(str2);

        ordenaBurbujaArrayChar(arrayChar1);
        ordenaBurbujaArrayChar(arrayChar2);

        for (int i = 0; i < arrayChar1.length; i++) {
                if (arrayChar1[i] != arrayChar2[i]) {
                        return false;
                }
        }
        return true;
	}
	
	 /**
     * Método que utiliza la ordenación burbuja para ordenar los
     * caracteres de un array Char[], de menor a mayor.
     * @param chArray
     */
    public static void ordenaBurbujaArrayChar(char[] chArray) {
            char aux;
            boolean estaOrdenado = false;

            do {
                    estaOrdenado = true;
                    for (int i = 0; i < (chArray.length - 1); i++) {                
                            if (chArray[i] > chArray[i + 1]) {
                                    aux = chArray[i];
                                    chArray[i] = chArray[i + 1];
                                    chArray[i + 1] = aux;
                                    estaOrdenado = false;
                            }
                    }
            } while (estaOrdenado == false);
    }
	
    /**
     * Método que genera un array char[] a partir de una cadena de
     * caracteres.
     * @param str Cadena de caracteres.
     * @return Devuelve un array de caracteres.
     */
    public static char[] obtenArrayCharAPartirDeString(String str) {
        char[] arrayChar = new char[str.length()];
        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = str.charAt(i);
        }
        return arrayChar;
    }
    
}













