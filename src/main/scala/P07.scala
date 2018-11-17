object P07 {
  def flatten(l: List[Any]): List[Any] = l flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }

  // def flatten(l: List[Any]): List[Any] = l match {
  //   case (x: List[_]) :: xs => flatten(x) ::: flatten(xs)
  //   case x :: xs            => x :: flatten(xs)
  //   case Nil                => Nil
  // }
}
