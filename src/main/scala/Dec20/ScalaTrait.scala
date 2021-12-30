package Dec20

trait ScalaTrait {
  def abstract1(x: Int, y: Int): Int

  //It is abstract method using trait
  def abstract2(x: Int, y: Int): Int

}

trait Scala {
  var ss = 23

  def aa(x: Int): Int
}

trait Scala1 {
  var a=12
}

class ScalaTrait1 extends ScalaTrait with Scala with Scala1 {
  override def abstract1(x: Int, y: Int): Int = x + y

  override def abstract2(x: Int, y: Int): Int = (x + y) * 3

  override def aa(x: Int): Int = x * x


}

object Main1 extends App{
  val scalaTrait=new ScalaTrait {
    override def abstract1(x: Int, y: Int): Int = x+y

    override def abstract2(x: Int, y: Int): Int = x-y
  }
  println(scalaTrait.abstract1(23,233))
  println(scalaTrait.abstract2(34,56))
//
//  It is one of the State to use the Trait

  val scalaTrait1 =new ScalaTrait1
  scalaTrait1.a=34
  println(scalaTrait1.abstract1(2,4))
  println(scalaTrait1.aa(22))
  println(scalaTrait1.a)
}