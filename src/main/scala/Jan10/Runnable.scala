package Jan10

object Runnable extends App{


  println(Thread.currentThread().getName)

    class RunnableImpl extends Runnable {

      override def run(): Unit = {
//        Thread.sleep(100)
        println(Thread.currentThread().getName)
      }
    }

    val thread1 = new Thread(new RunnableImpl, "Thread 1")
    val thread2 = new Thread(new RunnableImpl, "Thread 2")

    thread1.start()
    thread2.start()


  println(Thread.currentThread().getName)

}
