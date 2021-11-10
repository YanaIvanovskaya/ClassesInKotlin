//import kotlin.jvm.internal.DefaultConstructorMarker;
//import kotlin.jvm.internal.Intrinsics;
//
//public final class Bitmap {
//    @NotNull
//    public static final Bitmap.Companion Companion = new Bitmap.Companion((DefaultConstructorMarker)null);
//
//    public static final class Companion {
//        @NotNull
//        public final Bitmap decodeFile(@NotNull String path) {
//            Intrinsics.checkNotNullParameter(path, "path");
//            return new Bitmap();
//        }
//
//        private Companion() {
//        }
//
//        // $FF: synthetic method
//        public Companion(DefaultConstructorMarker $constructor_marker) {
//            this();
//        }
//    }
//}
//
//public enum Card {
//    QUEEN_OF_HEARTS,
//    TEN_OF_CLUBS;
//
//    private int value;
//    @NotNull
//    public static final Card.Companion Companion = new Card.Companion((DefaultConstructorMarker)null);
//
//    public final void setTrump() {
//        this.value += 10;
//    }
//
//    @NotNull
//    public abstract Bitmap getCardImage();
//
//    public final int getValue() {
//        return this.value;
//    }
//
//    public final void setValue(int var1) {
//        this.value = var1;
//    }
//
//    private Card(int value) {
//        this.value = value;
//    }
//
//    // $FF: synthetic method
//    public Card(int value, DefaultConstructorMarker $constructor_marker) {
//        this(value);
//    }
//
//    static final class QUEEN_OF_HEARTS extends Card {
//        @NotNull
//        public Bitmap getCardImage() {
//            return Bitmap.Companion.decodeFile("img/queen_of_hearts.png");
//        }
//
//        QUEEN_OF_HEARTS(String $enum$name, int $enum$ordinal) {
//            super(12, (DefaultConstructorMarker)null);
//        }
//    }
//
//    static final class TEN_OF_CLUBS extends Card {
//        @NotNull
//        public Bitmap getCardImage() {
//            return Bitmap.Companion.decodeFile("img/ten_of_clubs.png");
//        }
//
//        TEN_OF_CLUBS(String $enum$name, int $enum$ordinal) {
//            super(10, (DefaultConstructorMarker)null);
//        }
//    }
//
//    public static final class Companion {
//        @NotNull
//        public final List getShuffledDeck() {
//            return CollectionsKt.shuffled((Iterable)CollectionsKt.listOf(new Card[]{Card.QUEEN_OF_HEARTS, Card.TEN_OF_CLUBS}));
//        }
//
//        private Companion() {
//        }
//
//        // $FF: synthetic method
//        public Companion(DefaultConstructorMarker $constructor_marker) {
//            this();
//        }
//    }
//}
//
