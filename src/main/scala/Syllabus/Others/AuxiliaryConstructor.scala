package Syllabus.Others

object AuxiliaryConstructor extends App {
  val Aux = new AuxiliaryEx("Ajith", 23, 12, 67, 89, 89)
  Aux.view()
  Aux.working()
}
class AuxiliaryEx(Name: String, Age: Int) {
  var std = 0
  var mark1 = 0
  var mark2 = 0
  var mark3 = 0

  def view(): Unit = {
    println("Name is = " + Name)
    println("Age is = " + Age)
    println("Your Standard is = " + std)
  }

  def working(): Unit = {
    println("Mark 1 = " + mark1)
    println("Mark 2 = " + mark2)
    println("Mark 3 = " + mark3)
    val total = mark1 + mark2 + mark3
    val perc: Double =total / 3
    println("Total mark is = " + total)
    println("Percentage is = " + perc + "%")
  }
  def this(Name: String, Age: Int, Std: Int, Mark1: Int, Mark2: Int, Mark3: Int) = {
    //First we calling the primary constructor

    this(Name, Age)
    //Then I'm accessing Global Fields
    this.std = Std
    this.mark1 = Mark1
    this.mark2 = Mark2
    this.mark3 = Mark3
  }

}