object P04 {
  // def length[T](l: List[T]): Int = l.length

  def length[T](l: List[T]): Int = l match {
    case Nil => 0
    case x :: xs => 1 + xs.length
  }
}
