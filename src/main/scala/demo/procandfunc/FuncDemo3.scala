package demo.procandfunc

/**
  * 高阶函数
  * 接受其他函数作为参数的函数称为高阶函数
  * 可以直接将某个函数作为参数传入其他函数
  * 将函数作为返回值
  */
object FuncDemo3 {
  val say = (name: String) => println("hello " + name)
  def greeting(func: (String) => Unit, name: String): Unit = {
    func(name)
  }

  /**
    * getGreetingFun函数返回的是一个匿名函数，匿名函数有入参描述(name: String)，其函数体是println(msg + " , " + name)
    * @param msg
    * @return
    */
  def getGreetingFunc(msg: String) = (name: String) => println(msg + " , " + name)


  def main(args: Array[String]): Unit = {
    //将函数作为参数
    greeting(say, "Tom")
    //将函数作为返回值
    val greetingFunc = getGreetingFunc("hello")
    println(greetingFunc("leo"))

    /*
    高阶函数的类型推断
    高阶函数可以自动推断参数类型，不需要写明类型
    如果函数只有一个参数，可以省略小括号
     */
    greeting((name:String)=>println("hello"+ " "+name),"tom")
    greeting (name=>println("hello"+ " "+name),"tom")
  }
}
