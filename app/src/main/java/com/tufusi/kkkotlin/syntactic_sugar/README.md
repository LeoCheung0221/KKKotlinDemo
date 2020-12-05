public：默认修饰符，被其修饰的在任何位置都能访问
private：表示只在这个类(以及它的所有成员)之内可以访问
protected：在当前类及其子类内访问
internal：在同一模块module内使用



kotlin 的 open 与java 中的 final相反。kotlin中类和类中的方法都是final
类不能继承，类中方法不能重写，打破final限制，需要添加open关键字
如果你需要允许它可以被继承，那么你需要使用open声明



在kotlin中，abstract的用法几乎和Java一致，当你使用abstract修饰符的时候，可以忽略open修饰符，
因为被abstract修饰的类默认具有open属性。

| 修饰符 | 相应类的成员 | 注解 |
| ---- | ---- | ---- | 
| final   | 不能被覆写 | 在kotlin中默认所有的方法和类都是final属性 |
| open   | 可以被覆写 | 需要被明确指出 |
| abstract   | 必须要覆写 | 不能被实例化，默认具有open属性 |
| override   | 覆写超类的方法 | 如果没有被指定为final，则默认具有open属性 |