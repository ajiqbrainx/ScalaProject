package Jan04

object Type extends App {
  type x = (String, String)
  type y = (Int, Int)
  type z = (Int, Int) => Boolean
   val a=23

  def typeExample(name: x) = {
    println(name._1)
    println(name._2.length)
  }

  val x: x = ("Ajith", "Ashok")
  typeExample("Ajith", "Ashok")

  def int(Integer:y)={
    var s=Integer._1+Integer._2
    val t=s+a
    println(t)
  }
  int(2,4)

  val z:z=(A,B)=>A==B
  println(z(2,3))
}
