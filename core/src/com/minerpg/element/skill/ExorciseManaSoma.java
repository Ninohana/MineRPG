package com.minerpg.element.skill;

import com.minerpg.element.Skill;
import com.minerpg.element.SkillEffectType;
import com.minerpg.element.SkillType;

public class ExorciseManaSoma extends Skill {
    public ExorciseManaSoma() {
        this.name = "辟法之躯";
        this.description = "天生的战士，万法不侵！";

        this.type = SkillType.active;
        this.effectType = SkillEffectType.buff;

        this.physicalDamage = 0;
        this.magicDamage = 0;

        this.attribute.physicalAttack = 0;
        this.attribute.magicAttack = 0;
        this.attribute.physicalDefence = 0;
        this.attribute.magicDefence = 20;
        this.attribute.healthPoint = 0;
    }
}
