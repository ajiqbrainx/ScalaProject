package Jan10

import javax.security.sasl.Sasl

object ThreadEx extends App{
  
  for (i <- 1 to 100) {
    val thread = new Thread {
      override def run {
        println(Thread.currentThread().getName)
      }
    }
    thread.start
    Thread.sleep(50) // slow the loop down a bit

  }

}
