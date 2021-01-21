package com.tufusi.kkkotlin.design_patterns.StructuralType.flyweight.demo;

/**
 * Created by LeoCheung on 2021/1/21.
 *
 * @description
 */
public class Game {
    public static void main(String[] args) {
        ChessPiece p1 = ChesspieceFactory.getChesspiece("黑");
        p1.put(1, 1);
        ChessPiece p2 = ChesspieceFactory.getChesspiece("白");
        p2.put(2, 2);
        ChessPiece p3 = ChesspieceFactory.getChesspiece("黑");
        p3.put(3, 3);
        ChessPiece p4 = ChesspieceFactory.getChesspiece("白");
        p4.put(4, 4);
    }
} 