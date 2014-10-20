(defproject clojure-scala-sample-project "0.1.0-SNAPSHOT"
  :description "A sample Leiningen project that utilizes functions written in Scala"
  :url "https://github.com/tnoda/clojure-scala-sample-project"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.scala-lang/scala-library "2.11.2"]
                 [tnoda.scala/hello-world_2.11 "0.1.1"]]
  :main tnoda.hello-world)

