import javax.swing.JFrame;

public class SnakeGame{
 public void frame()
 {
	    JFrame a=new JFrame("SNAKE GAME");
        Pannel ob=new Pannel();
		a.add(ob);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setResizable(false);
		a.pack();
		a.setVisible(true);
		a.setLocationRelativeTo(null);
		
	}
 public static void main(String[] args) {
		
		SnakeGame ob= new SnakeGame();
		ob.frame();

}
}