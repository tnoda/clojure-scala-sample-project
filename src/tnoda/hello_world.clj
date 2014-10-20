(ns tnoda.hello-world
  (:import (tnoda.scala HelloWorld)))

(defn -main
  [& args]
  (HelloWorld/helloWorld))
