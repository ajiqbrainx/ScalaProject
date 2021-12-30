package Dec20

abstract class ScalaAbstract {
def details()
}
class ScalaAbstract1 extends ScalaAbstract{
  override def details(): Unit = {
    println("Ajith")
    println("Ashok")

  }
}
object Main extends App{

  val scalaAbstract1=new ScalaAbstract1
  scalaAbstract1.details()
}