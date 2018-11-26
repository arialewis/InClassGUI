import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton startButton;
	private JButton endButton;
	
	private TextPanel textPanel;
	
	public Toolbar()
	{
		startButton = new JButton("Start");
		endButton = new JButton("End");
		
		startButton.addActionListener(this);
		endButton.addActionListener(this);	
		
		add(startButton);
		add(endButton);
	}
	
	public void setTextPanel(TextPanel textPanel)
	{
		this.textPanel = textPanel; // This is a poor design - Dr. J
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton clicked = (JButton)e.getSource();
		
		if(clicked == startButton)
		{
			textPanel.appendText("Start your imagination");
		}
		else if (clicked == endButton)
		{
			textPanel.appendText("Keep dreaming on your own");
		}
		
	}
}
