case class A(id: Int, name: String)

object A {
  def getIdName(a: A): String = {
    a.id.toString + "_" + a.name
  }
}
