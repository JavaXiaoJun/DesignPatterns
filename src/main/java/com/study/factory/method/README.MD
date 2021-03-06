# 概念
- 工厂方法模式，定义一个用于创建对象工厂的接口，让子类决定实例化哪一个产品类。工厂方法使一个产品类的实例化延迟到工厂子类。

#优点
- 继承了简单工厂的有点：集中封装了产品对象的创建，使得更换产品对象时，不需要做大的改动就可以实现，降低了客户端和产品对类的耦合
- 克服了简单工厂对修改开放的缺点，严格遵循了开放封闭原则
- 客户端代码克服了"创建产品类重复代码"的坏味道，需要改变产品类实现的时候只需要改动一处即可

#缺点
- 仍然存在分支判断的问题
- 工厂方法把简单工厂的内部逻辑判断移到了客户端
- 客户端需要了解更多的工厂子类
- 没添加一个产品就需要增加对应的工厂，类规模扩大了