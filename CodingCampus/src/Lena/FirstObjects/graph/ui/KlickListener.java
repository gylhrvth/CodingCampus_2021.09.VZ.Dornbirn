package Lena.FirstObjects.graph.ui;

import Lena.FirstObjects.graph.businessLogic.Node;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KlickListener extends MouseAdapter {

    private final GraphPanel panelToListenTo;
    private final InfoPanel panelToAct;
    private boolean mousepressed = true;


    public KlickListener(GraphPanel panelToListenTo, InfoPanel panelToAct) {
        this.panelToListenTo = panelToListenTo;
        this.panelToAct = panelToAct;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       if(updateActionPanel(e)) {
           updateListenPanel(e);
           this.mousepressed = !mousepressed;
       }

        super.mouseClicked(e);
    }

    private boolean updateActionPanel(MouseEvent e) {
        Node node = this.panelToListenTo.getGraph().findNode(e.getX(), e.getY());
        if (node == null) {
            JOptionPane.showMessageDialog(panelToListenTo, "Das war kein Punkt auf der Straße");
            return false;
        } else {
            if (this.mousepressed) {
                panelToListenTo.setStart(node);


            } else {
                panelToListenTo.setEnd(node);
                panelToListenTo.findFastestWayAndDisplay();
            }
        }
        return true;
    }

    private void updateListenPanel(MouseEvent event) {
        if (this.mousepressed) {
            this.panelToAct.getStartedKlicked().setText("Start X/Y Koordinaten: " + event.getX() + "/" + event.getY());
        } else {
            this.panelToAct.getEndKlicked().setText("End X/Y Koordinaten: " + event.getX() + "/" + event.getY());
        }
    }
}
