package co.helmethair.scalatest.example

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.BeforeAndAfterAll

class SomeCodeTest extends AnyFunSpec with Matchers with BeforeAndAfterAll {
  override def beforeAll(): Unit = {
    super.beforeAll()
    throw new RuntimeException("Test exception for junit-runner")
  }

  describe("someFunc in SomeCode") {
    it("returns '0' for 0 input") {
      SomeCode.someFunc(0) shouldBe "0"
    }

    it("calculates square") {
      SomeCode.someFunc(3) shouldBe "9"
    }
  }
}
