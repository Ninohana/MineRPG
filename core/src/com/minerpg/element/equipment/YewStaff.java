package com.minerpg.element.equipment;

import com.minerpg.element.Equipment;
import com.minerpg.element.EquipmentType;
import com.minerpg.element.skill.FireBall;

public class YewStaff extends Equipment {
    public YewStaff() {
        this.name = "紫衫法杖";
        this.description = "用紫衫做的法杖，灰扑扑的，看上去只能当一根拐杖。";

        this.type= EquipmentType.weapon;

        this.attribute.physicalAttack = 0;
        this.attribute.magicAttack = 10;
        this.attribute.physicalDefence = 0;
        this.attribute.magicDefence = 5;
        this.attribute.healthPoint = 0;

        //this.skillList.add(new FireBall());
    }
}
