package demo.procandfunc

object ProcFuncDemo {
  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b
    return sum
  }

  var factor = 3
  val multiplier = (i: Int) => i * factor

  val getStrLen = (s: String) => s.length

  val sayHello = (name1: String, name2: String) => {
    println(s"Hello, $name1 and $name2")
  }

  val showTall = (name: String, tall: Double) => println(f"$name%s is $tall%1.20f meters tall" )

  def main(args: Array[String]): Unit = {
    var a: Int = 5; var b: Int = 7
    println("Returned Value：" + addInt(a, b))
    println( "multiplier(1) value = " +  multiplier(1) )
    println( "multiplier(2) value = " +  multiplier(2) )
    var str = "this is a string"
    println("String content is: '" + str + "'\tString length is : " + getStrLen(str))
    str = "你好"
    println("String content is: '" + str + "'\tString length is : " + getStrLen(str))
    sayHello("kite", "Cat")
    println(s"1+2=${1+2}")
    showTall("James", 1.8d)
  }
}
