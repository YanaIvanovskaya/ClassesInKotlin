//import kotlin.jvm.internal.Intrinsics;
//
//public final class Book {
//
//    private String title;
//    private final String author;
//
//    public final String getTitle() {
//        return this.title;
//    }
//    public final void setTitle(String var1) {
//        Intrinsics.checkNotNullParameter(var1, "<set-?>");
//        this.title = var1;
//    }
//
//    public final String getAuthor() {
//        return this.author;
//    }
//
//    public Book( String author) {
//        Intrinsics.checkNotNullParameter(author, "author");
//        super();
//        this.author = author;
//        this.title = "Unknown";
//    }
//
//    public final String component1() { return this.author; }
//
//    @NotNull
//    public final Book copy(@NotNull String author) {
//        Intrinsics.checkNotNullParameter(author, "author");
//        return new Book(author);
//    }
//
//    // $FF: synthetic method
//    public static Book copy$default(Book var0, String var1, int var2, Object var3) {
//        if ((var2 & 1) != 0) {
//            var1 = var0.author;
//        }
//
//        return var0.copy(var1);
//    }
//
//    @NotNull
//    public String toString() {
//        return "Book(author=" + this.author + ")";
//    }
//
//    public int hashCode() {
//        String var10000 = this.author;
//        return var10000 != null ? var10000.hashCode() : 0;
//    }
//
//    public boolean equals(@Nullable Object var1) {
//        if (this != var1) {
//            if (var1 instanceof Book) {
//                Book var2 = (Book)var1;
//                if (Intrinsics.areEqual(this.author, var2.author)) {
//                    return true;
//                }
//            }
//
//            return false;
//        } else {
//            return true;
//        }
//    }
//}
