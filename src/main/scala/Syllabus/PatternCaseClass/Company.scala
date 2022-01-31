package Syllabus.PatternCaseClass

abstract class Mobile {

}

case class SwitchOff(off: String) extends Mobile {
  def switchOff = "Your mobile is Switch OFF"

}

case class SwitchOn(on: String) extends Mobile {
  def switchOn = "Your mobile is Switch ON"

}

object main11 extends App {
  def mobile(a: Mobile) = {
    a match {
      case on: SwitchOn => on.switchOn
      case off: SwitchOff => off.switchOff
    }
  }
println(SwitchOn("ON"))
  println(SwitchOff("OFF"))
}