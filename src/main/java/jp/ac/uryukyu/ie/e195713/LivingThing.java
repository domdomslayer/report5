package jp.ac.uryukyu.ie.e195713;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean bool){
        dead = bool;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack(){
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHitpoint(){
        return hitPoint;
    }

    public void setHitpoint(int hitpoint) {
        this.hitPoint = hitpoint;
    }

    public void attack(LivingThing opponent){
        if(isDead()){
            attack = 0;
        }
        int damage = (int)(Math.random() * attack);
        switch (attack){
            case 0:
                break;
            default:
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        }
        opponent.wounded(damage);
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}
