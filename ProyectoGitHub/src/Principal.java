/** 
 * Ejercicio GitHub del tema 3
 * 
 * Version: 1.0
 * Fecha creaci�n: 04/12/2018
 * Copyright @author Camilo Juan
 */

import java.util.Scanner;

/**
 * Clase Principal y unica que realizar� todo el trabajo
 * @author Cjc
 *
 */
public class Principal {
	static int iteraciones=1;

	/*
	 * Funcion principal
	 */
	public static void main(String[] args) {
		boolean seguir=true;
		int opcionMenu=-1;
		
		while(seguir) {
			System.out.println("\n\n\n\n\nIteracion "+iteraciones+ " de nuestro proyecto GitHub.");
			
			MostrarMenu();
			opcionMenu=pedirOpcion();
			seguir=RealizarAccion(opcionMenu);
			
			iteraciones++;
		}
		

	}
	
	
	
	
	/*
	 * Nos pedira un valor del men� mostrado y devolvera un valor correcto,
	 * Esta funci�n no debe ser modificada por los alumnos
	 */
	public static int pedirOpcion() 	{
		int opcion=-1;
		do
		{
			System.out.print("Opcion que desea elegir: ");
			opcion=Entero();
		}
		while(opcion<0 || opcion>30);
		
		return opcion;
	}
	
	
	
	
	/*
	 * Procedimiento que unicamente muestra el men�, aqu� cada alumno debe introducir 
	 * su numero de opci�n dependiendo del numero de ejecricio que tenga asignado.
	 * En mi caso, tengo el 0.- que es una presentaci�n del proyecto. (anyadir el nombre
	 * de la persona que lo crea) 
	 */
	public static void MostrarMenu() 	{
		System.out.println("Elige una opcion de las propuestas a continuacion/n/n");
		System.out.println("0.- Presentacion (Camilo Juan)");
		System.out.println("30.- Salir");
	}
	
	
	
	
	/* 
	 * Nos devuelve un valor valido de nuestro men�
	 */
	public static int Entero()
	{
		/* Variables. */
		int entero=0;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Escribe un Entero: ");
		
		/*
		 * Bucle para pedir al usuario un entero y mientras no 
		 * lo sea no sigue con la ejecuci�n.
		 */
		while(!input.hasNextInt())
		{
			System.out.print("Error, escribe un ENTERO Valido: ");
			input.next();
		}
		
		/* Almaceno el entero comprobado. */
		entero=input.nextInt();
		
		/* Una vez obtenido el entero lo devuelvo. */
		return entero;
	}
	
	
	
	/*
	 * Funcion que realizara la accion de llamar a cada uno de los ejercicios 
	 * que deben haber creado cada uno de los alumnos. Debe ser modificada por
	 * cada uno de los alumnos 
	 */

	public static boolean RealizarAccion(int pOpcionMenu) {
		
		boolean correcto=true;
		
		switch (pOpcionMenu) {
			case 0:
				System.out.println("Proyecto que une todos los ejercicios del Tema 4 en un solo fichero./n/n");
				break;
			
			case 30:
				System.out.println("Adios, gracias por participar/n/n");
				correcto=false;
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
	
}
