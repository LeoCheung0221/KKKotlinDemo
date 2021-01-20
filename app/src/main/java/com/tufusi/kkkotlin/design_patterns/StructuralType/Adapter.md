# 原理
 将一个类的接口编程客户端所期待的另一种接口，从而使原本因接口不匹配而无法再一起工作的两个类能够在一起工作。
 
# 适配器模式涉及角色

* **目标（Target）角色：**
该角色定义要转换成的目标接口

* **源（Adaptee）角色：**
需要被转换成目标角色的源角色，也叫受改造角色。

* **适配器（Adapter）角色：**
该角色是适配器模式的核心，其职责是通过继承或者类关联的方式，将源角色转换为目标角色。

# 适配器模式优缺点

* 适配器模式可以让原本两个没有任何关系的类在一起运行

* 增加了类的透明性

* 提高类的复用度

* 增强代码的灵活性