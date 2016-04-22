/**
 * Created by yamamori.akihiro on 2016/04/18.
 */


try {
    a = "1"
    int b = a
    println(a) // => 1
    println(b) // => 49

    c = "11"
    int d = c // => GroovyCastException: Cannot cast object '11' with class 'java.lang.String' to class 'int'
    println(c)
    println(d)
}catch(e){println e}
