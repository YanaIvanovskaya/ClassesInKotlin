//import kotlin.jvm.JvmInline;
//import kotlin.jvm.internal.Intrinsics;
//
//@JvmInline
//public final class Password {
//    @NotNull
//    private final String value;
//
//    @NotNull
//    public final String getValue() {
//        return this.value;
//    }
//
//    // $FF: synthetic method
//    private Password(String value) {
//        Intrinsics.checkNotNullParameter(value, "value");
//        super();
//        this.value = value;
//    }
//
//    public static final void decrypt_impl/* $FF was: decrypt-impl*/(String $this) {
//    }
//
//    @NotNull
//    public static String constructor_impl/* $FF was: constructor-impl*/(@NotNull String value) {
//        Intrinsics.checkNotNullParameter(value, "value");
//        return value;
//    }
//
//    // $FF: synthetic method
//    public static final Password box_impl/* $FF was: box-impl*/(String v) {
//        Intrinsics.checkNotNullParameter(v, "v");
//        return new Password(v);
//    }
//
//    public static String toString_impl/* $FF was: toString-impl*/(String var0) {
//        return "Password(value=" + var0 + ")";
//    }
//
//    public static int hashCode_impl/* $FF was: hashCode-impl*/(String var0) {
//        return var0 != null ? var0.hashCode() : 0;
//    }
//
//    public static boolean equals_impl/* $FF was: equals-impl*/(String var0, Object var1) {
//        if (var1 instanceof Password) {
//            String var2 = ((Password)var1).unbox-impl();
//            if (Intrinsics.areEqual(var0, var2)) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    public static final boolean equals_impl0/* $FF was: equals-impl0*/(String p1, String p2) {
//        return Intrinsics.areEqual(p1, p2);
//    }
//
//    // $FF: synthetic method
//    public final String unbox_impl/* $FF was: unbox-impl*/() {
//        return this.value;
//    }
//
//    public String toString() {
//        return toString-impl(this.value);
//    }
//
//    public int hashCode() {
//        return hashCode-impl(this.value);
//    }
//
//    public boolean equals(Object var1) {
//        return equals-impl(this.value, var1);
//    }
//}
//
