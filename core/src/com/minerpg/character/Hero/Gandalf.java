package com.minerpg.character.Hero;

import com.minerpg.character.Character;
import com.minerpg.character.Classes;

public class Gandalf extends Character {

    public Gandalf() {
        //近战法师 - 甘道夫
        this.designation = "Melee Mage";
        this.name = "Gandalf";
        this.classes = Classes.mage;

        this.attribute.physicalAttack = 7;
        this.attribute.magicAttack = 12;
        this.attribute.physicalDefence = 3;
        this.attribute.magicDefence = 4;
        this.attribute.healthPoint = 100;
    }

}
