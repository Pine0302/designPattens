+ 需求 用户下单完成之后，获得佣金
+ 分析 后台可开放各种分佣模式，以及未来还会新增不同分佣模式 每种模式都有分佣的方法
+ 认为每种模式所计算佣金依赖的外部变量一致（需要订单）且模式之间互相没有影响

用户类  佣金类  订单类 


佣金 有设置 有计算 


工厂方法模式建议使用特殊的工厂方法代替对于对象构造函数的直接调用 （即使用 new运算符）。对象仍将通过 new运算符创建， 只是该运算符改在工厂方法中调用罢了。 工厂方法返回的对象通常被称作 “产品”。

定义一个用于创建对象的接口，让子类决定实例化哪一个类。Factory Method使得一个类的实例化延迟（目的：解耦，手段：虚函数）到子类。 ——《设计模式》GoF

Factory Method模式用于隔离类对象的使用者和具体类型之间的耦合关系。面对一个经常变化的具体类型，紧耦合关系(new)会导致软件的脆弱。
Factory Method模式通过面向对象的手法，将所要创建的具体对象工作延迟到子类，从而实现一种扩展（而非更改）的策略，较好地解决了这种紧耦合关系。
Factory Method模式解决“单个对象”的需求变化。缺点在于要求创建方法/参数相同。

<div align="center">
<img src="https://pine-static.oss-cn-hangzhou.aliyuncs.com/uPic/factory-method.png" height="500" width="800" >
</div>

Product：一个抽象类，属于框架的一部分。里面定义了在Factory Method模式下生成的实现所拥有的接口（API）；-->Commission

Creator：负责生成Product角色的抽象类，也是属于框架的一部分；   --->CommissionFactory

ConcreteProduct：决定了具体的产品；----> AreaCommission/GlobalCommissionFactory

ConcreteCreator：负责生成具体的产品类。 ---->AreaCommissionFactory/GlobalCommissionFactory



