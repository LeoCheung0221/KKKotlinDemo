package com.tufusi.kkkotlin.design_patterns.StructuralType.adapter.demo;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
public class FoodAdapter extends Dumplings implements Wonton {

    @Override
    public void makeWonton() {
        super.makeDumplings();
        System.out.println("馄饨和水饺一样是以面粉为原料包馅的食品");
    }
}