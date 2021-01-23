# 定义
又称快照模式或者Token模式。在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
这样，以后就可以将该对象恢复到原先保存的状态。

通俗的讲，备忘录模式就是将一个对象进行备份，提供一种程序数据的备份方法。

# 备忘录模式有3个角色
* **发起人（Originator）角色：**
该角色记录当前时刻的内部状态，负责定义哪些属于备份范围的状态，负责创建和恢复备忘数据。

* **备忘录（Memento）角色：**
该角色负责存储发起人角色的内部状态，在需要时提供发起人需要的内部状态数据。

* **负责人（Caretaker）角色：**
该角色对备忘录角色进行管理、保存和提供备忘录

# 备忘录模式应用场景

* 需要保存和恢复数据的相关状态场景
* 提供一个可回滚的操作
* 需要监控副本的场景
* 数据库连接的事务管理

# 备忘录模式注意事项

* 备忘录的生命周期
* 备忘录的性能