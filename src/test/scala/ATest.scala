import org.scalatest.BeforeAndAfterEach
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ATest extends AnyWordSpec with Matchers with ScalaFutures with BeforeAndAfterEach {

  "ATest" should {
    "create idName string" in {
      val a = A(1, "one")
      A.getIdName(a) shouldEqual "1_one"
    }
  }

}
