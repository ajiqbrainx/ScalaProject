package Syllabus.PatternCaseClass

object Obj extends App {

  def a[T](a:T): Unit = a match {

    case s: Int => println("Int")
    case r: String => println("String")
    case d: Double => println("Double")
    case f: Boolean => println("Boolean")
  }

  a(1)
  a("Ajith")
  a(23.4)


  def add[T,A](name:T,age:List[A])={


  }
}
//
//sealed class A
//
//case class A1(name:String) extends A
//
//class  A2 extends A
//
//class  A3 extends A
//
//object SS extends App{
//  def ss(a:A)={
//    a match {
//      case A1(name) =>println("A1")
//      case x:A2 => println("A2")
//      case x:A3 => println("A3")
//    }
//  }
//}


