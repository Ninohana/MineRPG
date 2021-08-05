package com.minerpg.character.Hero;

import com.minerpg.character.Character;
import com.minerpg.element.Skill;
import com.minerpg.element.skill.CandleGift;
import com.minerpg.element.skill.MoonFall;

public class WhiteRobeGandalf extends Gandalf {

    public WhiteRobeGandalf() {
        super();
        this.designation = "the White Robe Witcher";
        this.name = "Gandalf";

        this.attribute.physicalAttack = 10;
        this.attribute.magicAttack = 20;

        //主动技能
        Skill moonFall = new MoonFall();
        this.skillList.add(moonFall);
        //被动技能
        Skill candleGift = new CandleGift();
        this.skillList.add(candleGift);

        this.attribute.physicalAttack += candleGift.attribute.physicalAttack;
        this.attribute.magicAttack += candleGift.attribute.magicAttack;
        this.attribute.physicalDefence += candleGift.attribute.physicalDefence;
        this.attribute.magicDefence += candleGift.attribute.magicDefence;
        this.attribute.healthPoint += candleGift.attribute.healthPoint;
    }

    @Override
    public int hit(Character enemy) {
        //物理攻击
        int physicalDamage = this.attackByPhysical(enemy);
        //魔法攻击
        int magicDamage = this.attackByMagic(enemy);
        //总造成伤害
        int damage = physicalDamage + magicDamage;

        //最终增伤
        damage += 2;

        //扣血
        damage = enemy.changeHealthPoint(-damage);

        return damage;
    }

    @Override
    public int changeHealthPoint(int value) {
        if (value < 0) {
            //最终减伤
            value += 20;
            value = Math.min(value, 0);
        }
        return super.changeHealthPoint(value);
    }
}
