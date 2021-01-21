# 组合模式提供3个角色

* **抽象构件（Component）角色：**
该角色定义参加组合对象的共有方法和属性，规范一些默认的行为接口

* **叶子构件（Leaf）角色：**
该角色是叶子对象，其下没有其他的分支，定义出参加组合的原始对象的行为

* **树枝构件（Composite）角色：**
该角色代表参加组合的、其下有分支的树枝对象，它的作用是将树枝和叶子组合成一个树形结构，并定义出管理子对象的方法，如add()、remove()等。