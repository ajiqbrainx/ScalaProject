package Dec29

class Apply1(val a:Int, val b:Int) {

}
object Apply1{
  def apply(a: Int, b: Int): Apply1 = new Apply1(1, 6)

}
object Main extends App{
// println(Apply1.apply(a))
  println(Apply1.apply(2,4))

}