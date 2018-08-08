package demo.classtest

object ImplicitClassDemo {
  case class Rectangle(width:Int, height:Int) {
    var x = width
    var y = height

    def calcArea(): Int = {
      return x * y
    }
  }
  implicit class RectangleMarker(width: Int) {
    def x(height: Int) = Rectangle(width, height)
  }

  def main(args: Array[String]): Unit = {
    val easyRec = 3 x 4
    println(easyRec.calcArea())
    println((3 x 4).calcArea())
  }
}
