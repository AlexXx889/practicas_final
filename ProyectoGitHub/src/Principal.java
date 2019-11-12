
/** 
 * Ejercicio GitHub del tema 3
 * 
 * Version: 1.0
 * Fecha creación: 04/12/2018
 * Copyright @author Camilo Juan
 */

import java.util.Scanner;

/**
 * Clase Principal y unica que realizará todo el trabajo
 * 
 * @author Cjc
 *
 */
public class Principal {
	static int iteraciones = 1;

	/*
	 * Funcion principal
	 */
	public static void main(String[] args) {
		boolean seguir = true;
		int opcionMenu = -1;

		while (seguir) {
			System.out.println("\n\n\n\n\nIteracion " + iteraciones + " de nuestro proyecto GitHub.");

			MostrarMenu();
			opcionMenu = pedirOpcion();
			seguir = RealizarAccion(opcionMenu);

			iteraciones++;
		}

	}

	/*
	 * Nos pedira un valor del menú mostrado y devolvera un valor correcto, Esta
	 * función no debe ser modificada por los alumnos
	 */
	public static int pedirOpcion() {
		int opcion = -1;
		do {
			System.out.print("Opcion que desea elegir: ");
			opcion = Entero();
		} while (opcion < 0 || opcion > 30);

		return opcion;
	}

	/*
	 * Procedimiento que unicamente muestra el menú, aquí cada alumno debe
	 * introducir su numero de opción dependiendo del numero de ejecricio que tenga
	 * asignado. En mi caso, tengo el 0.- que es una presentación del proyecto.
	 * (anyadir el nombre de la persona que lo crea)
	 */
	public static void MostrarMenu() {
		System.out.println("Elige una opcion de las propuestas a continuacion/n/n");
		System.out.println("0.- Presentacion (Camilo Juan)");
		System.out.println("2.-  Exercici 02 (Hector Lopez)");
		System.out.println("4.-  Ejercicio 01 (Alex Mihalache)");
		System.out.println("11.- Ejercicio11 (Carlos Moles Valdivieso)");
		System.out.println("12.- Ejercicio12 (Carlos Mota)");
     System.out.println("13.- Ejercicio13 (Javier Soler Artero)")
		System.out.println("18.- Ejercicio18 (Juanjo Nadal)");
    System.out.println("3.- Ejercicio03 (Samuel Moles)");
  	System.out.println("06.- Ejercicio06 (Víctor Carbonell Colomina)");
   	System.out.println("11.- Ejercicio11 (Carlos Moles Valdivieso)");

		System.out.println("22.- Ejercicio 22 (Sergi Cortés)");
		System.out.println("30.- Salir");
	}

	/*
	 * Nos devuelve un valor valido de nuestro menú
	 */
	public static int Entero() {
		/* Variables. */
		int entero = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Escribe un Entero: ");

		/*
		 * Bucle para pedir al usuario un entero y mientras no lo sea no sigue con la
		 * ejecución.
		 */
		while (!input.hasNextInt()) {
			System.out.print("Error, escribe un ENTERO Valido: ");
			input.next();
		}

		/* Almaceno el entero comprobado. */
		entero = input.nextInt();

		/* Una vez obtenido el entero lo devuelvo. */
		return entero;
	}

	/*
	 * Funcion que realizara la accion de llamar a cada uno de los ejercicios que
	 * deben haber creado cada uno de los alumnos. Debe ser modificada por cada uno
	 * de los alumnos
	 */

	public static boolean RealizarAccion(int pOpcionMenu) {

		boolean correcto = true;

		switch (pOpcionMenu) {
		case 0:
			System.out.println("Proyecto que une todos los ejercicios del Tema 4 en un solo fichero./n/n");
			break;
		case 1:
			break;
		case 2:
			exercici02();
			break;
		case 3:
            ejercicio03();
			break;
		case 4:
			actividad1();	
			break;
		case 5:
			break;
		case 6:
			ejercicio06();
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			ejercicio09();
			break;
		case 10:
			break;
		case 11:
			ejercicio11();
			break;
		case 12:
			ejercicio12();
			break;
		case 13:
            ejercicio13();
			break;
		case 14:
			ejercicio14();
			break;
		case 15:
			break;
		case 16:
			ejercicio16();
			break;
		case 17:
			ejercicio17();
			break;
		case 18:
			ejercicio18();
			break;
		case 19:
			break;
		case 20:
			ejercicio20();
			break;
		case 21:
			break;
		case 22:
			ejercicio22();
			break;
		case 23:
            ejercicio23();
			break;
		case 24:
			ejercicio24();
			break;
		case 25:
			break;
		case 26:
			ejercicio26();
			break;

		case 30:
			System.out.println("Adios, gracias por participar/n/n");
			correcto = false;
			break;

		default:
			System.out.println("No es un ejercicio valido/n");
			break;
		}

		return correcto;
	}


	/*
	 * A partir de aqui cada alumno realizara su ejercicio del Tema 4
	 */

	public static void exercici02() {
/*
     * Exercici 2 del tema 4
     * Este programa serveix per a comencar a treballar amb arrays i comprobarlos
     * 
     * @author Hector Lopez
     * @version 1
     * 
     */

    public class Ejercicio02 {
	    

		    /*
		     * Aci es declaren els arrays i a més es inicialitzen els arrays A i B
		     */

		    int[] arrayA = { 10, 20, 30, 40, 50 };
		    int[] arrayB = { 50, 60, 70, 80, 100 };
		    int[] arrayC = new int[5];
		    int suma = 0;

		    /*
		     * Aci es realitza una suma del enter de l'arrayA posicio tres i de l'enter de
		     * l'array B de posicio quatre
		     */
		    suma = arrayA[3] + arrayB[4];

		    /*
		     * Aci s'adjudica a la posicio 1 de l'arrayC el resultat de la suma mes l'enter
		     * de la posicio cero de l'arrayA
		     */
		    arrayC[1] = suma + arrayA[0];

		    System.out.println(suma);
		    System.out.println(arrayC[1]);

		    System.out.println(arrayC);

		    if (arrayA.length >= 6) { // Si la longitud de l'arrayA es major o igual que 6
			    System.out.println(arrayA[5]); // S'imprimix el sext element
		    }

		    else {
			    System.out.println("El tamaÃ±o del arrayA es " + arrayA.length); // Si no s'imprimix la longitud
		    }

	    

    }


      /*
       *Samuel Moles Bellvert
       */


	public static void ejercicio03() {
		
		int suma = 0;
		int contador = 0;
		int posicion = 0;
		
		int arrayA [] = {10, 20, 30, 40, 50, 60};
		int arrayB [] = {50, 60, 70, 80, 100};
		
		int arrayC [] = new int [5];
		for(contador = 0; contador < 4; contador++); //Inicializamos el arrayC
				arrayC[contador] = 0;
		
		Scanner teclado = new Scanner (System.in);
				
		suma = arrayA[3] + arrayB[4];
		arrayC[2] = suma + arrayA[1];
		
	
		
		if (arrayA.length <= 6) //Comprobamos que la longitud del arrayA sea <= 6
			System.out.println(arrayA[5]);
		
		else
			System.out.println("El número máximo de valores del arrayA es 6");
	}
}
    

    
	

	/*
	 *
	 * Carlos Moles Valdivieso
	 */
	public static void ejercicio11() {

		int cont = 0;
		int suspendido = 0;
		int aprobado = 0;
		int notable = 0;
		int excelente = 0;

		double[] Notas = { 4.5, 7.9, 2.4, 6.7, 9.9, 4.9, 6.5, 8, 4, 3, 7, 5 };

		/*
		 * El siguiente bucle lee el array con las notas y va añadiendo contadores a la
		 * sección que corresponda la nota
		 */
		for (cont = 0; cont < Notas.length; cont++) {
			if ((Notas[cont] >= 0) && (Notas[cont] < 5)) {
				suspendido = suspendido + 1;
			} else if ((Notas[cont] >= 5) && (Notas[cont] < 7)) {
				aprobado = aprobado + 1;
			} else if ((Notas[cont] >= 7) && (Notas[cont] < 9)) {
				notable = notable + 1;
			} else if ((Notas[cont] >= 9) && (Notas[cont] <= 10)) {
				excelente = excelente + 1;
			} else
				System.out.println(Notas[cont] + " No es una nota valida");
		}
		/*
		 * En los siguientes bucles se imprime cada seccion de notas con el numero de
		 * personas en cada sección (añade un * por contador)
		 */
		System.out.println("Grafico de barras de las notas \n");
		System.out.print("Suspendidos: ");

		for (cont = 0; cont < suspendido; cont++) {
			System.out.print("*");
		}

		System.out.println();
		System.out.print("Aprobados: ");

		for (cont = 0; cont < aprobado; cont++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("Notables: ");

		for (cont = 0; cont < notable; cont++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("Excelentes: ");

		for (cont = 0; cont < excelente; cont++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void ejercicio12() {

		// Vectores

		// Array "original"
		int[] arrayOriginal = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		// Aray "copia"
		int[] arrayCopia = new int[10];

		System.out.print("arrayCopia = ");

		// Asignamos valores y los imprimimos (comprobamos que se está realizando
		// correctamente la copia).
		for (int i = 0; i < arrayCopia.length; i++) {

			arrayCopia[i] = arrayOriginal[i];
			System.out.print(arrayCopia[i] + " ");

		}


	}


    public static void ejercicio13(){

        
        int Auxiliar = 0;
	    int[] Array = {1, 8, 4, 2, 5};
	    
	    for(int i = 1; i < Array.length; i++) {			//Este bucle es el encargado reservar la variable que se va a comparar con todas las que la preceden
		    
		    for(int j = i; j > 0; j--) {				//Aquí se comparará la variable que queremos comparar con el conjunto que la precede
			    
			    if (Array[j] < Array[j-1]) {			//En caso de que en la posición del array que esté la variable reservada sea menor que la que la precede
				    
				    //INTERCAMBIO DE VARIABLES
				    Auxiliar = Array[j];				
				    Array[j] = Array[j-1];
				    Array[j-1] = Auxiliar;
				    
			    }
			    
		    }
		    
	    }
	    
	    for(int k = 0; k < Array.length; k++) {			//Impresión de los valores ordenados
		    
		    System.out.println(Array[k]);
		    
	    }

    }   
	

	/* Ejercicio 16, Tema 4, Alejandro Rozas */
	public static void ejercicio16() {

		double[][] tabla = { { 1.0, 2.0, 3.0, 4.0 }, { 5.0, 6.0, 7.0, 8.0 }, { 9.0, 10.0, 11.0, 12.0 },
				{ 13.0, 14.0, 15.0, 16.0 } }; // Array bidimensional con numeros reales
												// Ya introducidos

		// Este for pasara valor a valor todos los valores de el Array
		for (int fila = 0; fila < tabla.length; fila++) {
			for (int columna = 0; columna < tabla[fila].length; columna++) {
				System.out.print(tabla[fila][columna] + "\t"); // Imprimira cada valor del array si se cumplen las
																// condiciones

			}
			System.out.println("");
		}
	}


	/*
	 * Ejercicio18 Tema 4 ---> Juanjo Nadal
	 */
	public static void ejercicio18() {
		// Se inicializa el array con todas las notas de forma estática
		double[][] aNotas = { { 6.0, 7.2, 2.3, 5.8, 3.4 }, { 7.8, 1.6, 4.6, 9.4, 3.1 }, { 3.6, 1.4, 8.9, 3.5, 6.5 },
				{ 2.5, 3, 10, 2.4, 8.9 } };


	public static void ejercicio06(){
		
		int numValoresLeidos = 0;
       		int[] array = new int[5];

        	boolean salir=false;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe" + array.length + "enteros. Puedes hacerlo en disferentes lineas.");

		while (numValoresLeidos < array.length && salir ==false) {

			if (input.hasNextInt()) {
				int valor = input.nextInt();
				if (valor ==-1){
					salir =true;
				}else{
					array[numValoresLeidos] =valor;
					System.out.println("Valor" + numValoresLeidos + "leidos" + valor);
					numValoresLeidos++;
				}
				
			} else {
				input.next();
				System.out.println("Introduce un valor valido");
			}
			
		}
		input.close();
		System.out.println("Ya se han leído" + numValoresLeidos + "valores");
		System.out.println(array[0] + "" + array[1] + "" + array[2] + "" + array[3] + "" + array[4]);
	}

    /*
     * Ejercicio18 Tema 4 ---> Juanjo Nadal
     */
	public static void ejercicio18()
    {
    //Se inicializa el array con todas las notas de forma estática
		double[][] aNotas = {{6.0, 7.2, 2.3, 5.8, 3.4}, 
                            {7.8, 1.6, 4.6, 9.4, 3.1}, 
                            {3.6, 1.4,  8.9, 3.5, 6.5}, 
                            {2.5, 3, 10, 2.4, 8.9}};

		double[][] aMediaMaxima = new double[4][2];

		double suma = 0.0; // Corresponde a la nota media
		double maxima = 0.0; // Corresponde a la nota maxima
		double nota = 0.0;

		int fila = 0;
		int columna = 0;
		int posicion = 0;
		int i = 0;

		// Inicializacion a 0 del array bidimensional aMediaMaxima
		for (fila = 0; fila < aMediaMaxima.length; fila++) {
			for (columna = 0; columna < aMediaMaxima[fila].length; columna++) {
				aMediaMaxima[fila][columna] = 0.0;
			}
		}

		// Bucles para obtener la nota media y nota maxima
		for (fila = 0; fila < aNotas.length; fila++) {
			// Cada vez que se repita el bucle estas variables no contendran valores de
			// previas iteraciones
			maxima = 0;
			suma = 0;
			for (columna = 0; columna < aNotas[fila].length; columna++) {
				// Coloca en la vble maxima la nota máxima de la fila, es decir del alumno
				if (aNotas[fila][columna] > maxima) {
					maxima = aNotas[fila][columna];
				}

				// Va sumando la notas de la fila para mas tarde hacer la media
				suma = suma + aNotas[fila][columna];
			}

			// Se hace la media del alumno (suma de todas las cifras / cantidad de cifras)
			suma = suma / aNotas[0].length;

			// Se añade al array las notas medias y maximas
			aMediaMaxima[fila][0] = suma;
			aMediaMaxima[fila][1] = maxima;
		}

		// Se imprimen los valores del array
		for (fila = 0; fila < aMediaMaxima.length; fila++) {
			for (columna = 0; columna < aMediaMaxima[fila].length; columna++) {
				System.out.println(aMediaMaxima[fila][columna]);
			}
			System.out.println(" ");
		}

		// Bucle para imprimir cual de los alumnos tiene las mejores notas
		/*
		 * En su primera iteracion se comprobaran las notas medias y se selecciona la
		 * mayor En la segunda iteracion hara lo mismo para la nota maxima
		 */
		for (columna = 0; columna < aMediaMaxima[0].length; columna++) {
			nota = aMediaMaxima[0][columna];// Con esto el valor de nota simpre sera el primer valor de la columna, ya
											// sea madia o nota maxima
			for (fila = 0; fila < 4; fila++) {
				if (nota < aMediaMaxima[fila][columna]) {
					nota = aMediaMaxima[fila][columna];
					posicion = fila;
				}
			}

			// Primera iteracion corresponde a nota media por lo que columna == 0
			if (columna == 0) {
				System.out.print("La mejor nota media es para el alumno ");
			} else {
				System.out.print("La mejor nota maxima es para el alumno ");
			}

			// Dependiendo de la posicion sera un alumno u otro
			switch (posicion) {
			case 0: {
				System.out.println("Espinete con un: " + nota);
				break;
			}
			case 1: {
				System.out.println("Don Pinpon con un: " + nota);
				break;
			}

			case 2: {
				System.out.println("Gustavo con un: " + nota);
				break;
			}
			default: {
				System.out.println("Triki con un: " + nota);
				break;
			}
			}
		}
	}



	public static void ejercicio09() {

		int i = 1;
		int num = 0;
		int notas = 0;
		int total = 0;
		int media = 0;
		int notamayor = 0;
		int[] arrayA = new int[num];

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce cuantas notas se van a leer");

		while (teclado.hasNextInt() == false) {// bucle que compueba si es un entero
			System.out.print("Introduce un entero");
			teclado.next();
		}
		num = teclado.nextInt();

		for (i = 1; i <= num; i++) {// bucle para introducir los numeros que se han solicitado antes
			System.out.print("Introduce  numeros ");

			while (teclado.hasNextInt() == false) {// bucle que compueba si es un entero
				System.out.print("Introduce un entero");
				teclado.next();
			}
			notas = teclado.nextInt();
			while (notas >= 0 && notas <= 10) {// bucle que comprueba si el valor esta entre 0 y 10
				arrayA[num] = notas;
				System.out.print("nota valida ");

				if (notas > notamayor) {
					notamayor = notas;
				}

				total = total + notas;
			}
		}
		media = total / num;

		System.out.println("notas: " + arrayA);

		System.out.print("media: " + media + "nota mas alta" + notamayor);

	}

	public static void ejercicio14() {

         int [] A = {30,15,2,21,44,8,4,23,60,75};
		 
		 int i=0, k=0, buscapeque=0, pospeque=0, aux=0;
		 
		 for(i=0;i<A.length;i++) { //Bucle que recorre el array hasta el final
			 
			 k=A[i];//Guardamos el mínimo
			 pospeque=i;// y su posición 
			 
			 for(buscapeque=i;buscapeque<A.length;buscapeque++) { //Bucle que recorre el array 
				 
				 if(k>A[buscapeque]) { //Condición para cambiar
					 
					 k=A[buscapeque];
					 pospeque=buscapeque;
				 }
			 }
			 /**
			  * Intercambio de variables
			  */
			 aux = A[pospeque];
			 A[pospeque] = A[i];
			 A[i] = aux;
		 }
		 for (i=0;i<A.length;i++) { //Imprimimos el array
			 
			 System.out.print(A[i] + " ");
		 }

    }

	/**
	 * Ejercicio 22 del Tema 4 - Sergi Cortés
	 */
	public static void ejercicio22()
	{
		/* Variables */
		int posiPrimero=0;														// Primera Posición del caracter
		int posiUltimo=0;														// Ultima Posición del caracter
		char caBusca=' ';														// Caracter a buscar
		String cadena="";														// Frase
		Scanner input=new Scanner (System.in);
		
		System.out.println("Introduce un texto (Puede contener espacios)");
		cadena=input.nextLine();												// Usuario Introduce texto
		
		System.out.print("Caracter a buscar: ");
		caBusca=input.next().charAt(0);											// Usuario Introduce caracter a buscar
		
		/* Si el caracter existe continua */
		if(cadena.indexOf(caBusca)!=-1)
		{
			posiPrimero=cadena.indexOf(caBusca);								// Busca el primer "indice" del caracter que le pasemos
			System.out.println("La primera posicion: "+posiPrimero);
			
			posiUltimo=cadena.lastIndexOf(caBusca);								// Busca el ultimo "indice" del caracter que le pasemos
			System.out.println("La Ultima posición: "+posiUltimo);
		}
		
		/* Si no existe se imprime un mensaje al respecto */
		else
			System.out.println("No existe este caracter en la frase.");
	}

	public static void ejercicio26()
	{
		int contador=0;															/*En estas lineas Iniciamos las variables*/
		boolean sicierto=false;
		String cadena=" ";
		Scanner kb=new Scanner (System.in);
		
		System.out.println("Inserte una frase");								/*Aqui pedimos que inserte una cadena y la guardamos en la string cadena */
		cadena=kb.nextLine();
		
		char [] array=new char [cadena.length()];								/*Inicializamos la array de char tan larga como sea la cadena*/
		
		for(contador=0;contador<cadena.length();contador++) 					/*Aqui nos metemos en un bucle, hasta que contador sea menor que la longitud de la cadena */
		{
			array[contador] = cadena.charAt(contador); /* Aqui insertamos en el array caracter a caracter */
			System.out.print(cadena.charAt(contador) + " = " + array[contador] + " :");

			sicierto = array[contador] == cadena
					.charAt(contador); /* Aqui hacemos una comparacion para ver si son iguales o no */

			if (sicierto) /* Si es cierto al lado de cada letra aparecera que coinciden */
			{
				System.out.println("Coinciden");
			} else /* Si no dira que no coinciden */
			{
				System.out.println("No coincide");
			}

		}
	}

	public static void ejercicio24(){
		/*
		 * declaramos las variables
		 */
		String[] cadena = {"wz","ap","wx", "ac"}; 
		int cont = 0;
		int cont2 = 0;
		String aux = "a";
		
		/*
		 * En este bucle for iremos augmentando el contador "cont" que nos servira
		 *  para cojer las posiciones de los valores a comparar
		 */
		for (cont = 1; cont < cadena.length; cont++) { 
			/*
			 *En este bucle for iremos augmentando el contador "cont2" que nos
			 * servira para cojer las posiciones de comparacion
			 */
			for (cont2 = cont; cont2 > 0; cont2--) {				
				
				/*
				 *  En este if comprovamos si la comparacion es negativa,en caso 
				 *  de serlo cambiaremos los valores de posicion
				 */
				if (cadena[cont2].compareTo(cadena[cont2-1]) < 0) {
					
					/*
					 * Utilizamos la variable aux para almacenar el valor de la cadena "pos x+1"
					 */
					aux = cadena[cont2]; 	
					/*
					 *  Cambiamos el valor de la cadena para cambiar el orden "pos x+1" por "pos x"
					 */
					cadena[cont2] = cadena[cont2-1];
					/*
					 * Volvemos a cambiar el valor de la cadena para dejarlo ya ordenado "pos x" = al valor de "aux"
					 */
					cadena[cont2-1] = aux; 							
				}

			}

		}
		/*
		 * En este bucle for utilizamos el contador para imprimir todas
		 * las posiciones del array
		 */
		for (cont = 0; cont < cadena.length; cont++) { 				
			System.out.print(cadena[cont] + " ");
		}
	}

	public static void ejercicio20(){
	/*
	 * Coger el valor de la string introducida por teclado y cambiar las minúsculas
	 * por las mayúsculas
	 */

	public static void main(String[] args) {

			int longitud = 0;
			int i = 0;
			char letra = 'a';
			String frase = "";
			Scanner teclado = new Scanner(System.in);


			int longitud = 0;
			int i = 0;
			char letra = 'a';
			String frase = "";
			Scanner teclado = new Scanner(System.in);

			/* Fin de las declaraciones de variables */

			System.out.print("Escriba una frase: ");
			frase = teclado.nextLine();
			longitud = frase.length();

			for (i = 0; i < longitud; i++) { // Este for se encarga de pasar por cada carácter de la cadena

				if ((frase.charAt(i) >= 'a') && (frase.charAt(i) <= 'z')) { // Si está entre la a y la z minúsculas, hazla mayúscula

					letra = (char) (frase.charAt(i) - ' ');
					System.out.print(letra);

				} else {

					letra = (char) (frase.charAt(i)); // Sino, imprime la letra tal cual
					System.out.print(letra);

				}
			}

		}

ejercicio17();


    public static void ejercicio23(){
        import java.util.Scanner;
        Scanner teclado = new Scanner(System.in);
        
        String premio = "premio";											//Declaro un String llamado premio que contiene la palabra premio.
        
        System.out.println("Introduce una palabra, a ver si aciertas!");
        
        String palabra = "a";												//Declaramos otro String (palabra) y la igualamos a un valor en este caso "a".
        
        while(!premio.equals(palabra)) {									//Este bucle while nos pedirá que intoduzcamos una palabra o valor mientras que el string intoducido por teclado no sea igual al que tenemos nosotros guardados.
	        
	        System.out.println("Prueba");
	        palabra = teclado.nextLine();									//Igualo el String palabra a la siguiente linea introducida por teclado.
        }
        System.out.println("Has acertado!");								//Cuando los dos String coincidan, se saldrá del bucle y mostrará este mensaje.
        teclado.close();
    }
}
ejercicio17();

import java.util.Scanner;

public class ejercicio16 {
	public static void main(String[] args) {
		boolean pedir = false;
		Scanner teclado = new Scanner(System.in);
		do {
			if (teclado.hasNextInt() == false) {
				System.out.print("vuelve a introducir el numero: ");
				teclado.next();
			} else {
				if (teclado.nextInt() <= 10 && teclado.nextInt() >= 0) {
					pedir = true;
				}
			}

		} while (pedir = false);
	}
}
public class actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1, y=1;
		long tabla=actividad1_1.tablas(x,y);
	}
	static int tablas (int a, int b) {
		
		for(int x=1; x<=10; x++) {
			System.out.println("------Tabla del "+x+"------");
			
			for (int y=1; y<=10; y++) {
				System.out.println(x+"*"+y+"="+x*y);
			}
		}
		return a & b;
	}

}
