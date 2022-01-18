package Syllabus.Option

object OptionMap extends App{

  val a=Map(1->"Ajith",2->"Ashok")

  val first=a.get(1)
  val second=a.get(2)
  val third=a.get(3)
  println(first)
  println(second)
  println(third)

}
