package jp.ac.uryukyu.ie.e195713;
/**
 * 生き物クラス。
 * ヒーロークラスと敵クラスのスーパークラス。
 * Created by Iju Hoshi on 2019/12/3.
 */
public class LivingThing {
    /**
     *　生き物の名前
     */
    private String name;
    /**
     *　生き物のHP（体力）
     */
    private int hitPoint;
    /**
     *　生き物の攻撃力
     */
    private int attack;
    /**
     *　生き物が死んでいるかどうかを判別する
     * true:死んでいる, false:生きている
     */
    private boolean dead;

    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     *　死んでいるかどうかのgetterメソッド。
     * @return この生き物が死んでいるかどうか
     */
    public boolean isDead() {
        return dead;
    }

    /**
     *　死んでいるかどうかのsetterメソッド。
     * @param bool この生き物が死んでいるかどうか
     */
    public void setDead(boolean bool){
        dead = bool;
    }

    /**
     *　名前のgetterメソッド。
     * @return この生き物の名前
     */
    public String getName(){
        return name;
    }

    /**
     *　攻撃力のsetterメソッド。
     * @param name この生き物に与えたい名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *　攻撃力のgetterメソッド。
     * @return この生き物の攻撃力
     */
    public int getAttack(){
        return attack;
    }

    /**
     *　攻撃力のsetterメソッド。
     * @param attack この生き物に与えたい攻撃力
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     *　HPのgetterメソッド。
     * @return この生き物のHP
     */
    public int getHitpoint(){
        return hitPoint;
    }

    /**
     *　HPのsetterメソッド。
     * @param hitpoint この生き物に与えたいHP
     */
    public void setHitpoint(int hitpoint) {
        this.hitPoint = hitpoint;
    }

    /**
     *　生き物が何かに攻撃する時のメソッド。
     * @param opponent 攻撃対象
     */
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

    /**
     *　生き物にダメージが与えられた時のメソッド。
     * @param damage 与えられたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}
