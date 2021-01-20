package com.tufusi.kkkotlin.design_patterns.StructuralType.decor.demo;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description 具体汽车装饰
 */
public class ConcreteCarDecorator extends CarDecorator {

    public ConcreteCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        super.show();
        this.setPrint();
        this.setGPS();
    }

    private void setGPS() {
        System.out.println("安装GPS定位导航系统");
    }

    private void setPrint() {
        System.out.println("汽车车尾绘制“新手”字样，颜色是金黄色");
    }
}