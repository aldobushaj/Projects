/*Token rappresenta i token che corrispondo ai simboli di operazioni  ed ad altri operatori */
public class Token {
    public final int tag;

    public Token(int t) {
        tag = t;
    }

    public String toString() {
        return "<" + tag + ">";
    }

    public static final Token
    not = new Token('!'),
        lpt = new Token('('),
        rpt = new Token(')'),
        lpg = new Token('{'),
        rpg = new Token('}'),
        plus = new Token('+'),
        minus = new Token('-'),
        mult = new Token('*'),
        div = new Token('/'),
        semicolon = new Token(';');
}