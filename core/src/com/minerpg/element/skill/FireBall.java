package com.minerpg.element.skill;

import com.minerpg.element.Skill;
import com.minerpg.element.SkillEffectType;
import com.minerpg.element.SkillType;

public class FireBall extends Skill {
    public FireBall() {
        this.name = "火球术";
        this.description = "4费打6，太超模啦！";

        this.type = SkillType.active;
        this.effectType = SkillEffectType.injury;

        this.physicalDamage = 0;
        this.magicDamage = 6;

        this.attribute.physicalAttack = 0;
        this.attribute.magicAttack = 0;
        this.attribute.physicalDefence = 0;
        this.attribute.magicDefence = 0;
        this.attribute.healthPoint = 0;
    }
}
