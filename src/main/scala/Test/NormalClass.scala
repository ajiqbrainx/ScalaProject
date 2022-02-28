package Test

object NormalClass extends App {

  case class Ajith(name: String, age: Int)

  class Ashok(val name: String, val age: Int) extends Product {

    override def equals(obj: Any): Boolean =
      obj match {
        case _ if obj == null => false
        case _ if !obj.isInstanceOf[Ashok] => false
        case _ => val tempObj: Ashok = obj.asInstanceOf[Ashok]
          this.name == tempObj.name && this.age == tempObj.age
      }

    override def productArity: Int = 2

    override def productElement(n: Int): Any = {
      n match {
        case _ if n == 0 => name
        case _ if n == 1 => age
        case _ => println("No Element Name is Found")
      }
    }

    override def productElementName(n: Int): String = {
      n match {
        case _ if n == 0 => "name"
        case _ if n == 1 => "age"
        case _ => "No name Found"
      }
    }

    override def canEqual(that: Any): Boolean = ???
  }

  object Ashok {
    def apply(name: String, age: Int) = new Ashok(name, age)


  }

  val ajith = Ajith("Ajith", 23)
  val ajith1 = Ajith("Ajith", 23)
  val ashok = Ashok("Ajith", 23)
  val ashok1 = new Ashok("Ajith", 23)

  println(ajith.equals(ajith1))
  println(ashok.equals(ashok1))

  println(ajith.productElement(0))
  println(ajith.productElementName(0))

  println(ashok.productElement(0))
  println(ashok.productElementName(0))



}
