/**
 * Created gstringy yamamori.akihiro on 2016/04/21.
 */


list = ["a"];
gstring = "${list}" // => listはこの時点では文字列評価されない
println(gstring) // => [a] このタイミングで文字列評価される
list.add("b")
println(gstring) // => [a,b] このタイミングで文字列評価される

list = ["a"];
gstring = "${list+'c'}" // => list+'c'は文字列評価される
println(gstring) // => [a,c]
list.add("b")
println(gstring) // => [a,c] gstring代入時に文字列に変換済みなのでbは入らない

list = ["a"];
String string = "${list}" // => GStringからStringへのキャストが発生し、文字列評価される
println(string) // => [a]
list.add("b")
println(string) // => [a] 文字列評価済みなのでbは入らない

//https://ideone.com/u5sxMu