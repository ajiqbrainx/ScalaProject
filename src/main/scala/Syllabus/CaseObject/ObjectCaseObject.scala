package Syllabus.CaseObject

import java.util.Date
import scala.Console.in

object Car {
  val numberOfWheels = 4

  def run(): Unit = {
    val currentDateAndTime: Date = new Date(System.currentTimeMillis())
    println(s"I am a new car running on $currentDateAndTime!")
  }
}
case object Bicycle {
  val numberOfWheels = 2

  def run(): Unit = {
    val currentDateAndTime: Date = new Date(System.currentTimeMillis())
  }
}
class ObjectExampleUnitTest {
  //  "Bicyle" should "be an instance of Serializable" in
  {
    val a=assert(Bicycle.isInstanceOf[Serializable])
  }

  //  "Car" should "not be an instance of Serializable" in
  {
    val b=assert(!Car.isInstanceOf[Serializable])
  }

}
object ObjectCaseObject extends App{
val objectExampleUnitTest=new ObjectExampleUnitTest
//println(objectExampleUnitTest.a)

}
