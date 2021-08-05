package com.minerpg.element;

import com.minerpg.element.SkillType;

public class Skill {
    public String name;
    public String description;

    public SkillType type;
    public SkillEffectType effectType;

    public int physicalDamage;
    public int magicDamage;

    public Attribute attribute = new Attribute();
}
