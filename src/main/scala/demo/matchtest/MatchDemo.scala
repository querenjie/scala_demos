package demo.matchtest

object MatchDemo {
  def matchTest(x:Int):String=x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  case class Person(name:String, age:Int)

  val matchPerson = (personList:List[Person]) => {
    for (person <- personList) {
      person match {
        case Person("Alice", 25) => println("Hi Alice")
        case Person("Bob", 32) => println("Hi Bob")
        case Person(name111, age111) => println("Age:" + age111 + " year, name:" + name111 + "?")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    println(matchTest(3))
    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)
    val personList = List(alice, bob, charlie)
    matchPerson(personList)
  }
}
