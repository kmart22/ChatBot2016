package chat.view;

import javax.swing.JOptionPane;

public class ChatbotViewer
{

	public String collectResponse(String question)
	{
		String response = JOptionPane.showInputDialog(null, question0);
		
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
