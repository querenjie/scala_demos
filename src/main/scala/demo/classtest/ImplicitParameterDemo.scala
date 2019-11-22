package demo.classtest

object ImplicitParameterDemo {
  case class Remote(address: String)
  case class Home(address: String)

  object Transportation {
    /**
      * 如果在方法中定义了隐式参数，在调用方法时可以不必显式传入隐式参数。
      * @param transportTools
      * @param remote1
      * @param home1
      */
    def transport(transportTools: String)(implicit remote1: Remote, home1: Home) = {
      println(s"To celebrate spring festival, go from $remote1 to $home1 by $transportTools")
    }
  }

  object Address {
    //在此object中定义的隐式变量一定要和transport方法中的隐式参数类型相对应，对应是指类型要匹配而不是变量名匹配。
    //此处的定义便是对transport方法中的隐式参数进行初始化默认值。
    implicit val remote = new Remote("Shanghai")
    implicit val home = new Home("BeiKing")
  }

  object GoHome {
    import Address._

    /**
      * 这边调用transport方法并未传入隐式参数，这是合法的。隐式参数的默认值在Address对象中有定义。
      * 所以在调用此方法之前一定要先导入Address对象中的所有内容过来。
      * 调用此方法时如果没有显式传入隐式参数，scala会自动去找隐式参数对应的默认值。
      */
    Transportation.transport("AirPlane")
  }

  def main(args: Array[String]): Unit = {
    GoHome
  }
}
