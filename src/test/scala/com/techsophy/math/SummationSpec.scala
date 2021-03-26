

package com.techsophy.math

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec


//class SummationSpec extends AnyFunSuite {
//
//  test("validate sum of two numbers") {
//    val result = Summation.sum(2, 2)
//    val expectedResult = 4
//    assert(result === expectedResult)
//
//  }
//
//
//}
//class SummationSpec extends AnyFunSuite {
//  test("testing sum dummy function"){
//    val res = (new Summation).sum(2,3)
//    val expected = 5
//    assert(res === expected);
//  }
//  test("testing with negative number"){
//    val res = (new Summation).sum(-1,-2);
//    val exp = -35
//    assert(res === exp)
//  }
//}


//class SummationSpec extends AnyWordSpec with Matchers {
//
//  "Arithmetic" should {
//
//    "sum the two numbers" in {
//      val s = new Summation()
//      val result = s.sum(2, 2)
//      result shouldBe 4
//    }
//
//    "sum the two numbers where one number is negative" in {
//      val s = new Summation()
//      val result = (new Summation).sum(2, -2)
//      result shouldBe 1
//    }
//  }
//
//}

class SummationSpec extends AnyWordSpec with Matchers {
  "Summation" should {
    "Summation of two postive number" in {
      val res = (new Summation).sum(2,3)
      res shouldBe(5);
    }
    "Summation with one pos and one neg" in {
      val res = (new Summation).sum(4, -2)
      res shouldBe(2)
    }

  }
}