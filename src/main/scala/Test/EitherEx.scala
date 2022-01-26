package Test

import scala.util.{Failure, Success, Try}

object EitherEx extends App {

  def name(a: String): Either[String, String] = {

    if (a.nonEmpty) Right(a)
    else Left("No name")
  }

  println(name("Ajith"))
  println(name(""))

  val map: Map[String, String] = Map("Ajith" -> "01", "Ashok" -> "02", "Abi" -> "03")

  println(map.get("Ajith"))
  println(map.get("Akil"))
  println(map.toList)

  val list=List("Ajith","Ashok","Abi","Akil")
  val foldleft=list.foldLeft("HI ->")((x,y)=>x+y)
println(foldleft)
  val listInt=List(1,2,3,4,5).foldLeft(1)((x,y)=>x+y)
  println(listInt)
}

