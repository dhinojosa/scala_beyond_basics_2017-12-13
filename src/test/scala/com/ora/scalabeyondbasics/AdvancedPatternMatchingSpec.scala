package com.ora.scalabeyondbasics

import org.scalatest.{FunSpec, Matchers}

import scala.annotation.tailrec
import scala.util.matching.Regex

class AdvancedPatternMatchingSpec extends FunSpec with Matchers {

  describe("Simple Pattern Matches") {
    it("can be as simple as an assignment") {
      pending
    }

    it("can also be more meaningful as something like a tuple") {
      pending
    }

    it( """has the ability to have a value name and an @
          |  to not only capture the individual items but the whole item""".stripMargin) {
      pending
    }

    it("can be used with an Optional, and often is used as such, let's do a Some") {
      pending
    }

    it( """can use an _ to signify that you are not interested in a particular element,
          |  let's try a tuple first.""".stripMargin) {
      pending
    }

    it( """can use an _ to signify that you are not interested in a particular element,
          |  and in an Option[T] although there is no way to extract a value but if you
          |  want to ensure a shape, it would make sense""".stripMargin) {
      pending
    }

    it( """can use an _ even in an assignment, although, only if you wish match a particular
          |  shape""".stripMargin) {
      pending
    }


    it( """We can also match Lists by assignment, start off simple,
          |  this is a match on an empty list""".stripMargin) {
      pending
    }

    it( """can also match using a variant form since Nil represents an empty list""") {
      pending
    }

    it( """can also match on an empty list, let's try the list form""") {
      pending
    }

    it( """can also match a single item using the :: form""") {
      pending
    }

    it( """can also match a single item using the List() form""") {
      pending
    }

    it(
      """can do a list where you care about an *exact* number of items,
        |  let's try two using :: form""".stripMargin) {
      pending
    }

    it( """can do a list where you care about an *exact* number of items,
          |  now with List() form""".stripMargin) {
      pending
    }

    it( """can do a list where you care about an *exact* number of items,
          |  let's try three using :: form""".stripMargin) {
      pending
    }

    it( """can do a list where you care about an *exact* number of items,
          |  let's try three using the List() form""".stripMargin) {
      pending
    }

    it( """can do a list where you want to capture any number of items and
          |  keep the remainder in an extra list using the :: form""".stripMargin) {
      pending
    }

    it( """can do a list where you want to capture any number of items and
          |  keep the remainder in an extra list using the List() form""".stripMargin) {
      pending
    }

    it( """can do a list where you want to capture any number of items and
          |  ignore the remainder in an extra list using the List() form""".stripMargin) {
      pending
    }

    it( """can also capture a list with @ to capture the entire list while
          |  at the same time capturing elements of a list and the remainder
          |  here using the :: form""".stripMargin) {
      pending
    }

    it( """can also capture a list with @ to capture the entire list while
          |  at the same time capturing elements of a list and ignoring remainder
          |  here using the :: form""".stripMargin) {
      pending
    }

    it( """can also capture a list with @ to capture the entire list while
          |  at the same time capturing elements of a list and the remainder
          |  here using the List() form""".stripMargin) {
      pending
    }


    it( """will always throw a Match Error if something doesn't match, for example here
          |  is an attempted match with a tuple""".stripMargin) {
      pending
    }


    it( """is rarely used in assignments, it is used inside a match,
          |  which takes the following form, let's start with a Tuple 3
          |  and attempt to match""".stripMargin) {
      pending
    }

    it( """will throw a MatchError if the pattern match is not well covered,
          |  this time let's try it with a List and put the pattern match
          |  inside of a method.""".stripMargin) {
      pending
    }

    it( """will create a replicate in a tail recursive manner""".stripMargin) {
      pending
    }

    it( """should show an empty list because we haven't covered that yet.""") {
      pending
    }

    it( """can also use an alternative pipe to match""") {
      pending
    }

    it( """should have a None in a pattern match, though we have not covered it.  This is just one way
          |  to get the information from an Option[T]""".stripMargin) {
      pending
    }


    it( """should be careful with only Some vs. Option""") {
      pending
    }

    it( """should also match just simple types like Int, String, etc.""") {
      pending
    }

    it( """of course order is always important in pattern matching, particularly with types""") {
      pending
    }

    it( """also works with a scala.collection.immutable.Stream""") {
      pending
    }

    it( """should also have guards just in case""") {
      pending
    }
  }

  describe("A Pattern Match with the following custom class") {
    it( """can do compound matching where one item is in another, using the :: form""") {
      pending
    }

    it( """can do compound matching where one item is in another, using the List() form""") {
      pending
    }

    it(
      """can do compound matching layers deep, like an Employee,
        |  in a Some, in List, using the :: form""".stripMargin) {
      pending
    }

    it(
      """can do compound matching layers deep, like an Employee,
        |  in a Some, in List, using the List() form""".stripMargin) {
      pending
    }

    it( """can be as simple as assignments with a custom case class and
          |  it must be a case class or class with an extractor""".stripMargin) {
      pending
    }

    it( """can match the whole custom case class when provided with @
          |  along with the pattern match itself""".stripMargin) {
      pending
    }

  }

  describe("A Regular Pattern Expression Match") {
    it( """uses .r after a String to Convert it to a Regex Type, from there groups can
          |  can be determined""".stripMargin) {
      pending
    }
  }

  // Pig Latin Exercise

  describe("Partial Functions") {
    it( """is like a function, but with an added method called isDefined.  isDefined() returns
          | true or false, it also has an `apply` method to invoke the function iff isDefined returns true.
          | Partial Functions together should form a complete function.""".stripMargin) {
      pending
    }

    it( """can also be trimmed down inline with case statements compare the above with the following below""") {
      pending
    }
  }

  describe("Custom pattern matching") {

    it( """uses unapply to extract elements for a pattern match so you can do your own pattern matching,
          |  the unapply method should return an Option and either a tuple or list of the parts""".stripMargin) {
       pending
    }

    it( """while building a pattern match off of another unapply""".stripMargin) {
       pending
    }

    it( """can also be used in composing partial functions to form a complete function""") {
       pending
    }
  }

  describe("Custom pattern matching with an instance") {
    it("""can also extract from an instance just in case it is the instance that contains logic
         |  to extract information, this is the technique used to for regex grouping""".stripMargin) {
      pending
    }
  }

  describe("Custom pattern matching with unapplySeq") {
    it("would require an unapplySeq for extracting collections") {
      pending
    }
  }

  describe("Companion Object Extractors") {
    it( """Companion objects will generally have the unapply or unapplySeq for classes, this also means
          |  that case classes create unapply automatically, but you can create or override your own
          |  particular rules""".stripMargin) {
      pending
    }
  }
  //Review things list Option, List, and look at their unapply, and unapplySeq
}