package oop07;

public class MonsterImple implements Monster{
    //怪物名字
    private String name;

    //怪物生命值
    private int health;

    //怪物攻击力
    private int attack;

    //怪物防御力
    private int defense;

    //打败怪物的奖励
    private String reward;

    //记录boss满血的状态
    private int maxHp;

    //记录boss正常状态的攻击力
    private int normalAttack;

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getNormalAttack() {
        return normalAttack;
    }

    public void setNormalAttack(int normalAttack) {
        this.normalAttack = normalAttack;
    }

    public MonsterImple(String name, int health, int attack, int defense, String reward) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.reward = reward;
        this.normalAttack = this.attack;
        this.maxHp = this.health;
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

    public MonsterImple() {
    }

    //攻击
    @Override
    public void attack(Character c) {

        if(attack < c.getDefense()){
            System.out.println("怪物进行攻击,怪物攻击力低于您的防御力,未造成伤害," + "人物还剩余" + c.getHealth() + "点血量");
        }else if(c.getHealth() > 0){
            ((Hero)c).setHealth(c.getHealth() - (attack - c.getDefense()));
            System.out.println("怪物进行攻击,共造成" + (attack - c.getDefense()) + "点伤害,人物还剩余" + c.getHealth() + "点血量");
            if(c.getHealth() <= 0){
                System.out.println("人物死亡");
                return;
            }
        }
    }

    //防御
    @Override
    public void defense(Character c) {
        if(defense > c.getDefense()){
            System.out.println("怪物进行防御,怪物防御力大于您的攻击力,未受到伤害," + "怪物还剩余" + health + "点血量");
        }else if(health > 0){
            health = health - (c.getAttack() - defense);
            System.out.println("怪物进行防御,共受到" + (c.getAttack() - defense) + "点伤害,怪物还剩余" + health + "点血量");
            if(health <= 0){
                System.out.println("怪物死亡,爆出奖励" + reward);
                return;
            }
        }
        //boss血量低于一半,开启狂暴,攻击力翻倍
        if (health < (maxHp / 2) && c.getAttack() == normalAttack) {
            setAttack(2 * attack);
            System.out.println("怪物血量低于一半,狂暴技能开启,攻击力翻倍");
        }

    }

    @Override
    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }
}
