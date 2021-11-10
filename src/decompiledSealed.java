//// ApiError.java
//
//import kotlin.jvm.internal.DefaultConstructorMarker;
//
//public abstract class ApiError {
//    private ApiError() { }
//
//    // $FF: synthetic method
//    public ApiError(DefaultConstructorMarker $constructor_marker) {
//        this();
//    }
//
//    public static final class Unknown extends ApiError { }
//
//    public static final class NoInternet extends ApiError { }
//}
//
//public class CustomError extends ApiError {
//
//    public CustomError() {
//        super((DefaultConstructorMarker) null);
//    }
//}
