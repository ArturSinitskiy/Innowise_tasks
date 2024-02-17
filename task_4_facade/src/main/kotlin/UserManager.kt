class UserManager(private val user: User) {
    private val cacheManager = CacheManager()
    private val apiManager = ApiManager()

    fun getData(): String {
        if (!cacheManager.hasUserData) {
            println("CACHE IS EMPTY, enter new data:")
            apiManager.setData(user)
            println("DATA CACHING...")
            cacheManager.apply {
                userData = user.getData()
                hasUserData = true
            }
        }
        return "DATA FROM CACHE:\n${cacheManager.userData}"
    }
}