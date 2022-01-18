package Syllabus.CaseNormal

class Product (val a:String,val b:Int) extends Serializable with product{

}
object Product1 extends App{
  val product=new Product("Ajith",23)
  val product1=new Product("Ajith",23)
  val iterator: Iterator[Any] = product.produ
  println(">>>>>>>>>>>>>>>>")
  while (iterator.hasNext) {
    println(iterator.next())
  }
  println(">>>>>>>>>>>>>>>>")
  val iteratorName: Iterator[String] = product1.productElementNames
  while (iteratorName.hasNext) {
    println(iteratorName.next())
  }
}
