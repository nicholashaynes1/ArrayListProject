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
		displayList();
	}

	private void displayList()
	{
		for(int spot = 0; spot < firstWords.size(); spot++)
		{
			popupDisplay.showList("The contents at " +spot+ " are " + firstWords.get(spot));
		}
	}


}
