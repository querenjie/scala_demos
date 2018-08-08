package demo.console

object ConsoleInputDemo {
  def main(args: Array[String]): Unit = {
    print("请输入字符串：")
    val line = Console.readLine()
    println("谢谢，刚才你输入的是：" + line);
  }
}
