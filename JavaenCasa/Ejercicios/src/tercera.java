import javax.swing.JOptionPane;

public class tercera {
	public static void main (String arg[]) {
		
		double costoTratamiento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese costo de tratamiento:"));
	    int diasHospitalizacion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese dias de hospitalización"));
	    double costoMedicamentos= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo de los medicamentos"));
	    String pregunta= JOptionPane.showInputDialog("Es subsidiado");
	    boolean subsidio= pregunta.equalsIgnoreCase("si");
	    
	    
	    double costoHospitalizacion= diasHospitalizacion*100000;	
	    double total= costoTratamiento+costoHospitalizacion+costoMedicamentos;
	    
	    double descuento=0;

	     if (subsidio) {
			descuento= total*0.1;
		} else {
			descuento=total *0.05;

		}
	     double costoFinal= total-descuento;
	     JOptionPane.showMessageDialog(null, "el costo total de su hospitalizacion es de: "+costoFinal);
	}

}
