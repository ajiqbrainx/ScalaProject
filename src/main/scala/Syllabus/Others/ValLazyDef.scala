package Syllabus.Others

class ValLazyDef {
val s={
  println("val ")
  23
}
  lazy val s1={
    println("Lazy val")
    34
  }
  def ss ={
    println("Def ")
    9
  }
}
object Lazy extends App{
  val obj=new ValLazyDef
  println(obj.s)
  println("***Val***")
  println(obj.s1)
  println("*****Lazy val*****")
  println(obj.ss)
  println("*****Def*****")
  println(obj.s)
  println("***Val***")
  println(obj.s1)
  println("*****Lazy val*****")
  println(obj.ss)
  println("*****Def*****")
}