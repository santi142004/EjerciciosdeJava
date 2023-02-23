import javax.swing.JOptionPane;

public class Decima {
	public static void main(String arg[]){
		
		double nota1,nota2,nota3,promedio;
		
		nota1= Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 1"));
		nota2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 2"));
		nota3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 3"));
		promedio= (nota1+nota2+nota3)/3;
		
		if (promedio>= 3.0) {
			JOptionPane.showMessageDialog(null,"Usted aprobo el curso y su nota es de : "+promedio);
		} else {
			JOptionPane.showMessageDialog(null,"Usted reprobo el curso y su nota es de : "+promedio);
		}
		
	}

}
