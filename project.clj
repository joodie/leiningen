;; The only requirement of the project.clj file is that it includes a
;; defproject form. It can have other code in it as well, including
;; loading other task definitions.

(defproject leiningen
  :version "1.0-SNAPSHOT"
  :dependencies [["org.clojure" "clojure" "1.1.0-alpha-SNAPSHOT"]
                 ["org.clojure" "clojure-contrib" "1.0-SNAPSHOT"]
                 ["org.apache.maven" "maven-ant-tasks" "2.0.10"]])
