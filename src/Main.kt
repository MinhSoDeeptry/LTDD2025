fun welcome() {
    var str = "Welcome to my app"
    println("$str")
}

fun userInfor() {
    print("Enter name: ")
    var name = readLine()!!.toString()
    print("Enter age: ")
    var age = readLine()!!.toInt()
    print("Enter GPA: ")
    var gpa = readLine()!!.toDouble()

    println("====== User Infor ======")
    println("Name: $name")
    println("Age: $age")
    println("Gpa: $gpa")
}

fun departmentDetail() {
    var department:String?
    department = null
    department = "Software Engineering"
    println("Department Detail: $department");
}

fun main() {
    welcome()
    userInfor()
    departmentDetail()
}