package views.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComprarPassagem implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new Thread() {
			@Override
			public void run() {
				System.out.println("Bot�o pressionado!");
			}
		}.start();
	}
	
}
