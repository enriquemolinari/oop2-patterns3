package ui;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Main().start();
			}
		});
	}

	private void start() {
		new CajeroUI(new SwingMonitorDeCuenta()).iniciar();
	}
}
