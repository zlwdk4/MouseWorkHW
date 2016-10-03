import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class MouseHereButton extends JButton implements MouseListener{

	public MouseHereButton() {
		// TODO Auto-generated constructor stub
		super("Mouse Here!");
		addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		MainFrame.disableBtn();
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		MainFrame.enableBtn();
		
	}

}
