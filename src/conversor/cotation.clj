(ns conversor.cotation
  (:require [clj-http.client :as http-client]
            [cheshire.core :refer [parse-string]]))

(def api-key (System/getenv "FREE_CURRENCY_API_KEY"))
(def api-url "https://free.currencyconverterapi.com/api/v6/convert")

(defn create-param [de para]
  (str de "_" para))

(defn get-cotation [de para]
  (let [moedas (create-param de para)]
    (-> (:body (http-client/get api-url {:query-params {"q" (create-param de para) "apiKey" api-key}}))
        (parse-string) (get-in ["results" moedas "val"]))))