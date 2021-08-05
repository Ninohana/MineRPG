package com.minerpg.element.skill;

import com.minerpg.element.Skill;
import com.minerpg.element.SkillEffectType;
import com.minerpg.element.SkillType;

public class CandleGift extends Skill {
    public CandleGift() {
        this.name = "烛火之赐";
        this.description = "我，即是蜡烛。";

        this.type = SkillType.passive;
        this.effectType = SkillEffectType.buff;

        this.physicalDamage = 0;
        this.magicDamage = 0;

        this.attribute.physicalAttack = 10;
        this.attribute.magicAttack = 20;
        this.attribute.physicalDefence = 10;
        this.attribute.magicDefence = 10;
        this.attribute.healthPoint = 100;
    }
}
