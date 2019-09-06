(ns conversor.formatador)
(defn format-response [cotation de para]
  (str "1 " de " equals " cotation " in " para))