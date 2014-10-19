(ns tnoda.hello-world
  (:import (tnoda.scala HelloWorld)))

(def hello-world (HelloWorld/helloWorld))

(defn -main
  [& args]
  (hello-world))
