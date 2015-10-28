(ns user
  (:require [refactor-error.protocol :as p]))

(prn "loading user")
(Thread/dumpStack)

(defn nil-p []
  (reify p/P
    (f [t] nil)))
