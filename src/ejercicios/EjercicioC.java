package ejercicios;

public class EjercicioC {

	public static void main(String[] args) {
		/*1. Vamos a practicar operaciones básicas con números
		a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
		y “b”. Su código puede arrancar (por ejemplo):
		int numeroInicio = 5;
		int numeroFin = 14;
		// Se deberían mostrar los números:
		5,6,7,8,9,10,11,12,13,14
		b. A lo anterior, solo muestre los números pares
		c. A lo anterior, con una variable extra, elija si se deben mostrar los números
		pares o impares
		d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
		*/

		      int numeroInicio = 5;
		      int numeroFin = 14;
		      boolean par = false;

		    
		        //C
		      if (par == true){
		      while (numeroInicio <= numeroFin){
		           if((numeroInicio % 2) == 0){
		      System.out.println(numeroInicio);}
		      numeroInicio ++;
		      }} else {
		          while (numeroInicio <= numeroFin){
		           if((numeroInicio % 2) != 0){
		      System.out.println(numeroInicio);}
		      numeroInicio ++;
		 
		          }
		 }


	}

}
