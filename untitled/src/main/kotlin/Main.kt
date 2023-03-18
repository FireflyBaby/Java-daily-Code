import cn.itcast.chapter03.stuInfo

fun main(args: Array<String>) {
    stuInfo("朱瑞", 26)
    sum(32,56,87,98)
}
fun sum(vararg score:Int){
    var result=0
    score.forEach {
        result+=it
    }
    println("成绩为${result}")
}