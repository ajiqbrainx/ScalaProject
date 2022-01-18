package Syllabus.Others

abstract class AbstractEx {
  def name //Abstract Method
  def name1(Name:String)={
    println(Name)
  }
}

class Class extends AbstractEx {
  override def name: Unit = println("Your name is Tokoyo")
}
object AbstractEx1 extends App{

  val class1=new Class
  class1.name
  class1.name1("Ajith")

}