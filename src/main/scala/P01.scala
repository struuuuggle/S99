object P01 {
  // def last[T](l: List[T]): T = l.last

  def last[T](l: List[T]): T = l match {
    case Nil => sys.error("Nil.last")
    case x :: Nil => x
    case x :: xs => xs.last
  }
}
