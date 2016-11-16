package chat.view;

import java.awt.Color;

import javax.swing.*;

import chat.controller.ChatController;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class ChatPanel extends JPanel
{
	private ChatController baseController;
	private SpringLayout baseLayout;
	private JTextArea chatDisplay;
	private JTextField chatField;
	private JButton chatButton;

	public ChatPanel(ChatController baseController)
	{
		super();
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		chatDisplay = new JTextArea(5, 25);
		chatField = new JTextField(25);
		chatButton = new JButton("chat with the bot");
		
		setupChatDisplay();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupChatDisplay()
	{
		chatDisplay.setEditable(false);
		chatDisplay.setEnabled(false);
		chatDisplay.setWrapStyleWord(true);
		chatDisplay.setLineWrap(true);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GREEN);
		this.add(chatButton);
		this.add(chatDisplay);
		this.add(chatField);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, chatDisplay, 0, SpringLayout.WEST, chatField);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatDisplay, -6, SpringLayout.NORTH, chatField);
		baseLayout.putConstraint(SpringLayout.WEST, chatField, 61, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatButton, 206, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatField, -22, SpringLayout.NORTH, chatButton);
		baseLayout.putConstraint(SpringLayout.WEST, chatButton, 144, SpringLayout.WEST, this);
	}

	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String personWords = chatField.getText();
				String chatbotResponse = baseController.useChatbotCheckers(personWords);
				
				chatDisplay.setText("you said: " + personWords + "\n" + "Chatbot says: " + chatbotResponse);
				chatField.setText("");
			}
		});
		
	}
}
