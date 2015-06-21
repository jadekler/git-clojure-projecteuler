; A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
;
; Find the largest palindrome made from the product of two 3-digit numbers.

(prn "Problem 4")

(defn explode-to-digits [number]
  (seq (str number)))

(defn is-palindrone-recurse [array-of-chars start end]
  (if (= (nth array-of-chars start) (nth array-of-chars end))
    (if (= (+ start 1) end)
      true
      (is-palindrone-recurse array-of-chars (+ start 1) (- end 1)))
    false)
  )

(defn is-palindrone [seq-of-chars]
  (if (even? (count seq-of-chars))
    (is-palindrone-recurse seq-of-chars 0 (- (count seq-of-chars) 1))
    false)
  )

;(->>
;  (explode-to-digits 9009)
;  (prn))

(prn (is-palindrone (explode-to-digits 9019)))