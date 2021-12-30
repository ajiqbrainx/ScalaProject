package Dec30

object TupleMatch extends App {

  val ss=(1,"Ajith")

  ss match {
    case x=>println(x.isInstanceOf[(Int,String)])
  }
  ss match {
    case (i, str) =>println(i,str)
  }
val ss1: ((Int, String), Double) =((22,"Ajith"),67.8)
  ss1 match {
    case (tuple, d) => {
      println(tuple)
      println(d)
    }
    case ((i,str),d)=>{
      println(i)
      println(str)
      println(d)
    }
  }
}
