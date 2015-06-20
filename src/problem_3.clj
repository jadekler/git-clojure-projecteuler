; The prime factors of 13195 are 5, 7, 13 and 29.
;
; What is the largest prime factor of the number 600851475143?

(prn "Problem 3 - work in progress")

(defn divide-until-not-divisible [divisor target]
  (prn "DIVIDE-UNTIL-NOT-DIVISIBLE" divisor target)
  (if (= (mod target divisor) 0)
    (divide-until-not-divisible divisor (/ target 2))
    target))

(defn divide-until-not-divisible-second [divisor target]
  (prn "DIVIDE-UNTIL-NOT-DIVISIBLE-TWO" divisor target)
  (if (< divisor (Math/sqrt target))
    (if (= (mod target divisor) 0)
      (divide-until-not-divisible-second divisor (/ target divisor))
      (divide-until-not-divisible-second (+ divisor 2) target))
    target))

(->>
  (divide-until-not-divisible 2 600851475143)
  (divide-until-not-divisible-second 3)
  (prn "THE LARGEST PRIME FACTOR IS "))
