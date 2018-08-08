package demo.classtest

class Point( xc:Int,  yc:Int) {
  var x:Int=xc
  var y:Int=yc

  def move(dx:Int, dy:Int): Unit = {
    x = x + dx
    y = y + dy
    println("Point x location : " + x)
    println ("Point y location : " + y)
  }

  val move2 = (dx: Int, dy: Int) => {
    x = x + 2 * dx
    y = y + 2 * dy
    println("now x = " + x)
    println("now y = " + y)
  }
}

class Location(  xc:Int,   yc:Int, val zc:Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) = {
    x = x + dx
    y = y + dy
    z = z + dz
    println ("Point x location : " + x)
    println ("Point y location : " + y)
    println ("Point z location : " + z)
  }
}

object PointDemo {
  def main(args: Array[String]): Unit = {
    val point = new Point(10, 20)
    point.move(10, 10)
    point.move2(10, 10)
    println("---------------------------------------------------------")
    val loc = new Location(10, 20, 15)
    loc.move(10, 10, 5)
  }
}
