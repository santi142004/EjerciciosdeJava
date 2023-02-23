import javax.swing.JOptionPane;

public class Novena {
	public static void main (String arg[]) {
	      double salario=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario"));
	      double aumento, nuevoSalario;
	      
	       	if (salario >= 500000) {
	       		aumento= salario*0.08;	
			} else {
				aumento= salario*0.1;
			}
	       	nuevoSalario= salario+aumento;
	       	JOptionPane.showMessageDialog(null, "El nuevo salario es de : "+nuevoSalario);
	       	
	}

}
