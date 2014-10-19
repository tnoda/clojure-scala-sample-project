package tnoda.scala

import clojure.lang.AFn

class HelloWorld extends AFn {
  override def invoke = {
    println("Hello Scala")
    null
  }
}
