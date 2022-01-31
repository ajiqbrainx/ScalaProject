package Syllabus.PatternCaseClass

object Obj extends App {

  def a(a: Any): Unit = a match {

    case s: Int => println(s)
    case r: String => println(r)
    case d: Double => println(d)
    case f: Boolean => println(f)
  }

  a(1)
  a("Ajith")
}

sealed class A

case class A1(name:String) extends A

class  A2 extends A

class  A3 extends A

object SS extends App{
  def ss(a:A)={
    a match {
      case A1(name) =>println("A1")
      case x:A2 => println("A2")
      case x:A3 => println("A3")
    }
  }
}


