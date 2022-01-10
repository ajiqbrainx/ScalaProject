package Jan10

object ThreadEx extends App{


  val array=List.fill(4000)(1)
//  println(array)
  for (i <- 1 to 100) {
    val thread = new Thread {
      override def run {
        // your custom behavior here
      }
    }
    thread.start
    Thread.sleep(50) // slow the loop down a bit
  }

}
