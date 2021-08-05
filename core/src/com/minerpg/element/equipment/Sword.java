package com.minerpg.element.equipment;

import com.minerpg.element.Equipment;
import com.minerpg.element.EquipmentType;

public class Sword extends Equipment {
    public Sword() {
        this.name = "剑";
        this.description = "大部分游戏里面都会有的，一把普通的，剑。";

        this.type= EquipmentType.weapon;

        this.attribute.physicalAttack = 15;
        this.attribute.magicAttack = 0;
        this.attribute.physicalDefence = 0;
        this.attribute.magicDefence = 0;
        this.attribute.healthPoint = 0;
    }
}
