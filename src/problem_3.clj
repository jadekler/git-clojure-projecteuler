; The prime factors of 13195 are 5, 7, 13 and 29.
;
; What is the largest prime factor of the number 600851475143 ?

;(prn 13195)

(loop [divisor 2 target 30]
  (when (< divisor target)
    (loop []
      (when (mod target divisor) 0
        (prn divisor)
        (recur divisor (/ target divisor))))
    (recur (+ divisor 2) target)))