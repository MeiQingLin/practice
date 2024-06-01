package oop07;

public interface Character {
    //获取生命值
    int getHealth();

    //获取名字
    String getName();

    //获取攻击力
    int getAttack();

    //获取防御力
    int getDefense();

    //人物攻击
    default void attack(Monster m){}

    //人物防御
    default void defense(Monster m){}

    //怪物攻击
    default void attack(Character c){}

    //怪物防御
    default void defense(Character c){}
}
