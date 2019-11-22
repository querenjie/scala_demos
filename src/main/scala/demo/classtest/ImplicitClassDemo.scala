package demo.classtest

object ImplicitClassDemo {
  case class Rectangle(width1:Int, height1:Int) {
    var x = width1
    var y = height1

    def calcArea(): Int = {
      return x * y
    }
  }

  /**
    * 此处定义一个隐式类，在类名后面要跟上入参。
    * 在使用的时候是用不上类名的，但是要用到入参。入参是什么类型的实参也必须是什么类型的。
    * 隐式类中自己定义方法，方法也有入参。
    * 使用的时候直接可以这样用：隐式类的实参 方法名 方法实参
    * @param width
    */
  implicit class RectangleMarker(width: Int) {
    //此处的方法体定义为返回Rectangle对象。
    def 乘(height: Int) = Rectangle(width, height)
  }

  def main(args: Array[String]): Unit = {
    //隐式类的使用，返回一个Rectangle对象
    val easyRec = 3 乘 4
    println(easyRec.calcArea())
    println((5 乘 2).calcArea())
  }
}
