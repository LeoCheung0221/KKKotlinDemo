package com.tufusi.kkkotlin.design_patterns.BehavioralType.mediator.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class MarriageAgencyImpl implements MarriageAgency {

    List<Man> men = new ArrayList<>(); // 男会员
    List<Woman> women = new ArrayList<>(); // 女会员

    @Override
    public void pair(Person person) {
        if (person.sex == Person.Sex.MALE) {
            for (Woman w : women) {
                if (w.age == person.requestAge) {
                    System.out.println(person.name + "和" + w.name + "配对成功");
                    return;
                }
            }
        } else if (person.sex == Person.Sex.FEMALE) {
            for (Man m : men) {
                if (m.age == person.requestAge) {
                    System.out.println(person.name + "和" + m.name + "配对成功");
                    return;
                }
            }
        }
        System.out.println("没有为" + person.name + "找到合适的对象！");
    }

    @Override
    public void register(Person person) {
        if (person.sex == Person.Sex.MALE) {
            men.add((Man) person);
        } else if (person.sex == Person.Sex.FEMALE) {
            women.add((Woman) person);
        }
    }
}