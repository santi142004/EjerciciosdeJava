import javax.swing.JOptionPane;

public class Segundo {
	public static void main(String arg[]) {
		final double INCREMENTO =0.30;
		double salario= 1000000;
		double salarioFinal= salario +(salario * INCREMENTO);
		System.out.println("El salario final es de: "+salarioFinal );
		
		String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
		System.out.println(nombre);

		
	}
}
