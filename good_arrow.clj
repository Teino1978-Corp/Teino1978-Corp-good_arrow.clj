; Had this

(let [g (nf.graph6/graph6-to-set (:graph6 rec)),
      unfairness (nf.graphs/unfairness g)]
  ...)

; and replaced with this        

(let [unfairness (-> rec 
                     :graph6 
                     nf.graph6/graph6-to-set 
                     nf.graphs/unfairness)]
  ...)