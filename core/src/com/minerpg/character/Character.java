package com.minerpg.character;

import com.minerpg.element.Equipment;
import com.minerpg.element.EquipmentType;
import com.minerpg.element.Skill;
import com.minerpg.element.SkillType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Character {
    public String designation, name;//称号，名字
    public Attribute attribute = new Attribute();//人物属性
    public Classes classes;//职业
    public Map<EquipmentType, Equipment> equipmentMap = new HashMap<>();//装备列表
    public List<Skill> skillList = new ArrayList<>();

    public boolean equip(Equipment equipment) {
        if (equipmentMap.containsKey(equipment.type))
            return false;

        equipmentMap.put(equipment.type, equipment);

        this.attribute.physicalAttack += equipment.attribute.physicalAttack;
        this.attribute.magicAttack += equipment.attribute.magicAttack;
        this.attribute.physicalDefence += equipment.attribute.physicalDefence;
        this.attribute.magicDefence += equipment.attribute.magicDefence;
        this.attribute.healthPoint += equipment.attribute.healthPoint;

        this.skillList.addAll(equipment.skillList);

        return true;
    }

    public boolean relieve(Equipment equipment) {
        Equipment equipping = equipmentMap.get(equipment.type);
        if (equipping.getClass() != equipment.getClass())
            return false;

        equipmentMap.remove(equipment.type);

        this.attribute.physicalAttack -= equipment.attribute.physicalAttack;
        this.attribute.magicAttack -= equipment.attribute.magicAttack;
        this.attribute.physicalDefence -= equipment.attribute.physicalDefence;
        this.attribute.magicDefence -= equipment.attribute.magicDefence;
        this.attribute.healthPoint = Math.max(this.attribute.healthPoint - equipment.attribute.healthPoint, 1);

        return true;
    }

    //战斗
    public int hit(Character enemy) {
        //物理攻击
        int physicalDamage = this.attackByPhysical(enemy);
        //魔法攻击
        int magicDamage = this.attackByMagic(enemy);
        //总造成伤害
        int damage = physicalDamage + magicDamage;
        //扣血
        damage = enemy.changeHealthPoint(-damage);

        return damage;
    }

    //释放技能
    public boolean skillTo(Character character, Skill skill) {
        if (this.skillList.isEmpty())
            return false;

        if (skill.type == SkillType.passive)
            return false;

        for (Skill s : this.skillList) {
            if (s.getClass() == skill.getClass()) {
                this.attackBySkill(character, skill);
                return true;
            }
        }

        return false;
    }

    protected void attackBySkill(Character character, Skill skill) {
        character.defendSkillAttack(this, skill);
    }

    protected void defendSkillAttack(Character character, Skill skill) {
        switch (skill.effectType) {
            case buff:
                character.attribute.physicalAttack += skill.attribute.physicalAttack;
                character.attribute.magicAttack += skill.attribute.magicAttack;
                character.attribute.physicalDefence += skill.attribute.physicalDefence;
                character.attribute.magicDefence += skill.attribute.magicDefence;
                character.attribute.healthPoint += skill.attribute.healthPoint;
                break;
            case injury:
                int physicalDamage = skill.physicalDamage - this.attribute.physicalDefence;
                int magicDamage = skill.magicDamage - this.attribute.magicDefence;
                int damage = physicalDamage + magicDamage;
                damage = Math.max(damage, 0);
                this.changeHealthPoint(-damage);
                break;
            case heal:
                this.changeHealthPoint(+skill.attribute.healthPoint);
                break;
            case control:
                break;
        }
    }

    //物理攻击
    protected int attackByPhysical(Character enemy) {
        return enemy.defendPhysicalAttack(this);
    }

    //魔法攻击
    protected int attackByMagic(Character enemy) {
        return enemy.defendMagicAttack(this);
    }

    //防御物理攻击
    protected int defendPhysicalAttack(Character enemy) {
        int damage = enemy.attribute.physicalAttack - this.attribute.physicalDefence;
        damage = Math.max(damage, 0);
        return damage;
    }

    //防御魔法攻击
    protected int defendMagicAttack(Character enemy) {
        int damage = enemy.attribute.magicAttack - this.attribute.magicDefence;
        damage = Math.max(damage, 0);
        return damage;
    }

    //扣血
    public int changeHealthPoint(int value) {
        this.attribute.healthPoint += value;
        return value;
    }

    //数值检测
    protected int checkValue(int gameValue) {
        return Math.max(gameValue, 0);
    }
}
