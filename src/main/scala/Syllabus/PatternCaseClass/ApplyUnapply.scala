package Syllabus.PatternCaseClass


object ApplyUnapply extends App {

  class Name(val a: Int, val b: Int)

  object Name {
    def apply(a: Int, b: Int): Name = new Name(a, b)

    def unapply(arg: Name): Option[(Int, Int)] = Some(arg.a, arg.b)
  }

  val obj = Name(1,2)
  //  println(obj.a)
  //  println(obj.b)
  //println(obj+"Normal")
  obj match {
    case x: Name => println(x)
  }
  val s = Name.unapply(obj)

  val Name(a, b) = obj

  s match {
    case Some(value) =>println(value)
    case Some(value)=>println(a+b)

//    case None => println("None")
//    case Name(1,2)=>println("Success")
  }
//  println(s)




}
