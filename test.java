import javax.swing.JFrame;
import javax.swing.JLabel;
/*
*clic droit projet
*configure
*create module info java
*/
import javax.swing.JPanel;

public class JFImc extends JFrame {
	public JFImc(){
		this.setTitle("Calcul de l'IMC");
		this.setDefaultCLoseOperation(JFrame.EXIT_ON_ClOSE);
		this.setBounds(100, 100, 300, 200);

        JPanel pnCentre = new JPanel();
        pnCentre.setLayout(new GridLayaout(2,2));
        JLabel lb1 = new JLabel("")
	}

	public static void main(String[] args) {
		JFImc imc = new JFImc();
		imc.setVisible(true);

	}

}