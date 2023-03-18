package com.itheima.chapter03

import cn.itcast.chapter03.Person
import cn.itcast.chapter03.Student

fun main(){
    val student1=Student()
    val student2=Student("Jack",19)
    val student3=Student("a123",5,"Jack",19)
    val person1=Person("朱瑞",26)
    student1.stuInfo()
    student2.stuInfo()
    student3.stuInfo()
    person1.perInfo()



}
