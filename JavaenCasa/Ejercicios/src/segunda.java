import javax.swing.JOptionPane;
public class segunda {
 public static void main(String[] arg) {
	 
           String preg="";
	        do {
	    int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        if (numero < 0) {
            numero = numero*-1;
            JOptionPane.showMessageDialog(null, "El número positivo es: " + numero);
        } else {
        	JOptionPane.showMessageDialog(null, "El número ingresado es: " + numero);
        }
        preg=JOptionPane.showInputDialog("Desea continuar, " + "ingrese si para continuar");
    } while(preg.equalsIgnoreCase("si"));
 
 }
}



   

