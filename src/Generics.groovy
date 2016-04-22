/**
 * Created by yamamori.akihiro on 2016/04/21.
 */

List<String> strList = new ArrayList<>()
strList += 3
println(strList) // => [3]
println(strList[0].class.name) // => java.lang.Integer

//ジェネリクスはコンパイル時も実行時も一切確認されない
//JavaからGroovyコードを呼び出す時のみ確認される

// https://ideone.com/UBLKuq