package com.ora.patternmatching

import org.scalatest.{FlatSpec, Matchers}

class PatternMatchingSpec extends FlatSpec with Matchers {

  "A pattern match" should "match a single item" in {
    pending
  }

  it should "match purely by assignment" in {
    val (a, b) = (3, 5)
    a should be(3)
    b should be(5)
  }

  it should "pattern match on any case class by assignment" in {
    case class Employee(firstName: String, lastName: String)

    val Employee(fn, ln) = Employee("Louis", "Armstrong")

    fn should be("Louis")
    ln should be("Armstrong")
  }

  it should "pattern match on any case class, using the case statement" in {
    case class Employee(firstName: String, lastName: String)

    type Greeting = String

    def welcomeKnownNames(s: String): Greeting = {
      s match {
        case "Louis" => "Hello Louis"
        case "Dolly" => "Hello Dolly"
      }
    }

    welcomeKnownNames("Louis") should be("Hello Louis")
  }

  it should "also match by type" in {
    def welcomeAnyTypes(x: Any) = {
      x match {
        case _: Int => "Cool an Int!"
        case _: String => "Ok, I like Strings"
        case _: Double => "What's your problem?"
      }
    }

    welcomeAnyTypes(3) should be ("Cool an Int!")
    welcomeAnyTypes("Excellent") should be ("Ok, I like Strings")
    welcomeAnyTypes(40.0) should be ("What's your problem?")
  }

  it should "also match by Option" in {
    val middleName = Some("Edgar"):Option[String]

    val result = middleName match {
      case Some(x) => s"There you are! $x"
      case None => "Don't know you"
    }

    result should be ("There you are! Edgar")
  }

  it should "also be careful with what you are matching in Option, is it Option or Some?" in {
    val middleName = Some("Edgar")

    val result = middleName match {
      case Some(x) => s"There you are! $x"
      //case None => "Don't know you" Compiler Error
    }

    result should be ("There you are! Edgar")
  }

  it should "throw a scala.MatchError if the pattern match is not exhaustive enough" in {
    pending
  }

  it should "support a wildcard using _ which is similar to default in Java" in {
    pending
  }

  it should "pattern match on a tuple, since tuples also have an internal pattern matching recipe" in {
    pending
  }

  it should "simply match by assignment" in {
    pending
  }

  it should "pattern match on a regular expression" in {
    pending
  }

  it should "pattern match on a list" in {
    pending
  }
}
