package Dec20

abstract class ScalaAbstractExample {
  var age=23
  var name="Ajith"
def details():String
}

class Abstract1 extends ScalaAbstractExample{
  override def details(): String = age + name
}
object Main2 extends App{

  val abstract1=new Abstract1
  println(abstract1.details())
}

