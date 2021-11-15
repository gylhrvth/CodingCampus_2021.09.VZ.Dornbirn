package Stefan.Ferienwoche.GaameOfLive;

import Stefan.Ferienwoche.GaameOfLive.game.GM;
import Stefan.Ferienwoche.GaameOfLive.game.GameClock;
import Stefan.Ferienwoche.GaameOfLive.gui.Gui;

public class main {
    public static void main(String[] args) {

        Gui g = new Gui();
        GM gm = new GM();
        GameClock gc = new GameClock();
//
        gm.setup();
        g.create();
        gc.start();
    }
}
