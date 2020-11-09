(ns core)

(defn -main [& _]
  (println "契約書だよ。そこに名前を書きな。")
  (let [name (read-line)
        new-name (str (rand-nth (seq name)))]
    (println
      (str "フン。" name "というのかい。贅沢な名だねぇ。"))
    (println
      (str "今からお前の名前は" new-name "だ。いいかい、" new-name "だよ。分かったら返事をするんだ、" new-name "!!"))))
