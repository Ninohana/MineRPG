package com.minerpg.character.Hero;

import com.minerpg.character.Character;
import com.minerpg.character.Classes;
import com.minerpg.element.skill.ExorciseManaSoma;

public class Grim extends Character {

    public Grim() {
        //破法之盾 - 格里姆
        this.designation = "the Shield of Break Magic";
        this.name = "Grim";
        this.classes = Classes.warrior;

        this.attribute.physicalAttack = 10;
        this.attribute.magicAttack = 0;
        this.attribute.physicalDefence = 7;
        this.attribute.magicDefence = 10;
        this.attribute.healthPoint = 120;

        this.skillList.add(new ExorciseManaSoma());
    }

}
