package Stefan.Ferienwoche.TicTacToeVarianten.Spezial;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

    static Image imgX, imgO;

    public ImageLoader() {
        try {
            imgX = ImageIO.read(new File("C:\\Users\\DCV\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Stefan\\Ferienwoche\\TicTacToeVarianten\\Spezial\\res\\x.png"));
            imgO = ImageIO.read(new File("C:\\Users\\DCV\\CodingCampus_2021.09.VZ.Dornbirn\\CodingCampus\\src\\Stefan\\Ferienwoche\\TicTacToeVarianten\\Spezial\\res\\o.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
