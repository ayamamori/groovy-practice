/**
 * Created by yamamori.akihiro on 2016/04/18.
 */


int a = 1
String b = a
int c = b
println(b) // =>1
println(b.class.name) // => java.lang.String
println(c) // => 49
println(c.class.name) // => java.lang.Integer

try {
    d = "11"
    int e = d // => GroovyCastException: Cannot cast object '11' with class 'java.lang.String' to class 'int'
    println(d)
    println(e)
}catch(e){println e}


//一桁の数字を表す文字列はintにキャストするとASCII文字コードになる
//Javaのcharのintキャストと同じ挙動

//https://ideone.com/ECo5f5