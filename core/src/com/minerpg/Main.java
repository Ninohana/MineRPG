package com.minerpg;

import com.minerpg.character.Character;
import com.minerpg.character.Hero.Gandalf;
import com.minerpg.character.Hero.Grim;
import com.minerpg.character.Hero.WhiteRobeGandalf;
import com.minerpg.element.Equipment;
import com.minerpg.element.Skill;
import com.minerpg.element.equipment.Sword;
import com.minerpg.element.equipment.YewStaff;
import com.minerpg.element.skill.ExorciseManaSoma;
import com.minerpg.element.skill.FireBall;
import com.minerpg.element.skill.MoonFall;

public class Main {
    public static void main(String[] args) {
        Gandalf gandalf = new Gandalf();
        final Grim grim = new Grim();

        new Thread(() -> {
            while (true) {
                //if (gandalf.attribute.healthPoint <= 0) {
                // System.out.println("Gandalf阵亡，游戏结束");
                // System.exit(0);
                //} else
                if (grim.attribute.healthPoint <= 0) {
                    System.out.println("【系统】Grim阵亡，游戏结束");
                    System.exit(0);
                }
                //System.out.println("?");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        System.out.println("Grim：孱弱的法师，吃我一剑！");
        System.out.println("Gandalf：愿大自然保佑你。");
        int damage = grim.hit(gandalf);
        System.out.println("【系统】Grim对Gandalf造成" + damage + "点伤害。");
        damage = gandalf.hit(grim);
        System.out.println("【系统】Gandalf对Grim造成" + damage + "点伤害。");
        System.out.println("Grim：哈哈哈哈，不痛不痒！");
        System.out.println("Gandalf：可别高兴得太早！");
        showAttribute(gandalf);
        Equipment weapon = new YewStaff();
        gandalf.equip(weapon);
        System.out.println("【系统】Gandalf拿出了 " + weapon.name + "(" + weapon.description + ") ");
        showAttribute(gandalf);
        damage = gandalf.hit(grim);
        System.out.println("【系统】Gandalf对Grim造成" + damage + "点伤害。");
        System.out.println("Grim：哼，还是不痛不痒啊！");
        showAttribute(grim);
        weapon = new Sword();
        grim.equip(weapon);
        System.out.println("【系统】Grim从腰间抽出剑，指着Gandalf。");
        showAttribute(grim);
        System.out.println("Grim：别以为这就完了！");
        Skill skill = new ExorciseManaSoma();//待优化
        grim.skillTo(grim, skill);//待优化
        System.out.println("一道光芒洗礼而过，Grim得到了强化。");
        System.out.println("【系统】Grim使用了 " + skill.name + "(" + skill.description + ")");
        showAttribute(grim);
        System.out.println("Grim：看招！");
        damage = grim.hit(gandalf);
        System.out.println("【系统】Grim对Gandalf造成" + damage + "点伤害。");
        System.out.println("Gandalf硬吃一剑，倒退了一大步，冷冷地看着Grim。");
        showAttribute(gandalf);
        skill = new FireBall();
        gandalf.skillList.add(skill);
        System.out.println("Gandalf大喝一声，一挥手，顿时飞出三个火球。");
        for (int i = 0; i < 3; i++) {
            gandalf.skillTo(grim, skill);
        }
        System.out.println("【系统】Gandalf连续使用了3次 " + skill.name + "(" + skill.description + ")");
        System.out.println("Grim闪避不及，被打个正着,熊熊火焰瞬间包裹住了他。");
        showAttribute(grim);
        System.out.println("火焰燃尽，Grim包裹在一层油膜中，除了毛发有点焦黑，并无大碍。");
        System.out.println("Grim咧嘴笑：挠痒就是挠痒！");
        System.out.println("说罢便欺身上前，手中利剑银光闪闪。");
        grim.hit(gandalf);
        grim.hit(gandalf);
        showAttribute(gandalf);
        System.out.println("Gandalf大喘粗气，在Grim汹涌的攻势下节节败退。");
        System.out.println("Grim不依不挠，乘胜追击。");
        grim.hit(gandalf);
        System.out.println("一声清响，Gandalf的法杖被打飞。");
        weapon = new YewStaff();
        gandalf.relieve(weapon);
        showAttribute(gandalf);
        System.out.println("Gandalf跌坐在地，嘴角溢出鲜血，灰头土脸的，哪还有半点法师的样子。");
        System.out.println("Grim一脸得意：什么狗屁" + gandalf.designation + "？三两下我就能把你干翻在地！");
        System.out.println("Grim扬起手中的剑，作势欲砍。");
        System.out.println("Gandalf身上突然迸发出一股强横的气息，把Grim震退了好几步。");
        gandalf = new WhiteRobeGandalf();
        showAttribute(gandalf);
        System.out.println("!!! " + gandalf.designation + " - " + gandalf.name + " !!!");
        System.out.println("Gandalf站起身来，白色长发无风自动，衣袍猎猎作响，伟岸的身躯挺立，俯视着矮人Grim。");
        System.out.println("Grim：装腔作势，哼，再吃我一剑！");
        damage = grim.hit(gandalf);
        System.out.println("【系统】Grim对Gandalf造成" + damage + "点伤害。");
        System.out.println("Grim：什么！？不……不可能！");
        System.out.println("Grim不相信眼前发生的事，又发疯似地连续攻击Gandalf。");
        for (int i = 0; i < 100; i++) {
            grim.hit(gandalf);
        }
        showAttribute(gandalf);
        System.out.println("Gandalf站在原地，似笑非笑地看着Grim。");
        System.out.println("Grim：不可能！不可能啊！！");
        System.out.println("Gandalf手一挥，不远处的法杖飞回到了他的手中。");
        gandalf.equip(new YewStaff());
        showAttribute(gandalf);
        System.out.println("Gandalf眼神一凝，法杖闪烁间，一束光芒脉冲崩向Grim。");
        damage = gandalf.hit(grim);
        System.out.println("【系统】Gandalf对Grim造成" + damage + "点伤害。");
        showAttribute(grim);
        System.out.println("Gandalf：结束吧……");

        skill = new MoonFall();
        gandalf.skillTo(grim, skill);
        System.out.println("【系统】Gandalf使用了技能 " + skill.name + "(" + skill.description + ")");
        showAttribute(grim);
    }

    static void showAttribute(Character character) {
        System.out.print("<" + character.name + ">");
        System.out.print("(" + character.attribute.physicalAttack);
        System.out.print(" |" + character.attribute.magicAttack);
        System.out.print(" |" + character.attribute.physicalDefence);
        System.out.print(" |" + character.attribute.magicDefence);
        System.out.print(" |" + character.attribute.healthPoint);
        System.out.println(")");
    }
}
