(ns blazon.core-test
  (:require [clojure.test :refer :all]
            [blazon.core :refer :all])
  (:refer-clojure :exclude [deftype]))

(deftype State ;; (enum STATES)
    :long (enum STATES_LONG)
    :short (enum STATES_SHORT))

(deftype Address
    :street-1 String
    :street-2 (maybe String)
    :city String
    :state State
    :zip String)

(definition new-address [PesistentArrayMap] :-> Address)
(defn new-address [a] (map->Address a))

(deftype PhoneNumber
    :number String
    :county-code String)

(definition new-phone-number [PesistentArrayMap] :-> PhoneNumber)
(defn new-phone-number [p] (map->PhoneNumber p))

(deftype User
    :firstname String
    :lastname String
    :address Address
    :phone-number PhoneNumber)

(definition new-user [PersistentArrayMap] :-> User)
(defn new-user [u] (map->User u))

(deftest a-test
  (testing "deftype"
    (let [u (new-user {:firstname "Matthew" :lastname "Boston"
                       :address (map->Address {:street-1 "123 Fake St." :city "Conifer" :state "CO" :zip "80433"})
                       :phone-number (map->PhoneNumber {:number "123-456-7890" :country-code "1"})})])
    (is (= 0 1))))
