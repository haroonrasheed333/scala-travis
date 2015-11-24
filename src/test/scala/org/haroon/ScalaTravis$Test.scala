package org.haroon

import org.scalatest.FlatSpec
import org.scalatest.Matchers

/**
 * Created by haroon on 11/23/15.
 */
class ScalaTravis$Test extends FlatSpec with Matchers {
  "This test" should "pass" in {
    1 + 2 should equal(3)
  }

  it should "generate ngrams" in {
    assert(ScalaTravis.getNGrams("haroon rasheed paul".split(" "), 3) == List(List("haroon", "rasheed", "paul"), List("haroon rasheed", "rasheed paul"), List("haroon rasheed paul")))
  }

  it should "generate upto n grams" in {
    assert(ScalaTravis.getNGrams("haroon rasheed paul".split(" "), 3).length == 3)
  }
}
