package Jan10

object Synchronized extends App {
  println(Thread.currentThread().getName)


  val runnable: Runnable = () => synchronized {
    for (i <- 1 to 5) {
      println(s"[${Thread.currentThread().getName}]$i + 5 =${i + 5} ")
      Thread.sleep(100)
    }
  }
  new Thread(runnable, "Thread 1").start()
  new Thread(runnable, "Thread 2").start()

//  println(Thread.currentThread().getName)


}
