import javax.swing.JOptionPane;

public class Menu {
	public static void main(String arg[]) {
		int codMenu=0,codMenuTipico=0,codMenuCarta=0,codMenuInternacional=0,totalPlatos=0;
		int total=0;
		int platosTipicos=0,platosCarta=0,platosInternacional=0;
		String nombre= JOptionPane.showInputDialog("Ingrese su nombre");
	
		
		do {
		
			
		
			String menu="MENU RESTAURANTE\n\n";
			menu+="1. Plato tipico\n";
			menu+="2. Plato a la carta\n";
			menu+="3. Plato internacional\n";
			menu+="4. Salir\n\n";
			menu+="Por favor seleccione una opción \n";
			codMenu=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (codMenu) {
			case 1:
				////do {
				String menuTipico="MENU TIPICO\n\n";
				menuTipico+="1. Frijoles\n";
				menuTipico+="2. Sopa de Verduras\n";
				menuTipico+="3. Regresar\n";
				menuTipico+="Por favor seleccione una opción \n\n";
				codMenuTipico=Integer.parseInt(JOptionPane.showInputDialog(menuTipico));
				
				switch (codMenuTipico) {
				case 1:
					JOptionPane.showMessageDialog(null, "Se ha solicitado el plato de frijoles, el costo es de $"+10000);
					total+=10000;
					platosTipicos++;
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Se ha solicitado la Sopa de Verduras, el costo es de $"+6000);
					total+=6000;
					platosTipicos++;
					break;
				case 3:
					
					break;
				default: 
					JOptionPane.showMessageDialog(null, "No corresponde a"	+ "un codigo valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
				////	i--;
					break;
				}
				////}while(codMenuTipico != 3);
				break;	
			case 2:
				////do {
				String menuCarta="MENU A LA CARTA\n\n";
				menuCarta+="1. Trucha Marinera\n";
				menuCarta+="2. Cazuela de Mariscos\n";
				menuCarta+="3. Regresar\n";
				menuCarta+="Por favor seleccione una opción \n\n";
				codMenuCarta=Integer.parseInt(JOptionPane.showInputDialog(menuCarta));
				
				switch (codMenuCarta) {
				case 1:
					JOptionPane.showMessageDialog(null, "Se ha solicitado la Trucha Marinera, el costo es de $"+45000);
					total+=45000;
					platosCarta++;
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Se ha solicitado la Cazuela de Mariscos, el costo es de $"+48000);
					total+=48000;
					platosCarta++;
				case 3:
					
					break;
				default: 
					JOptionPane.showMessageDialog(null, "No corresponde a" + "un codgio valido","ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
					////i--;
					break;
				}	
				////} while (codMenuCarta != 3);
				break;
			case 3:
				////do {
				String menuInternacional="MENU INTERNACIONAL\n\n";
				menuInternacional+="1. Fideos de Arroz con Gambas\n";
				menuInternacional+="2. Pulpo a la Parrilla\n";
				menuInternacional+="3. Regresar\n";
				menuInternacional+="Por favor seleccione una opción \n\n";
				codMenuInternacional=Integer.parseInt(JOptionPane.showInputDialog(menuInternacional));
				
				switch (codMenuInternacional) {
				case 1:
					JOptionPane.showMessageDialog(null, "Se ha solicitado los Fideos de Arroz con Gambas, el costo es de $"+55000);
					total+=55000;
					platosInternacional++;
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Se ha solicitado el Pulpo a la Parrilla, el costo es de $"+65000);
					total+=65000;
					platosInternacional++;
					break;
				case 3:
					
					break;
				default:
					JOptionPane.showMessageDialog(null, "No corresponde a " + " un codigo valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
					////i--;
					break;
				}
				////} while (codMenuInternacional != 3);
			default:
				break;
			}
			total++;
			totalPlatos=platosTipicos+platosCarta+platosInternacional;
		
		
		} while (codMenu!= 4);
		
		/*JOptionPane.showMessageDialog(null, "se procesaron " +totalPlatos+ " platos en total ");
		JOptionPane.showMessageDialog(null, "se procesaron " +platosTipicos+ " platos tipicos");
		JOptionPane.showMessageDialog(null, "se procesaron " +platosCarta+ " platos a la carta");
		JOptionPane.showMessageDialog(null, "se procesaron " +platosInternacional+ " platos Internacionales");
		JOptionPane.showMessageDialog(null, "Señor " +nombre+ " el total de la cuenta es $"+total);*/
		String cuenta="señor " +nombre+ " se procesaron " +totalPlatos+ " platos en total\n\n";
		cuenta+="se procesaron " +platosTipicos+ " platos tipicos\n";
		cuenta+="se procesaron " +platosCarta+ " platos a la carta\n";
		cuenta+="se procesaron " +platosInternacional+ " platos internacionles\n";
		cuenta+="el total de la cuenta es de $"+total+ "\n\n";
		cuenta+= "Por favor realizar el pago";
		int totalCuenta=Integer.parseInt(JOptionPane.showInputDialog(cuenta));
		if (totalCuenta == total) {
			JOptionPane.showMessageDialog(null, "Gracias por venir, vuelva pronto");
		} else {
			JOptionPane.showMessageDialog(null, "ese no es el valor de la cuenta");
			totalCuenta=Integer.parseInt(JOptionPane.showInputDialog(cuenta));
		}
		
	}
}




