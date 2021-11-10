//// ButtonClass.java
//import java.awt.Point;
//import kotlin.Metadata;
//import kotlin.jvm.internal.Intrinsics;
//import org.jetbrains.annotations.NotNull;
//
//public final class ButtonClass implements OnTouchListener {
//    private final boolean isActive;
//
//    public boolean isActive() {
//        return this.isActive;
//    }
//
//    public void onDrag(@NotNull Point startPoint, @NotNull Point endPoint) {
//        Intrinsics.checkNotNullParameter(startPoint, "startPoint");
//        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
//    }
//
//    public void onMove(@NotNull Point startPoint, @NotNull Point endPoint) {
//        Intrinsics.checkNotNullParameter(startPoint, "startPoint");
//        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
//        OnTouchListener.DefaultImpls.onMove(this, startPoint, endPoint);
//    }
//}
//
//public interface OnTouchListener {
//    @NotNull
//    OnTouchListener.Companion Companion = OnTouchListener.Companion.$$INSTANCE;
//
//    boolean isActive();
//
//    void onDrag(@NotNull Point var1, @NotNull Point var2);
//
//    void onMove(@NotNull Point var1, @NotNull Point var2);
//
//
//    public static final class UnusedClassHere {
//        public final class InnerUnusedClass {
//        }
//    }
//
//    public static final class DefaultImpls {
//        private static boolean isTouchable(OnTouchListener $this) {
//            return true;
//        }
//
//        public static void onMove(@NotNull OnTouchListener $this, @NotNull Point startPoint, @NotNull Point endPoint) {
//            Intrinsics.checkNotNullParameter(startPoint, "startPoint");
//            Intrinsics.checkNotNullParameter(endPoint, "endPoint");
//            innerFunc($this);
//            String var3 = "move " + (int)startPoint.getX() + " to " + (int)endPoint.getX() + " and " + "move " + (int)startPoint.getY() + " to " + (int)endPoint.getY();
//            boolean var4 = false;
//            System.out.print(var3);
//        }
//
//        private static void innerFunc(OnTouchListener $this) {
//        }
//    }
//
//    public static final class Companion {
//        private static final float ZERO = 0.0F;
//        // $FF: synthetic field
//        static final OnTouchListener.Companion $$INSTANCE;
//
//        private Companion() {
//        }
//
//        static {
//            OnTouchListener.Companion var0 = new OnTouchListener.Companion();
//            $$INSTANCE = var0;
//        }
//    }
//}
