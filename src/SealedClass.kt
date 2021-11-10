

interface Some {
    fun fun0(): Unit
}

open class SomeClass() {
    open fun fun1() {

    }
}

sealed class ApiError {
    object Unknown : ApiError()
    object NoInternet : ApiError()
}

open class CustomError(val ex: Exception) : ApiError() {
    fun getErrorMessage() = ex.message
}

class IllegalApiError(ex: Exception) : CustomError(ex) {
    fun getIllegalErrorMessage() = ex.message
}

sealed class RequestResult {

    class Success(val data: String)

    class Error(private val error: ApiError) {

        fun getErrorMessage() = when (error) {
            ApiError.Unknown -> "Неизвестная ошибка"
            ApiError.NoInternet -> "Нет доступа в интернет"
            is CustomError -> "Произошла ошибка :${error.ex.message}"
        }

    }

}

