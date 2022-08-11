object Main {
  def main(args:Array[String]): Unit = {
    val a = List(A(1, "one"), A(2, "two"), A(3, "three"))
    val result = a.map(A.getIdName(_))
    println("This is the result: " + result)
    println("This is the result: " + result)
  }

}
