(ns blazon.core)

(defn enum [values])

(defn maybe [type])

(defn just [type])

(defn either [& types]) ;; (either String Integer Nothing)

(defmacro deftype [t & fields]
  (let [fields (apply hash-map fields)]))

(defmacro definition [f in-types out-type])

(deftype Nothing)
