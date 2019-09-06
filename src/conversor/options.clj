(ns conversor.options
  (:require [clojure.tools.cli :refer [parse-opts]]))

(def program-options [["-d" "--de moeda base" "moeda base para conversão" :default "eur"]
                      ["-p" "--para moeda destino" "moeda a qual queremos saber o valor"]])

(defn get-args [args]
  (:options (parse-opts args program-options)))
