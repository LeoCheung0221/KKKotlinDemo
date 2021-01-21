package com.tufusi.kkkotlin.design_patterns.StructuralType.flyweight.demo;

/**
 * Created by LeoCheung on 2021/1/21.
 *
 * @description
 */
public class ChesspieceFactory {

    private static final ChesspieceFlyweight WHITE = new ChesspieceFlyweight("白");
    private static final ChesspieceFlyweight BLACK = new ChesspieceFlyweight("黑");

    public static ChesspieceFlyweight getChesspiece(String color) {
        if (color.equals("白")) {
            return WHITE;
        } else if (color.equals("黑")) {
            return BLACK;
        }
        return null;
    }
}