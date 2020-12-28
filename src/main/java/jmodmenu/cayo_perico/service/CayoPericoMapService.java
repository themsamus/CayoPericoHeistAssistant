package jmodmenu.cayo_perico.service;

import java.util.List;
import java.util.Map;

import jmodmenu.cayo_perico.model.LootType;
import jmodmenu.cayo_perico.model.MainLoot;
import jmodmenu.cayo_perico.model.MapItem;
import jmodmenu.cayo_perico.model.SecondaryCompundLoot;
import jmodmenu.cayo_perico.model.SecondaryIslandLoot;
import jmodmenu.core.PlayerInfo;

public interface CayoPericoMapService {
	List<PlayerInfo> getPlayersInfo();
	void setWeapon(int weaponIndex);
	int getLocalPlayerIndex();
	void addApproach(int approachMask, int setMask);
	void setBagSize(int newBagSize);
	void setLootValue(MainLoot loot, int newLootValue);
	int getMyBagSize();
	int getCurrentLootValue(int index, MainLoot loot);
	void setCuts(Integer[] values);
	Map<String, Integer> getCuts();
	int getWeapon(int index);
	int getApproach(int index);
	int getScopedEquipment(int playerIndex);
	void addScopedEquipment(int equipmentMask);
	List<MapItem> getEquipment(int playerIndex);
	List<SecondaryIslandLoot> getIslandLoot(int playerIndex);
	List<SecondaryCompundLoot> getCompoundLoot(int playerIndex);
	MainLoot getMainLoot(int playerIndex);
	void restartSubmarineComputer();
	boolean hasScopedLoot(int playerIndex, LootType type);
	void scopeLoot(int playerIndex, LootType type);
	boolean isHardMode(int playerIndex);
}