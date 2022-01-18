package Dec29

class Apply1(val a: Int, val b: Int) {

}

object Apply1 {
  def apply(a: Int, b: Int): Apply1 = new Apply1(a,b) //We Have to create a new Object for that class
  //It should be in return type in class name

  def unapply(Aji: Apply1) =println( Aji.a + Aji.b)

}

object Main extends App {

  val apply1 = new Apply1(12, 34)
  Apply1.unapply(apply1)

}