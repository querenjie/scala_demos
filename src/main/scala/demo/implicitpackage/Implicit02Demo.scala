package demo.implicitpackage

class Car(val name:String)

class SuperMan(name:String) {
  def emitLaser() = {
    println("name=" + name + ", emit a pingpang ball...")
  }
}

object Implicit02Demo {
  implicit def car2SuperMan(car: Car): SuperMan = {
    new SuperMan(car.name)
  }

  def main(args: Array[String]): Unit = {
    val car = new Car("qingtianzhu")
    car.emitLaser()
  }
}
