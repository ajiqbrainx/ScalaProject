package AAAAA

object Main extends App{

}
case class CaseEx(name: String, age: Int) {

  val userBase = List(
    CaseEx("Travis", 28),
    CaseEx("Kelly", 33),
    CaseEx("Jennifer", 44),
    CaseEx("Dennis", 23))

  val twentySomethings =
    for (user <- userBase if user.age >= 20 && user.age < 30)
      yield user.name // i.e. add this to a list

  twentySomethings.foreach(println)

}
