# 概念
   动态代理：定义这样一个代理类，它能代理所有实现类的方法调用：根据传进来的业务实现类和方法名进行具体调用。

# 典型实现
  1.jdk动态代理
    JDK动态代理是利用反射机制生成一个实现代理接口的匿名类，在调用具体方法前调用InvokeHandler来处理。
    所用到的代理类在程序调用到代理类对象时才由JVM真正创建，JVM根据传进来的业务实现类对象以及方法名，动态地创建了一个代理类的class文件并被字节码引擎执行，
    然后通过该代理类对象进行方法调用。我们需要做的，只需指定代理类的预处理、调用后操作即可。

  2.CGlib动态代理
    CGlib动态代理是针对类来实现代理的，原理是对指定的业务类生成一个子类，并覆盖其中业务方法实现代理。因为采用的是继承，所以不能对final修饰的类进行代理。

# 二者区别
  1.JDK的动态代理只能用于实现了接口的目标对象
  2.CGLIB的动态代理既可以用于没有实现接口的目标对象，也可以用于实现了接口目标对象。由于采用的是继承，所以不能对final修饰的类进行代理(final修饰的类不可以被继承)，
    同时代理类业务方法中无法使用类的成员变量。