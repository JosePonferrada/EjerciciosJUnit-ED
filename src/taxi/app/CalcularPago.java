package taxi.app;

import javax.swing.JOptionPane;

public class CalcularPago {

	public static void main(String[] args) {
		
		double kms;
		
		do {
				
		String kk = JOptionPane.showInputDialog("¿Cuántos kms ha recorrido?");
		kms = Double.parseDouble(kk);
		}
		
		while (kms < 0);
	
		System.out.println("El importe a pagar es: " + pago(kms) + "€");

	}
	
	public static double pago(double kms) {
		
		double cantidad = 20;
			
		if (kms > 30) {
			
			if(kms < 100) {
				cantidad += (kms - 30) * 0.6;
			} else {
				cantidad += ((70 * 0.6) + (kms - 100) * 0.4);
			}
		} 
		return cantidad;
	}

}
