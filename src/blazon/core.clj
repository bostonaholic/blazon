(ns blazon.core)

(defn enum
  "(enum #{:foo :bar :baz})"
  [values])

(defn maybe
  "(maybe String)"
  [type])

(defn just
  "(just String)"
  [type])

(defn either
  "(either String Integer Nothing)"
  [& types])

(defmacro deftype [t & fields]
  (let [fields (apply hash-map fields)]))

(defmacro definition
  "(definition foo [Integer] String)"
  [f in-types out-type])

(deftype Nothing)
