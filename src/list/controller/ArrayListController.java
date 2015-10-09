package list.controller;

import list.view.ListViewer;

import java.util.ArrayList;

public class ArrayListController
{
	private ArrayList<String>firstWords;
	
	/**
	 * creates an instance of a popup
	 */
	private ListViewer popupDisplay;
	
	public ArrayListController()
	{
		firstWords = new ArrayList<String>();
		popupDisplay = new ListViewer();
	}
	
	
	
	public void start()
	{
		firstWords.add("CEHRHEIUFHEIUFHIHhefuihfwiuhiuawehrlhailuehiuhfwiahf");
		firstWords.add("bababaabbabababbababbababbababababababbaba");
		firstWords.add("MOMOMOMOMOMOMOMOMOM");
		firstWords.add(1, "death to fake metal");
		
		displayList();
		firstWords.set(2, "life is just pain before death");
		firstWords.remove(0);
		displayList();
		showOtherLoop();
		
		
		
	}

	private void displayList()
	{
		popupDisplay.showList("The size list is " + firstWords.size());
		for(int spot = 0; spot < firstWords.size(); spot++)
		{
			popupDisplay.showList("The contents at " +spot+ " are " + firstWords.get(spot));
		}
	}
	private void showOtherLoop()
	{
		for(String words : firstWords)
		{
			popupDisplay.showList(words);
		}
	}

}
