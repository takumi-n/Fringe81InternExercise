package problem4

/**
  * Created by takumi on 2017/07/21.
  */
object Problem4 extends App {
  val m1 = Map(1->"one", 2->"two")
  val mOpt1: Option[Map[Int, String]] = Some(m1)
  println(mOpt1.get(1))

  // 上のコードは以下のコードと等価であるため、コンパイルは通る

  val m2 = Map(1 -> "one", 2 -> "two")
  val mOpt2: Option[Map[Int, String]] = Some(m2)
  val tmp = mOpt2.get   // tmp の型は Map[Int, String]
  println(tmp.apply(1)) // tmp.apply(1) の型は String
}
