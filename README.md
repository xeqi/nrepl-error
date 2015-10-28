# refactor-error

An example repo for duplicating an error with nrepl-refactor


# duplication

1. add refactor-nrepl "1.1.0" to profiles
2. start a repl in cider
3. run `(p/f (nil-p))` in repl

Currently giving error:

> IllegalArgumentException No implementation of method: :f of protocol: #'refactor-error.protocol/P found for class: user$nil_p$reify__15269  clojure.core/-cache-protocol-fn (core_deftype.clj:554)

Expected:

> nil
