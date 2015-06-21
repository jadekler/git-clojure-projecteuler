; The prime factors of 13195 are 5, 7, 13 and 29.
;
; What is the largest prime factor of the number 600851475143?

(prn "Problem 3")

; Assumes target and divisor are (both) not even
(defn divide-until-not-divisible [divisor target]
  (prn "DIVIDE-UNTIL-NOT-DIVISIBLE-TWO" divisor target)
  (if (< divisor (Math/sqrt target))
    (if (= (mod target divisor) 0)
      (divide-until-not-divisible divisor (/ target divisor))
      (divide-until-not-divisible (+ divisor 2) target))
    target))

(->>
  (divide-until-not-divisible 3 600851475143)
  (prn "THE LARGEST PRIME FACTOR IS "))
