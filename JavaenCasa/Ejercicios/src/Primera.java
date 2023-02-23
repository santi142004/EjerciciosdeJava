import javax.swing.JOptionPane;

public class Primera {
	public static void main(String arg[]) {
		
		for (int i = 1; i <=4 ; i++) {
			String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
			double salarioActual=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu salario"));
			int categoria = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la categoria"));
			double pago;
			double bonificación;
			double descuento;
			
			switch (categoria) {
			case 1:
				 bonificación= 0.15;
				 descuento=0.02;
				pago=salarioActual+salarioActual*bonificación-salarioActual*descuento;
				JOptionPane.showMessageDialog(null,"señor "+nombre+ " su pago es de: "+pago );
				break;
			case 2:
				bonificación=0.10;
				descuento= 0.015;
				pago=salarioActual+salarioActual*bonificación-salarioActual*descuento;
				JOptionPane.showMessageDialog(null,"señor "+nombre+ " su pago es de: "+pago );
				break;
			case 3:
				bonificación=0.08;
				descuento=0.01;
				pago=salarioActual+salarioActual*bonificación-salarioActual*descuento;
				JOptionPane.showMessageDialog(null,"señor "+nombre+ " su pago es de: "+pago );
				break;
			case 4:
				bonificación=0;
				descuento=0.0;
				pago=salarioActual+salarioActual*bonificación-salarioActual*descuento;
				JOptionPane.showMessageDialog(null,"señor "+nombre+ " su pago es de: "+pago );
				break;
			}			
			
		}
		
	
	}

}
