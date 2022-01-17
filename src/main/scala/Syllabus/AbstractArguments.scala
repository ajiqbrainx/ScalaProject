package Syllabus

abstract class AbstractArguments(name1:String, Age1:Int) {
  def show
}
class NormalClass(name:String,Age:Int) extends AbstractArguments(name, Age ){
  override def show: Unit = {
    println("Your name is "+ name)
    println("Your Age is  "+ Age)
  }
}
object AbstractArguments1 extends App{
  val normalClass=new NormalClass("Ajith",23)
  normalClass.show
}