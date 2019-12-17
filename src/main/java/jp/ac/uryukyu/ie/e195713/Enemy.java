package jp.ac.uryukyu.ie.e195713;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    @Override
    public void wounded(int damage){
        setHitpoint(getHitpoint() - damage);
        if( getHitpoint() < 0 ) {
            setDead(true);
            System.out.printf("%sは倒れた。\n", getName());
        }
    }

}