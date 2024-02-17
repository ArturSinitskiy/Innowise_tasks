import javax.security.auth.login.FailedLoginException

class User {
    var login: String = "unnamed_user"
    var country: String = "-"
    var age: Int = 0

    fun getData() = "Login: $login\n" +
            "Country: $country\n" +
            "Age: $age\n"
}