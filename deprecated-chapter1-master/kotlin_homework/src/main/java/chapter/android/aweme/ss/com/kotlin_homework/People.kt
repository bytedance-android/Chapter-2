package chapter.android.aweme.ss.com.kotlin_homework

class People(var name: String, var age: Int) {

    private var id = 0

    constructor(id: Int) : this("张三", 18) {
        this.id = id
    }

    fun printName() {
        println("name=$name,age=$age")
    }
}