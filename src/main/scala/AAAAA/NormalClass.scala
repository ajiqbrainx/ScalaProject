package AAAAA

import java.util.Objects

object NormalClass extends App {

  case class CASE(name: String, age: Int)

  class Normal(val name: String, val age: Int) extends Product{

    override def equals(obj: Any): Boolean = {
      if (obj == null) false
      else if (!obj.isInstanceOf[Normal]) false
      else {
        val temp: Normal = obj.asInstanceOf[Normal]
        (this.age == temp.age) && (this.name == temp.name)

      }
    }

    override def productArity: Int = 2

    override def productElement(n: Int): Any = {
      if(n==0){
        name
      }
      else if(n==1){
        age
      }
      else throw new IndexOutOfBoundsException
    }

    override def productElementName(n: Int): String = {
      if(n==0){
        "name"
      }
      else if(n==1){
        "age"
      }
      else throw new IndexOutOfBoundsException

    }
    override def canEqual(that: Any): Boolean = ???

    override def hashCode(): Int = Objects.hash(name,age)
  }

  val Case1 = CASE("Aji", 23)
  val Case2 = CASE("Aji", 23)
  println(Case1 == Case2)
  println(Case1.equals(Case2))

  println(Case1.productElement(1))
  println(Case2.productElement(0))
  println(Case1.productElementName(1))
  println(Case2.productElementName(0))


  println(Case1.hashCode())
  println(Case2.hashCode())
  println()

  println("Normal")
  val normal1 = new Normal("Aji", 23)
  val normal2 = new Normal("Aji", 23)
  println(normal1 == normal2)
  println(normal1.equals(normal2))

  println(normal1.productElement(1))
  println(normal2.productElement(0))
  println(normal1.productElementName(1))
  println(normal2.productElementName(0))

  println(normal1.hashCode())
  println(normal2.hashCode())
}


