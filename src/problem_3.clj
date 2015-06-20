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
      (divide-until-not-divisible-second divisor (/ target 2))
      (divide-until-not-divisible-second (+ divisor 2) target))
    divisor))

(->>
  (divide-until-not-divisible 2 13195)
  (divide-until-not-divisible-second 3)
  (prn "THE LARGEST PRIME FACTOR IS "))

; take large number, divide by 2 until it becomes a odd number
; divide by 3, 3+2, 3+2+2, etc

; NOTE: This block works - it divides by divisor and increases by divisor. Before this can happen, though,
;       we need to divide the target by 2 until it no longer divides by 2
; NOTE: We should only loop until sqrt(target)
; see http://www.geeksforgeeks.org/print-all-prime-factors-of-a-given-number/
;(loop [divisor 2 target 100]
;  (when (< divisor target)
;    ;    (loop []
;    ;      (when (mod target divisor) 0
;    ;        (prn divisor)
;    ;        (recur divisor (/ target divisor))))
;
;    ;    (when (mod target divisor) 0
;    ;      (recur divisor (/ target divisor))
;    ;      )
;
;    (let [new_target (if (= (mod target divisor) 0) (quot target divisor) target)]
;      (prn divisor new_target)
;      (recur (+ divisor 2) new_target))
;    ))

;    (prn divisor target)
;    (recur (+ divisor 2) target)
;    ))

;(let [a (if (> 5 4) "yes" "no")]
;  (prn a))