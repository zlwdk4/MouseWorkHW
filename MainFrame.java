import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -979691148534081065L;
	
	private static MouseHereButton mb;

	public MainFrame(String title) {
		super(title);
		
		
		
		setSize(500, 300);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		Container contentPane = getContentPane();
		
		mb = new MouseHereButton();
		mb.setSize(200, 100);
		
		contentPane.add(mb , BorderLayout.CENTER);
		
		
		
	}



	



	public static void disableBtn() {
		// TODO Auto-generated method stub
		System.out.println("disabled");
		mb.setEnabled(false);
	}



	public static void enableBtn() {
		// TODO Auto-generated method stub
		System.out.println("enabled");
		mb.setEnabled(true);
		
	}

}
