(defproject camdez/ring-honeybadger "0.1.0-SNAPSHOT"
  :description "Ring middleware for reporting errors to honeybadger.io"
  :url "https://github.com/camdez/ring-honeybadger"
  :license {:name "MIT"
            :url "http://www.opensource.org/licenses/mit-license.php"}
  :dependencies [[camdez/honeybadger "0.1.0"]
                 [org.clojure/clojure "1.7.0"]
                 [ring/ring-core "1.4.0"]])