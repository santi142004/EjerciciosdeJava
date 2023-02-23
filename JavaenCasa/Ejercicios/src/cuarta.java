import java.util.Scanner;

import javax.swing.JOptionPane;
public class cuarta {
	public static void main(String arg[]) {
		
		System.out.println("Primera parte ejercicio 3 ");
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Ingrese horas trabajadas");
		int horasTrabajo= sc.nextInt();
		
		int salario= horasTrabajo*2000;
		double impuesto= salario*0.1;
		double salarioTotal= salario-impuesto;
		
		System.out.println("Salario : "+salario);
		System.out.println("Impuesto : "+impuesto);
		System.out.println("Salario total : "+salarioTotal);
		
		System.out.println("Segunda parte ejercicio 4");
		
		final double INCREMENTO=0.25;
	    double salarioNuevo= salarioTotal +(salarioTotal*INCREMENTO);
	    System.out.println("El nuevo salario es de : "+salarioNuevo);
	    
	 /*   System.out.println("Tercera parte ejercicio 5"); 
	    double incremento;

	    System.out.println("Ingrese el incremeto que da el jefe (en porcentaje)");
		incremento= input.nextDouble()/100.0;*/
		
		
		
	}

}


