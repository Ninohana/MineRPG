package com.minerpg.element.skill;

import com.minerpg.element.Skill;
import com.minerpg.element.SkillEffectType;
import com.minerpg.element.SkillType;

public class MoonFall extends Skill {
    public MoonFall(){
        this.name = "落月之陨";
        this.description = "天空中的皓皓明月，不过是垂垂老矣的星辰。";

        this.type = SkillType.active;
        this.effectType = SkillEffectType.injury;

        this.physicalDamage = 0;
        this.magicDamage = 9999999;

        this.attribute.physicalAttack = 0;
        this.attribute.magicAttack = 0;
        this.attribute.physicalDefence = 0;
        this.attribute.magicDefence = 0;
        this.attribute.healthPoint = 0;
    }
}
