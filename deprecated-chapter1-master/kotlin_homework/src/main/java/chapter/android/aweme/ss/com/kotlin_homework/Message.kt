package chapter.android.aweme.ss.com.kotlin_homework


//var 提供 get set方法  如果数据类需要无参构造函数,则所有属性必须有默认值:
data class Message(var isOfficial: Boolean? = false,
                   var title: String? = null,
                   var time: String? = null,
                   var description: String? = null,
                   var icon: String? = null)