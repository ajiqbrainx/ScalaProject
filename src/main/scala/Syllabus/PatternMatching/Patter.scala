package Syllabus.PatternMatching

object Patter extends App{


  def check(A:Int)=A match {
    case 1=>"One"
    case 2=>"Two"
    case _=>"No Number Avilable"
  }
println(check(1))
  println(check(2))
  println(check(0))
  println("********String ******")
  def name(x:String)=x match {
    case "Ajith" => s"Your name is Ajith"
    case "Ashok" => "Your name is Ashok"
    case _=>"Your name is not in list"
  }

  println(name("Ajith"))
  println(name("Ashok"))
  println(name("Abi"))
}
