package Stefan.Ferienwoche.TicTacToeVarianten.Spezial;

import java.util.Arrays;

public class Funktion {
    public static void reset() {
        Arrays.fill(Gui.state, 0);

        Gui.player = 0;
        Gui.gewinner = 0;

    }
}
