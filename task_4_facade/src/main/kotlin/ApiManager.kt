class ApiManager {
    fun setData(user: User){
        println("Set user login: ")
        user.login = readln()
        println("Set user country: ")
        user.country = readln()
        println("Set user age: ")
        user.age = readln().toInt()
    }
}