package demo.learn.Chapter02

/**
  * 定义一个抽象类，其中有一个变量和2个方法声明
  */
abstract class MyWriter {
  var message: String = "null"
  def setMessage(message: String):Unit
  def printMessage():Unit
}

/**
  * 定义一个具体类实现抽象类中的方法。
  */
class ConsolePrinter extends MyWriter {
  def setMessage(contents: String):Unit= {
    this.message = contents
  }

  def printMessage():Unit= {
    println(message)
  }
}

//trait lowerCase extends MyWriter {
//  abstract override def setMessage(contents: String) : Unit=
//    printMessage()
//}

object AbstractClass {
  def main(args: Array[String]): Unit = {
    val printer:ConsolePrinter = new ConsolePrinter()
    printer.setMessage("Hello! world!")
    printer.printMessage()
  }

}