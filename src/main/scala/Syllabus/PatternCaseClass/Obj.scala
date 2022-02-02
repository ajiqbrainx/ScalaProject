package Syllabus.PatternCaseClass

object Obj extends App {

  def a[T](a:T): Unit = a match {

    case _: Int => println("Int")
    case _: String => println("String")
    case _: Double => println("Double")
    case _: Boolean => println("Boolean")
  }

  a(1)
  a("Ajith")
  a(23.4)
  a(true)






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


