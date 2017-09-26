package com.charactor;

/**
 * Created by Administrator on 2017/9/26.
 */
public class EnemyHeroIsDeadException extends Exception {
    public EnemyHeroIsDeadException() {
    }

    public EnemyHeroIsDeadException(String msg) {
        super(msg);
    }
}
