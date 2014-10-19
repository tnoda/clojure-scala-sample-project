name := """hello-world"""

version := "0.1"

scalaVersion := "2.11.2"

lazy val publishLeiningen = taskKey[Unit]("Publishes Scala class files to Leiningen")

publishLeiningen := {
  import sys.process._
  "cp -rp target/scala-2.11/classes/tnoda ../target/classes".!
}
