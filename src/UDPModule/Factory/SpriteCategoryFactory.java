package UDPModule.Factory;

import Entity.VirtualCharacter;
import Enum.SpriteType;
import Stub.DOM;
import UDPModule.Entity.SCItem;
import UDPModule.Entity.SCVirtualCharacter;
import UDPModule.Entity.SpriteCategory;

public class SpriteCategoryFactory {
	
	public static SpriteCategory getSpriteCategory(String msg)
	{
		SpriteCategory spriteCategory = null;
		switch (SpriteType.valueOf(msg)) {
		case ITEM:
			spriteCategory = new SCItem();
			break;
		case VIRTUALCHARACTER:
			spriteCategory = new SCVirtualCharacter();
			break;
		default:
			break;
		}
		return spriteCategory;
	}
}
