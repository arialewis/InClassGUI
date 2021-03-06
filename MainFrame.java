import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextPanel textPanel;
	private Toolbar toolbar;
	
	public MainFrame() 
	{
		super("hello");
		
		setLayout(new BorderLayout());
		toolbar = new Toolbar();
		
		textPanel = new TextPanel();
		
		toolbar.setTextPanel(textPanel);
		
		add(toolbar,BorderLayout.NORTH);
		add(textPanel,BorderLayout.CENTER);
		
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}

}
