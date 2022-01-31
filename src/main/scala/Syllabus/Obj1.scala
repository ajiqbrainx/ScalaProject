package Syllabus




object mains extends App{

  object Obj1
  case object Obj2

  val a=Obj1.isInstanceOf[Serializable]
  val b=Obj2.isInstanceOf[Serializable]
  println(a)
  println(b)
}