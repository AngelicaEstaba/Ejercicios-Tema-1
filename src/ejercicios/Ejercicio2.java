package ejercicios;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		

		       double montoTotal = 0;
		int cantInmu = 0, vehiculo, año, nuevo = 0, viejo = 0;
		boolean lujoPlus = false, vehiculosPlus = false, montoPlus = false, inmuePlus = false;
		String valida, modernos = " ", antiguos = " "; 

		//INGRESOS MENSUALES POR HOGAR
		System.out.println("De cuánto es el ingreso mensual en su hogar? ");
		Scanner sc = new Scanner(System.in);
		montoTotal = sc.nextDouble();

		//VALIDO SI LOS INGRESOS SUPERAN EL MÁXIMO IMPUESTO
		if (montoTotal >= 489083) {
		    montoPlus = true;
		}

		////////////////////////VEHÍCULOS////////////////////////

		//INGRESO CANTIDAD DE VEHÍCULOS
		System.out.println("Dispone de vehículos?, indique la cantidad o ingrese 0 si no tiene.");
		Scanner vc = new Scanner(System.in);
		vehiculo = vc.nextInt();

		//INGRESO AÑO DE LOS VEHÍCULOS INGRESADOS
		 for (int i = 1; i <= vehiculo; i++) {
		    System.out.println("Ingrese el año de su vehículo Nro: " + i);
		    año = sc.nextInt();
		    
		//VALIDO SI SON VEHÍCULOS MODERNOS O NO
		    if (año >= 2018) {
		        modernos += año + " ";
		        nuevo ++;
		    } else {
		        antiguos += año + " ";
		        viejo ++;
		    }
		}
		//SI POSÉE 3 O MÁS VEHÍCULOS MODERNOS, BOOLEO TRUE LA VARIABLE vehiculosPlus
		 if (nuevo >= 3) {
		     vehiculosPlus = true;
		 }

		 
		 ////////////////////////INMUEBLES////////////////////////
		 

		//INGRESO CANTIDAD DE INMUEBLES
		System.out.println("Ingrese la cantidad de inmuebles de los que es propietario: ");
		Scanner ic = new Scanner(System.in);
		cantInmu = ic.nextInt();


		//VALIDO SI POSÉE 3 O MÁS INMUEBLES
		if (cantInmu >= 3){
		    inmuePlus = true;
		}


		////////////////////////LUJOS////////////////////////

		//INGRESO DE CAPACIDAD ECONÓMICA PLENA
		System.out.println("Es poseedor de una embarcación, una aeronave de lujo o es titular de activos societarios que demuestren capacidad económica plena? Responda SI o NO");
		Scanner pc = new Scanner(System.in);
		valida = pc.next();
		    
		//Switcheo en caso de que el ingreso sea "si", "no" o sea otro, que lo determine como inválido.   
		switch (valida){
		 case "si":
		    lujoPlus = true;
		    System.out.println("Usted " + valida + " tiene posesiones de lujo");
		    break;
		 case "no":
		    lujoPlus = false;
		    System.out.println("Usted " + valida + " tiene posesiones de lujo");
		    break;
		 default:
		     System.out.println("No es un valor válido, vuelva a completar el formulario (INGRESE SU RESPUESTA EN minúsculas).");         
		     //FINALIZO EL PROCESO DEL PROGRAMA
		     System.exit(0);
		}

		//DETERMINO CON CONDICIONALES EL SEGMENTO AL QUE PERTENECE QUIEN INGRESÓ LOS DATOS
		if ((montoTotal >= 572386) || ( nuevo >= 3) || (cantInmu >= 3) || (lujoPlus == true)) {
		    System.out.println("Usted pertenece al segmento de ingresos ALTOS.");
		}

		else if ((montoTotal <= 163539) && (nuevo == 0) && (cantInmu <= 1) && (lujoPlus == false)) {

		    System.out.println("Usted pertenece al segmento de ingresos BAJOS.");
		    
		}
		else if ((montoTotal >= 163539) && (montoTotal <= 572386)  || ( nuevo == 1) || (cantInmu <= 2) && (lujoPlus == false)) {
		    System.out.println("Usted pertenece al segmento de ingresos MEDIOS.");
		}

		       
		    System.out.println("El ingreso mensual de su hogar es de: $" + montoTotal);
		    System.out.println("Tiene " + vehiculo + " vehículos, de los cuales "+nuevo+" son modernos y "+viejo+" no lo son");
		    System.out.println("Usted posée " + cantInmu + " inmuebles");
		    
		
		
	}

}
