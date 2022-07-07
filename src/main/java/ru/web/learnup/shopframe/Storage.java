package ru.web.learnup.shopframe;

import java.util.HashMap;

public class Storage {
    private HashMap<Good, Integer> goods;

    public Storage(HashMap<Good, Integer> goods) {
        this.goods = goods;
    }

    public HashMap<Good, Integer> getGoods() {
        return goods;
    }

    public void setGoods(HashMap<Good, Integer> goods) {
        this.goods = goods;
    }
}
