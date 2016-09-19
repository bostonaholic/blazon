(ns blazon.core)

(defn enum [values]) ; (enum #{:foo :bar :baz})

(defn maybe [type]) ; (maybe String)

(defn just [type]) ; (just String)

(defn either [& types]) ; (either String Integer Nothing)

(defmacro deftype [t & fields]
  (let [fields (apply hash-map fields)]))

(defmacro definition [f in-types out-type])

(deftype Nothing)
