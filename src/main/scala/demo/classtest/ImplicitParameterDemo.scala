package demo.classtest

object ImplicitParameterDemo {
  case class Remote(address: String)
  case class Home(address: String)

  object Transportation {
    def transport(name: String)(implicit remote1: Remote, home: Home) = {
      println(s"To celebrate spring festival, go from $remote1 to $home by $name")
    }
  }

  object Address {
    implicit val remote = new Remote("Shanghai")
    implicit val home = new Home("aaa")
  }

  object GoHome {
    import Address._
    Transportation.transport("AirPlane")
  }

  def main(args: Array[String]): Unit = {
    GoHome
  }
}
