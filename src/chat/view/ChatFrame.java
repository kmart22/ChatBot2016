package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;
import java.awt.Dimension;

public class ChatFrame extends JFrame
{
	private ChatController baseFrame;
	private ChatPanel appPanel;
	
	public  ChatFrame(ChatController baseController)
	{
		super();
		this.baseFrame = baseFrame;
		appPanel = new ChatPanel(baseFrame);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Wow a Wndow!!!!");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}
}