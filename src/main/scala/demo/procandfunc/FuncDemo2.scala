package demo.procandfunc

/**
  * scala 中函数可以独立存在，不需要依赖任何类和对象
  * 将函数赋值给变量
  * 使用def定义方法和函数
  * 函数，方法的区别是出现的位置不同,在类里面是方法 ,在类外是函数
  */
object FuncDemo2 {
  def say(name:String): Unit = {
    println("Hello " + name)
  }

  def main(args: Array[String]): Unit = {
    //将函数赋值给变量时，必须在函数后加上空格和下划线
    val sayFunc = say _
    sayFunc("aaa")
  }

}
