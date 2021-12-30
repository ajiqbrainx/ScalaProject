package Dec29

import java.util.Objects

class Class1 (val Age:Int,val Name:String) extends Product with Serializable
{
  override def toString: String = s"$Age$Name"

  override def hashCode(): Int = Objects.hash(Age,Name)
  //Hash code If you want to same as like case class you insert the hashcode overwirte

//  override def equals(obj: Any): Boolean = {
//    if (obj==null){
//      false
//    }else if(!obj.asInstanceOf[Class1]){
//      false
//    }else{
//      val Obj:Class1=obj.asInstanceOf[Class1]
//      (this Name==Obj)
//
//    }
//  }

  override def productArity: Int = ???

  override def productElement(n: Int): Any = ???

  override def canEqual(that: Any): Boolean = ???
}
object Class1{
  def apply(Age: Int, Name: String): Class1 = new Class1(Age, Name)

}