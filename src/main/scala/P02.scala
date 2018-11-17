object P02 {
  def penultimate[T](l: List[T]): T = l.init.last

  // def penultimate[T](l: List[T]): T = l.reverse.tail.head
}
