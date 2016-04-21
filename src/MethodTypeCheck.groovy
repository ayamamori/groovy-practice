/**
 * Created by yamamori.akihiro on 2016/04/21.
 */


int i = 1;

hoge = noArgTypeMethod(i)
piyo = argTypeMethod(i) //実行時エラー コンパイル可 IntellijのInspectionに引っかかっている
/*
Caught: groovy.lang.MissingMethodException: No signature of method: MethodTypeCheck.argTypeMethod() is applicable for argument types: (java.lang.Integer) values: [1]
Possible solutions: argTypeMethod(java.lang.String), noArgTypeMethod(java.lang.Object)
groovy.lang.MissingMethodException: No signature of method: MethodTypeCheck.argTypeMethod() is applicable for argument types: (java.lang.Integer) values: [1]
Possible solutions: argTypeMethod(java.lang.String), noArgTypeMethod(java.lang.Object)
	at MethodTypeCheck.run(MethodTypeCheck.groovy:9)
 */

def noArgTypeMethod(arg){
}
def argTypeMethod(String arg){

}
