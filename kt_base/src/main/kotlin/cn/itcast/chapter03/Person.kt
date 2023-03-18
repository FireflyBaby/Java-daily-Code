package cn.itcast.chapter03
open class Person(name:String,age:Int) {
    var name=name
    var age=age
    fun perInfo(){
        println("姓名是:${name},年龄是:${age}")
    }


}