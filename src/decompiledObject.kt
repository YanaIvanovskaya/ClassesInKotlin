//// ObjectKt.java
//import OnTouchListener.DefaultImpls;
//import java.awt.Point;
//import kotlin.Metadata;
//import kotlin.jvm.internal.Intrinsics;
//import org.jetbrains.annotations.NotNull;
//
//public final class ObjectKt {
//    @NotNull
//    private static final OnTouchListener listener = (OnTouchListener)(new OnTouchListener() {
//        private final boolean isActive = true;
//
//        public boolean isActive() {
//            return this.isActive;
//        }
//
//        public void onDrag(@NotNull Point startPoint, @NotNull Point endPoint) {
//            Intrinsics.checkNotNullParameter(startPoint, "startPoint");
//            Intrinsics.checkNotNullParameter(endPoint, "endPoint");
//        }
//
//        public final void someFun() {
//        }
//
//        public void onMove(@NotNull Point startPoint, @NotNull Point endPoint) {
//            Intrinsics.checkNotNullParameter(startPoint, "startPoint");
//            Intrinsics.checkNotNullParameter(endPoint, "endPoint");
//            DefaultImpls.onMove(this, startPoint, endPoint);
//        }
//
//        public final class Unused {
//        }
//    });
//
//    @NotNull
//    public static final OnTouchListener getListener() {
//        return listener;
//    }
//
//    public static final void main() {
//    }
//
//    // $FF: synthetic method
//    public static void main(String[] var0) {
//        main();
//    }
//}
//
//public final class FileHelper {
//    @NotNull
//    public static final FileHelper INSTANCE;
//
//    public final void saveFile() {
//    }
//
//    private FileHelper() {
//    }
//
//    static {
//        FileHelper var0 = new FileHelper();
//        INSTANCE = var0;
//    }
//}
