(ns refactor-error.protocol)

(prn "loading refactor-error.protocol")
(Thread/dumpStack)

(defprotocol P
  (f [t]))
