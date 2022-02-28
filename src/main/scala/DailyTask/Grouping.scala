package DailyTask

object Grouping extends App {

  def grouping1(a: Int)(b: Int)(c: Int): Int = a + b + c

  println(grouping1(1)(2)(3))

  val grouping= (a: Int) => (b: Int) => (c: Int) => a + b + c

  println(grouping(1)(2)(3))

}
