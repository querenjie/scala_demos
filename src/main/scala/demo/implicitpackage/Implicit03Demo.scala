package demo.implicitpackage

class SignPen {
  def write(name:String) = println(name)
}
object ImplicitContext {
  implicit val signPen = new SignPen()
}

object Implicit03Demo {
  def signForExam(name: String)(implicit signPen: SignPen): Unit = {
    signPen.write("your name for Exam: " + name)
  }

  def signForRegister(name: String)(implicit signPen: SignPen): Unit = {
    signPen.write("your name for register: " + name)
  }

  def main(args: Array[String]): Unit = {
    import ImplicitContext._
    signForExam("roger")
    signForRegister("roger.que")
  }
}
