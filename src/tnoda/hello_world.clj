(ns tnoda.hello-world
  (:import (tnoda.scala HelloWorld)))

(def hello-world (HelloWorld.))

(defn -main
  [& args]
  (hello-world))
