package chat.model;

import java.util.ArrayList;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided.
 * Students will complete methods as part * of the project. * @author Cody
 * Henrichsen * @version 1.0 10/14/15
 */
public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private String userName;
	private String content;

	/**
	 * * Creates an instance of the Chatbot with the supplied username. * @param
	 * userName The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		politicalTopicList = new ArrayList<String>();
		memesList = new ArrayList<String>();
		buildMemesList();
		buildPoliticalTopicsList();
	}

	private void buildMemesList()
	{
		memesList.add("doge");
		memesList.add("Shrek");
		memesList.add("Harambe");
		memesList.add("dat boi");
		memesList.add("boi");
		memesList.add("pepe");
		memesList.add("forever alone");
		memesList.add("troll");
		memesList.add("krusty krab");
		memesList.add("pedo bear");
		memesList.add("Ken Bone");
		memesList.add("Spongebob");
		memesList.add("me gusta");
		memesList.add("dab");
		memesList.add("doge");
		memesList.add("Shrek");
		memesList.add("Harambe");
		memesList.add("dat boi");
		memesList.add("boi");
		memesList.add("pepe");
		memesList.add("forever alone");
		memesList.add("troll");
		memesList.add("krusty krab");
		memesList.add("pedo bear");
		memesList.add("Ken Bone");
		memesList.add("Spongebob");
		memesList.add("me gusta");
		memesList.add("dab");
	}

	private void buildPoliticalTopicsList()
	{
		politicalTopicList.add("Trump");
		politicalTopicList.add("Donald");
		politicalTopicList.add("Clinton");
		politicalTopicList.add("Hillary");
		politicalTopicList.add("Obama");
		politicalTopicList.add("president");
		politicalTopicList.add("Voting");
		politicalTopicList.add("November 8");
		politicalTopicList.add("Donald Trump");
		politicalTopicList.add("Hillary Clinton");
		politicalTopicList.add("Barack Obama");
		politicalTopicList.add("Kaine");
		politicalTopicList.add("vice president");
		politicalTopicList.add("election");
		politicalTopicList.add("republican");
		politicalTopicList.add("democrat");
		politicalTopicList.add("debate");
		politicalTopicList.add("Trump");
		politicalTopicList.add("Donald");
		politicalTopicList.add("Clinton");
		politicalTopicList.add("Hillary");
		politicalTopicList.add("Obama");
		politicalTopicList.add("president");
		politicalTopicList.add("Voting");
		politicalTopicList.add("November 8");
		politicalTopicList.add("Donald Trump");
		politicalTopicList.add("Hillary Clinton");
		politicalTopicList.add("Barack Obama");
		politicalTopicList.add("Kaine");
		politicalTopicList.add("vice president");
		politicalTopicList.add("election");
		politicalTopicList.add("republican");
		politicalTopicList.add("democrat");
		politicalTopicList.add("debate");
		
	}

	/**
	 * * Checks the length of the supplied string. Returns false if the supplied
	 * String is empty or null, otherwise returns true. * @param currentInput * @return
	 * A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if (currentInput != null && !currentInput.equals(""))
		{
			hasLength = true;
		}

		return hasLength;
	}

	/**
	 * * Checks if the supplied String matches the content area for this Chatbot
	 * instance.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked. * @return Whether it
	 *            matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		String tempInput = currentInput.toLowerCase();
		if (tempInput.contains(content.toLowerCase()))
		{
			hasContent = true;
		}
		return hasContent;
	}

	/**
	 * * Checks if supplied String matches ANY of the topics in the
	 * politicalTopicsList. Returns true if it does find a match and false if it
	 * does not match.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked. * @return Whether the
	 *            String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		return false;
	}

	/**
	 * * Checks to see that the supplied String value is in the current
	 * memesList variable.
	 * 
	 * @param currentInput
	 *            The supplied String to be checked. * @return Whether the
	 *            supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		return false;
	}

	/**
	 * * Returns the username of this Chatbot instance. * @return The username
	 * of the Chatbot.
	 */
	public String getUserName()
	{
		return null;
	}

	/**
	 * * Returns the content area for this Chatbot instance. * @return The
	 * content area for this Chatbot instance.
	 */
	public String getContent()
	{
		return null;
	}

	/**
	 * * Getter method for the memesList object. * @return The reference to the
	 * meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return memesList;
	}

	/**
	 * * Getter method for the politicalTopicList object. * @return The
	 * reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return null;
	}

	/**
	 * * Updates the content area for this Chatbot instance. * @param content
	 * The updated value for the content area.
	 */
	public void setContent(String content)
	{
	}

}
