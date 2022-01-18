package Syllabus.CaseNormal

class Equality(val a: String, val b: Int) {
  override def equals(obj: Any): Boolean =
    if (obj == null) {
      false
    } else if (!obj.isInstanceOf[Equality]) {
      false
    } else {
      val tempObj:  Equality = obj.asInstanceOf[ Equality]
      (this.a == tempObj.a) && (this.b == tempObj.b)
    }
}

case class ClassEquality(a: String, b: Int)

object Equality1 extends App {
  val equality = new Equality("Ajith", 2)
  val equality1 = new Equality("Ajith", 2)
  val equality2 = new Equality("Ashok", 3)
  println(equality == equality1) //normal class can not access in equality //If you want to put override on your class
  println(equality1 == equality2) //normal class can not access in equality //If you want to put override on your class
  println(equality2 == equality)  //normal class can not access in equality //If you want to put override on your class
println("******Case class *********")
  val classEquality=ClassEquality("Ajith",2)
  val classEquality1=ClassEquality("Ajith",2)
  val classEquality2=ClassEquality("Ashok",3)
  println(classEquality==classEquality1)  //case class can access in equality
  println(classEquality1==classEquality2) //case class can access in equality
  println(classEquality2==classEquality) //case class can access in equality
}