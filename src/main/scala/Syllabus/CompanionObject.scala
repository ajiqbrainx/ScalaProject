package Syllabus

object CompanionObject {
private val name="Ajith"
  private val name1="Ashok"

}
class CompanionObject {
  private val age =12
  def print() = {
    println(CompanionObject.name)
    println(CompanionObject.name1)
  }
}
object Main extends App{
  val companionObject=new CompanionObject
  companionObject.print()
}