package oop07;
/*
假设你正在编写一个游戏，其中有一些怪物和英雄，并且它们都可以进行战斗。
具体来说，每个角色都有自己的名字、生命值、攻击力和防御力，并且可以进行攻击和防御等操作。
请按照以下步骤设计一个程序:
1.创建一个Character接口，它具有getName()、getHealth()、getAttack()、getDefense()、attack()、和defense()六个方法，
分别用于获取角色的名字、生命值、攻击力、防御力，以及进行攻击和防御操作。

2.创建一个Monster接口，它继承自character接口，具有一个getReward()方法，返回这个怪物打败后可以获得的奖励。

3.创建一个英雄类Hero，它实现了character接口，具有名字、生命值、攻击力和防御力属性。
它的attack()和defense()方法用于进行攻击和防御操作，根据对手的攻击力和自己的防御力计算生命值，并输出攻击和防御的结果。

4.创建一个怪物类MonsterImpl，它实现了Monster接口，具有名字、生命值、攻击力、防御力和奖励属性。
它的attack和defense方法同样根据对手的攻击力和自己的防御力计算生命值，并输出攻击和防御的结果。
同时，如果自己的生命值降到一定程度以下，就会发动愤怒效果，攻击力翻倍。

5.创建一些具体的英雄和怪物对象，例如一位攻击力为 3，防御力为 2，生命值为 30，叫做“剑士”的英雄，
以及一个攻击力为 4，防御力为 1，生命值为 20，奖励为 100 金币，叫做“骷髅王”的怪物。

6.最后，编写一个'Main'类，创建一些角色对象，模拟一些战斗场景，并演示攻击和防御的效果。
*/
public class Test {
    public static void main(String[] args) {
        Character hero1 = new Hero("战士", 10, 3, 2);
        Character hero2 = new Hero("刺客", 8, 5, 2);
        Monster monster1 = new MonsterImple("蝙蝠", 8, 2, 1, "100金币");
        Monster monster2 = new MonsterImple("蜥蜴",10, 4, 2, "100金币");
        hero1.attack(monster1);
        monster1.defense(hero1);
        monster1.attack(hero1);
        hero1.attack(monster1);
        hero1.defense(monster1);
        monster1.attack(hero1);
        monster1.attack(hero1);
        hero1.attack(monster1);
        monster1.defense(hero1);
        monster1.defense(hero1);

    }
}
