package com.minerpg.element.equipment;

import com.minerpg.element.Equipment;
import com.minerpg.element.EquipmentType;

public class LinenCaften extends Equipment {
    LinenCaften() {
        this.name = "亚麻长袍";
        this.description = "亚麻布做的简陋袍子，或许只能挡挡风。";

        this.type = EquipmentType.gown;

        this.attribute.physicalAttack = 0;
        this.attribute.magicAttack = 0;
        this.attribute.physicalDefence = 1;
        this.attribute.magicDefence = 3;
        this.attribute.healthPoint = 10;
    }
}
