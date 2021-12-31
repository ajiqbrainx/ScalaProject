package Dec29

import scala.collection.mutable

object Main1 extends App{
val caseExample=new CaseExample(22,"Ajith") //we can create an object without new keyword
  val caseExample1=new CaseExample(22,"Ajith")
  val caseExample2=new CaseExample(25,"AjithAshok")
  println(caseExample.Age)
  println(caseExample.Name)
  println(caseExample)

  val class1=new Class1(11,"Ajith1") // We can create a With a new Keyword
  val class2=new Class1(11,"Ajith1")
  val class3=new Class1(12,"Ajith2")
  println(class1.Age)
  println(class1.Name)
  println("*************"+class1)
  println("*************")

  val caseex= new mutable.HashSet[CaseExample]()
  val classx= new mutable.HashSet[Class1]()


  caseex.add(caseExample)
  caseex.add(caseExample1)
  caseex.add(caseExample2)
  classx.add(class1)
  classx.add(class2)
  classx.add(class3)

  println(caseex.size)
  println(caseex)
  println(classx.size)
  println(classx)

println("********CASE CLASS***********")

  println(caseExample.hashCode())
  println(caseExample1.hashCode())
  println(caseExample2.hashCode())

  println("****CLASS******")

  println(class1.hashCode())
  println(class2.hashCode())
  println(class3.hashCode())


  println("*********In scala we use a equals Option **************")
    println("*****Case class Example*******")

  println(caseExample==caseExample)
  println(caseExample.equals(caseExample1))
  println(caseExample equals(caseExample2))

  println("*******Normal class*********")
  println(class1==class1)
  println(class1.equals(class2))
  println(class1 equals(class3))


  println("*********** Product Iterator *********************")
  //It means only show the property =>like your pass a parameter
  val iterator=Class1
}
