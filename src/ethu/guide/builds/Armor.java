package ethu.guide.builds;

import ethu.guide.interfaces.LootStatCalculation;
import ethu.guide.pojo.Characters;
import ethu.guide.pojo.Loot;

/**
 * @author truonga Armor, extend from Loot. The most important pieces of Loots
 *         in video games 24 Oct. 2018
 */
public class Armor extends Loot implements LootStatCalculation {
	private int defense;
	Characters player = new Characters();
	
	@Override
	public void calcAtk() {
		
		
	}

	@Override
	public void calcDef() {
		// TODO Auto-generated method stub
		player.setDefense(this.defense);
	}

	@Override
	public void resist() {
		// TODO Auto-generated method stub
		
	}
	
}
