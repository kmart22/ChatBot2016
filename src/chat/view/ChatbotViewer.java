package chat.view;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class ChatbotViewer
{
	private String windowMessage;
	private ImageIcon chatIcon;
	
	public ChatbotViewer()
	{
		windowMessage = "this message brought to you by the chatbot! ;D";
		chatIcon = new ImageIcon(getClass().getResource("images/"));
	}

	public String collectResponse(String question)
	{
		String response = JOptionPane.showInputDialog(null, question);
		
		return response;
	}
	
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null,  message);
		
	}
	
	public int collectUserOption(String question)
	{
		int response = 0;
		
		response= JOptionPane.showConfirmDialog(null,  question);
		
		return response;
	}
}
