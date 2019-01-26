package problem6

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future, Promise}
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by takumi on 2017/07/21.
  */
object Problem6 extends App {
  def firstOf[A](v1: Future[A], v2: Future[A]): Future[A] = {
    val a = Promise[A]()

    v1 onComplete a.tryComplete
    v2 onComplete a.tryComplete

    a.future
  }

  val r1 = firstOf(Future{ Thread.sleep(9000); 1 }, Future{ Thread.sleep(3000); 2 })
  println(Await.result(r1, Duration.Inf))

  val r2 = firstOf(Future{ Thread.sleep(900); 1 }, Future.failed(new Exception))
  r2 onComplete {
    case Success(x) => println(x)
    case Failure(t) => println(t)
  }
}
