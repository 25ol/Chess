public enum Pieces {
    KING,
    QUEEN,
    ROOK,
    BISHOP,
    KNIGHT,
    PAWN;

    public static String getUrl(Pieces pieces, Colour colour) {
        switch (pieces) {
            case KING -> {
                if (colour == Colour.WHITE) {
                    return "/home/joakimfb/Dokument/projects/Chess/Resources/Pieces/wK.svg";
                }
                else return "/home/joakimfb/Dokument/projects/Chess/Resources/Pieces/bK.svg";
            }
            case QUEEN -> {
                if (colour == Colour.WHITE) {
                    return "/home/joakimfb/Dokument/projects/Chess/Resources/Pieces/wQ.svg";
                }
                else return "/home/joakimfb/Dokument/projects/Chess/Resources/Pieces/bQ.svg";
            }
            case ROOK -> {
                if (colour == Colour.WHITE) {
                    return "/home/joakimfb/Dokument/projects/Chess/Resources/Pieces/wR.svg";
                }
                else return "/home/joakimfb/Dokument/projects/Chess/Resources/Pieces/bR.svg";
            }
            case BISHOP -> {
                if (colour == Colour.WHITE) {
                    return "/home/joakimfb/Dokument/projects/Chess/Resources/Pieces/wB.svg";
                }
                else return "/home/joakimfb/Dokument/projects/Chess/Resources/Pieces/bB.svg";
            }
            case KNIGHT -> {
                if (colour == Colour.WHITE) {
                    return "/home/joakimfb/Dokument/projects/Chess/Resources/Pieces/wN.svg";
                }
                else return "/home/joakimfb/Dokument/projects/Chess/Resources/Pieces/bN.svg";
            }
            case PAWN -> {
                if (colour == Colour.WHITE) {
                    return "/home/joakimfb/Dokument/projects/Chess/Resources/Pieces/wP.svg";
                }
                else return "/home/joakimfb/Dokument/projects/Chess/Resources/Pieces/bP.svg";
            }
            default -> System.exit(1);
        }
        return null;
    }
}


