package Dec20.Dec21

import scala.math.Fractional.Implicits.infixFractionalOps

object HigherOrder extends App {
  def sum(x: Int, y: Int, fxn: (Int, Int) => Int) = fxn(x, y)

  println(sum(2, 4, (a, b) => a + b))


  def sub(x: Int, y: Int, fxn: Function2[Int, Int, Int]) = fxn(x, y)

  println(sub(23, 4, (a, b) => a - b))

  def add(x: Int, y: Int): Any => String = z => "Add the values " + (x + y)

  println(add(12, 34)(0))

  def group(a:Int,b:Int)(c:String)(d:Boolean)=a+b+c+d
  println("********* Group Of Argument *******")
  println((group(1,2)("Add")(true)))


def group1(fxn:(Any,Any)=>Any)(c:String)(d:Double)= fxn(c,d)
  println("********* group Takes an function   *********")
  println(group1((a,b)=>s"$a is the price is  $b")("Ajith")(10.1))

  val jj: (Int, Int) => Int = (a, b) => a + b
  val dd: (Int, Int) => Boolean = (a, b) => a == b
  println(jj(12, 3))
  println(dd(2, 4))




  val jk: (Int, Int) => String = (a: Int, b: Int) => s"Add values" + (a+b)

  val ss: (Int, String, Boolean, Double) =(1,"Ajith",true,120.0)

}
