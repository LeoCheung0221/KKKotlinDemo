# 定义
也叫合成模式，用来描述部分与整体的关系。将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性。

# 组合模式提供3个角色

* **抽象构件（Component）角色：**
该角色定义参加组合对象的共有方法和属性，规范一些默认的行为接口

* **叶子构件（Leaf）角色：**
该角色是叶子对象，其下没有其他的分支，定义出参加组合的原始对象的行为

* **树枝构件（Composite）角色：**
该角色代表参加组合的、其下有分支的树枝对象，它的作用是将树枝和叶子组合成一个树形结构，并定义出管理子对象的方法，如add()、remove()等。

# 组合模式的优缺点

优点：

* 高层模块调用简单，一颗树形结构中的所有节点都是 Component，局部和整体对调用者来说没有任何区别，即高层模块不必关心自己处理的是单个对象还是整个组合结构，简化了高层模块的代码

* 节点自由增加。使用组合模式后，如果想增加一个树枝节点、叶子结点 只需要找到其父节点即可

缺点：

* 不易控制树枝构件的类型。

* 不易使用继承的方法来增加新的行为。