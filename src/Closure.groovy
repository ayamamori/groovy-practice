import java.util.stream.IntStream

/**
 * Created by yamamori.akihiro on 2016/04/22.
 */

(1..10).collect (Math.&max.curry(5)).each (1.&println)
/* => 5
 * 5
 * 5
 * 5
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 */


//printlnはObject型のstaticメソッドなので、どんなオブジェクトを使っても呼べる
//1.&printlnとするとprintlnするクロージャーになる
//Javaだと、
//IntStream.rangeClosed(1,10).map(a -> Math.max(5,a)).forEach(System.out::println);
//Javaだとカリー化できない


