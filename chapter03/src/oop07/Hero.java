package oop07;

public class Hero implements Character{
    //人物名称
    private String name;

    //人物生命值
    private int health;

    //人物攻击力
    private int attack;

    //人物防御力
    private int defense;



    public Hero(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Hero() {
    }

    //攻击
    @Override
    public void attack(Monster m) {
        if(attack < m.getDefense()){
            System.out.println("人物进行攻击,您的攻击力低于怪物防御力,未造成伤害," + "怪物还剩余" + m.getHealth() + "血量");
        }else if(m.getHealth() > 0){
            ((MonsterImple)m).setHealth(m.getHealth() - (attack - m.getDefense()));
            System.out.println("人物进行攻击,共造成" + (attack - m.getDefense()) + "点伤害,怪物还剩余" + m.getHealth() + "血量");
            if(m.getHealth() <= 0){
                System.out.println("怪物死亡,爆出奖励" + m.getReward());
                return;
            }
        }

        //boss血量低于一半,开启狂暴,攻击力翻倍
        if(m.getHealth() < (((MonsterImple)m).getMaxHp() / 2) && m.getAttack() == ((MonsterImple)m).getNormalAttack()){
            ((MonsterImple)m).setAttack(2*m.getAttack());
            System.out.println("怪物血量低于一半,狂暴技能开启,攻击力翻倍");
        }


    }

    //防御
    @Override
    public void defense(Monster m) {

        if(defense > m.getAttack()){
            System.out.println("人物进行防御,您的防御力大于怪物攻击力,未受到伤害," + "人物还剩余" + health + "点血量");
        } else if(health > 0){
            health = health - (m.getAttack() - defense);
            System.out.println("人物进行防御,共受到" + (m.getAttack() - defense) + "点伤害,人物还剩余" + health + "点血量");
            if (health <= 0) {
                System.out.println("人物死亡");
                return;
            }
        }
    }
}
