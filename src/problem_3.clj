; The prime factors of 13195 are 5, 7, 13 and 29.
;
; What is the largest prime factor of the number 600851475143 ?

(prn "Problem 3 - work in progress")

(loop [divisor 2 target 30]
  (when (< divisor target)
    ;    (loop []
    ;      (when (mod target divisor) 0
    ;        (prn divisor)
    ;        (recur divisor (/ target divisor))))

    ;    (when (mod target divisor) 0
    ;      (recur divisor (/ target divisor))
    ;      )

    (let [new_target (if (mod target divisor) 0) (quot target divisor) target]
      (prn divisor new_target)
      (recur (+ divisor 2) new_target))
    ))

;    (prn divisor target)
;    (recur (+ divisor 2) target)
;    ))

;(let [a (if (> 5 4) "yes" "no")]
;  (prn a))