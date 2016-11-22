package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatbotViewer;
import chat.view.ChatFrame;

public class ChatController
{
	private Chatbot stupidBot;
	private ChatbotViewer display;
	private ChatFrame chatFrame;
	
	public ChatController()
	{
		stupidBot = new Chatbot("lady-stealer");
		display = new ChatbotViewer();
		chatFrame = new ChatFrame(this);
		
	}
	
	public void start()
	{
		String response = display.collectResponse("What do you want to talk about?");
		
		while(stupidBot.lengthChecker(response))
		{
			display.displayMessage(useChatbotCheckers(response));
			response = display.collectResponse("oh, you want to talk about " + response + "? tell me more...");
		}
	}
	
	public String useChatbotCheckers(String input)
	{
		String checkedInput = "";
		
		if(stupidBot.memeChecker(input))
		{
			checkedInput += "\nYou like memes!\n";
		}
		if(stupidBot.contentChecker(input))
		{
			checkedInput += "\nYou know my secret topic!n";
		}
		if(checkedInput.length() == 0)
		{
			checkedInput = "I have no idea what you mean about " + input;
		}
		
		return checkedInput;
	}
	
	public ChatFrame getBaseFrame()
	{
		return chatFrame;
	}
	
	public Chatbot getChatbot()
	{
		return stupidBot;
	}
	
	public String communicateWithChatbot(String userText)
	{
		String botText = "";
		
		return botText;
	}
	
	private String randomTopicGenerator()
	{
		String randomTopic = "";
		int random = (int) (Math.random() * 7);
		
		switch(random)
		{
		case 0:
			randomTopic = "Do you like the Dallas Cowboys?";
			break;
		case 1:
			randomTopic = "video games are really fun!!";
			break;
		case 2:
			randomTopic = "How about that wall?";
			break;
		case 3:
			randomTopic = "time to eat";
			break;
		case 4:
			randomTopic = "who is you're favorite person in the whole world?";
			break;
		case 5:
			randomTopic = "time to learn programming!";
			break;
		case 6:
			randomTopic = "do you like the snow?";
			break;
		default: 
			randomTopic = "This can't be happening!";
		}
		
		
		return randomTopic;
		
		
	}
	
	
	
}
