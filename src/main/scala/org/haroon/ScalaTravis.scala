package org.haroon

/**
 * Created by haroon on 11/23/15.
 */
object ScalaTravis {
  def getNGrams(w: Array[String], n: Int): List[List[String]] = {
    val ngrams = (for(i <- 1 to n) yield w.sliding(i).map(p => p.mkString(" ")).toList).toList
    ngrams
  }
}
