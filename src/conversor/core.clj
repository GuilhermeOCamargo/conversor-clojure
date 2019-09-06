(ns conversor.core
  (:require [conversor.formatador :refer [format-response]]
            [conversor.options :refer [get-args]]
            [conversor.cotation :refer [get-cotation]])
  (:gen-class))
;Usando iteroperabilidade com java
;(defn- values-in [arg]
;  (cond (.startsWith arg "--de=")
;          {:de (.substring arg 5)}
;        (.startsWith arg "--para=")
;          {:para (.substring arg 7)}
;        :else {}))

(defn -main
  [& args]
  (let [{:keys [de para]} (get-args args)]
    (-> (get-cotation de para) (format-response de para) (prn))))
