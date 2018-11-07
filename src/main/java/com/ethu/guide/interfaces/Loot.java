package com.ethu.guide.interfaces;

/**
 * @author truonga
 * 
 *         Originally this is created as a base POJO class for subsequence loot
 *         in a games. But I have learned Interfaces! This should be an
 *         Interface instead!
 * 
 *         This could be either armor/ weapons/ amulet/ charm etc.
 * 
 *         Quote of the days: How did the pyramid was built? One stone at a
 *         time... 23 Oct. 2018
 *         Modified on 7 Nov. 2018
 */

public interface Loot {

	int getReqLevel();

	void setReqLevel(int reqLevel);

	int getReqStr();

	void setReqStr(int reqStr);

	String getDescription();

	void setDescription(String description);

	String getRarity();

	void setRarity(String rarity);

}