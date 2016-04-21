/**
 * Created gstringy yamamori.akihiro on 2016/04/21.
 */


list = ["a"];
gstring = "${list}" // => listは文字列変換されない
println(gstring) // => [a] このタイミングで文字列評価される
list.add("b")
println(gstring) // => [a,b] このタイミングで文字列評価される

list = ["a"];
gstring = "${list+'c'}" // => list+'c'は文字列変換される
println(gstring) // => [a,c]
list.add("b")
println(gstring) // => [a,c] gstring代入時に文字列変換済みなのでbにならない

