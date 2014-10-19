package tnoda.scala

import clojure.lang.AFn

object HelloWorld {
  def helloWorld = new HelloWorld
}

class HelloWorld extends AFn {
  override def invoke = {
    println("Hello Scala")
    null
  }
}
