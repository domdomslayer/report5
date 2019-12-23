package jp.ac.uryukyu.ie.e195713;

/**
 * ヒーロークラス。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {
    public Hero (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);;
    }

    @Override
    public void wounded(int damage){
        setHitpoint(getHitpoint() - damage);
        if( getHitpoint() < 0 ) {
            setDead(true);
            System.out.printf("%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}