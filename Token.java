public class Token {
    enum Toktype {
        NUMBER, OP, PAREN
    }

    public Toktype getTtype() {
        return ttype;
    }

    public void setTtype(Toktype ttype) {
        this.ttype = ttype;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public char getTk() {
        return tk;
    }

    public void setTk(char tk) {
        this.tk = tk;
    }

    // Pensa a implementar els "getters" d'aquests atributs
    private Toktype ttype;
    private int value;
    private char tk;

    // Constructor privat. Evita que es puguin construir objectes Token externament
    private Token() {
    }

    // Torna un token de tipus "NUMBER"
    static Token tokNumber(int value) {
        Token t = Token.tokNumber(value);
        return t;
    }

    // Torna un token de tipus "OP"
    static Token tokOp(char c) {
        Token t = Token.tokOp(c);
        return t;
    }

    // Torna un token de tipus "PAREN"
    static Token tokParen(char c) {
        Token t = Token.tokParen(c);
        return t;
    }

    // Mostra un token (conversió a String)
    public String toString() {
        return "";
    }

    // Mètode equals. Comprova si dos objectes Token són iguals
    public boolean equals(Object o) {
       // if (this.Token.tokNumber != Token.tokNumber) return false;
        return false;
    }

    // A partir d'un String, torna una llista de tokens
    public static Token[] getTokens(String expr) {
        return null;
    }
}
