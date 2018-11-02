package com.ethu.guide.pojo;

/**
 * @author truonga
 * 
 *         This is created as a base POJO class for subsequence loot in a games.
 *         This could be either armor/ weapons/ amulet/ charm etc.
 * 
 *         Quote of the days: How did the pyramid was built? One stone at a
 *         time... 23 Oct. 2018
 */
public class Loot {
	private int reqLevel;
	private int reqStr;
	private String description;
	private String rarity;

	public int getReqLevel() {
		return reqLevel;
	}

	public void setReqLevel(int reqLevel) {
		this.reqLevel = reqLevel;
	}

	public int getReqStr() {
		return reqStr;
	}

	public void setReqStr(int reqStr) {
		this.reqStr = reqStr;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRarity() {
		return rarity;
	}

	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

}
