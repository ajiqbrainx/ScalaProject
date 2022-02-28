package Test

object PoojaTest extends App{

  case class Ajith(name:String,Age:Int)
  class Ashok(val name:String,val age :Int) extends Product {
    override def productArity: Int = 2

    override def productElement(n: Int): Any = {
      if(n==0) name
      else if(n==1) age

    }

    override def productElementName(n: Int): String = {
      if (n==0) "name"
      else "age"

    }


    override def canEqual(that: Any): Boolean = ???
  }



  val ajith=Ajith("Ajith",23)
  println(ajith.productElement(1))
  println(ajith.productElementName(1))

  val ajith1 = new Ajith("Godwin",11)
  println(ajith1.productElement(0))
  println(ajith1.productElementName(0))

}
