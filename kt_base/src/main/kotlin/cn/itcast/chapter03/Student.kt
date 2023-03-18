package cn.itcast.chapter03

class Student(val sno:String,val grade:Int,name:String,age:Int):Person(name,age) {
    constructor(name: String,age: Int):this("",0,name,age){


    }
    constructor():this("",0){

    }


    fun stuInfo() {
        println("学号是:${sno},年级是:${grade},姓名是:${name}，年龄是${age}")
    }
}