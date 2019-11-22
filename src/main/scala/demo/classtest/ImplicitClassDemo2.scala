package demo.classtest

object ImplicitClassDemo2 {

  /**
    * 定义隐式类。
    * 隐式类在使用的过程中无需显示创建类的对象就能使用其中的方法。
    * 在这个例子中可以找到隐式类的使用方式：在隐式类定义中有入参和对应的类型，在类体中有方法名为times，方法的入参貌似是任意类型的对象。
    * 于是在使用的时候可以用这样的形式来使用： 入参 times 任意对象
    * @param x
    */
  implicit class IntTimes(x: Int) {
    var y = 0;
    //方法times的具体功能是循环调用f1对象x次，f1的类型T猜想应该可以是任意类型。
    def times[T](f1: => T) {
      def loop(current: Int): Unit ={
        if(current > 0){
          f1
          y = y + 1
          loop(current - 1)
        }
      }
      loop(x)
      println("调用了" + y + "次")
    }

  }

  def a(i: Int):Unit = {
    print(i+1)
  }

  def main(args: Array[String]): Unit = {
    //在使用的时候，times方法的入参传入的是一个方法
    5 times println("hello")
    3 times a(3)
  }
}
