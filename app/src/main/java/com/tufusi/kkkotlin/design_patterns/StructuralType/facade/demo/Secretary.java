package com.tufusi.kkkotlin.design_patterns.StructuralType.facade.demo;


/**
 * Created by LeoCheung on 2021/1/21.
 *
 * @description facade角色
 */
public class Secretary {

    private Airport airport = new Airport();
    private Chauffeur chauffeur = new Chauffeur();
    private Hotel hotel = new Hotel();
    private Restaurant restaurant = new Restaurant();

    // 安排出差
    public void trip(String to, int days) {
        airport.bookTicket("青岛", to);
        chauffeur.drive("机场");
        hotel.reserve(days);
    }

    // 安排饭局
    public void repast(int num){
        restaurant.reserve(num);
        chauffeur.drive("酒店");
    }
} 