package sports;

import javax.swing.JOptionPane;

public class RecomendadorDeportes {

	public static void main(String[] args) {

		String kk;
		
		int temperatura;
		do {
				
			kk = JOptionPane.showInputDialog("¿Qué temperatura hace ahora?");
			temperatura = Integer.parseInt(kk);
			System.out.println("Hoy se recomienda practicar: " + recomiendaDeporte(temperatura));
		}
		
		while (true);

	}

	public static String recomiendaDeporte(int temperatura) {
        if (temperatura > 30) {
            return "Natación";
        } else if (temperatura > 22) {
            return "Tenis";
        } else if (temperatura > 16) {
            return "Fútbol";
        } else if (temperatura > 5) {
            return "Ajedrez";
        } else {
            return "Esquí";
        }
    }
	
}
