import javax.swing.JFrame;

//There is no way to press the button when it becomes disabled

public class App {

	public static void main(String[] args) {
		MainFrame frame = new MainFrame("Mousey App");
		frame.setSize(500, 300);
		frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        frame.setVisible(true);

        System.out.println("Program begins...");

	}

}
