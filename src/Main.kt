fun welcome() {
    val str = "Welcome to my app"
    println(str)
}

fun userInfor(userArr: MutableList<List<Any>>) {
    print("Enter name: ")
    val name = readLine()!!.trim()
    print("Enter age: ")
    val age = readLine()!!.toInt()
    print("Enter GPA: ")
    val gpa = readLine()!!.toDouble();
    userArr.add(listOf(name, age, gpa))
}

fun displayElement(name: String, age: Int, gpa: Double) {
    println("Name: $name")
    println("Age: $age")
    println("GPA: $gpa")
    println("-----------------------------------")
}

fun displayElement2(department: String, leader: String) {
    println("Department: $department")
    println("leader: $leader")
    println("-----------------------------------")
}

fun displayUsers(userArr: MutableList<List<Any>>) {
    userArr.forEach { user -> displayElement(user[0].toString(), user[1] as Int, user[2] as Double) }
}

fun displayDepartment(departmentArr: MutableList<List<Any>>) {
    departmentArr.forEach { department -> displayElement2(department[0].toString(), department[1].toString())}
}

fun selectDepartment(departmentArr: MutableList<List<Any>>) {
    print("Enter index of department: ")
    val selectedDepartment = readln().toInt()
//    val foundDepartment = departmentArr.find { it[0] == selectedDepartment }
    if (selectedDepartment != null) {
        var foundDepartment = departme
        ntArr[selectedDepartment]
        println("\nSelected Department:")
        println("Department: ${foundDepartment[0]}")
        println("Manager: ${foundDepartment[1]}")
    } else {
        println("\nDepartment not found. Please check the name and try again.")
    }
}

fun main() {
    val userArr: MutableList<List<Any>> = mutableListOf()
    var running = true
    val departmentArr: MutableList<List<Any>> = mutableListOf(
        listOf("Software Engineer", "Nguyen Van A"),
        listOf("Data Scientist", "Tran Thi B"),
        listOf("DevOps Engineer", "Le Van C")
    )
    welcome()
    while (running) {
        println("Choose an option:")
        println("1. Add User")
        println("2. Display Users")
        println("3. Display Departments")
        println("4. Select Department")
        println("5. Exit")

        print("Enter your choice: ")
        val choice = readLine()!!.toIntOrNull() ?: 0

        when (choice) {
            1 -> {
                print("Enter number of students: ")
                val n = readln().toInt()

                for (i in 1..n) {
                    println("Entering information for user $i:")
                    userInfor(userArr)
                }
            }

            2 -> displayUsers(userArr)
            3 -> displayDepartment(departmentArr)
            4 -> selectDepartment(departmentArr)
            5 -> {
                println("Exiting...")
                running = false
                return
            }

            else -> println("Invalid choice. Please try again.")
        }
    }


//    print("Enter number of users: ")
//
//
//    println("\nDisplaying all users:")
//    displayUsers(userArr)
}
