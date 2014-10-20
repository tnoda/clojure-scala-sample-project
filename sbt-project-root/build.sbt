name := """hello-world"""

organization := """tnoda.scala"""

version := "0.1.2"

scalaVersion := "2.11.2"

publishTo := Some(Resolver.file("file", new File(Path.userHome.absolutePath + "/.m2/repository")))

libraryDependencies += "org.clojure" % "clojure" % "1.6.0"
