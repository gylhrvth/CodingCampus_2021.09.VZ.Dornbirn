package Lena.FirstObjects.graph.ui;

import Lena.FirstObjects.graph.businessLogic.Graph;

import javax.swing.*;
import java.awt.*;

public class GraphFrame extends JFrame {


    public GraphFrame(Graph graph, int width, int height) {
//        for (UIManager.LookAndFeelInfo lookAndFeel : UIManager.getInstalledLookAndFeels()) {
//            System.out.println(lookAndFeel);
//        }
//        try {
//            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//        } catch (Exception exc) {
//            //noop
//        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Graph");
        this.setLayout(new BorderLayout());


        GraphPanel graphPanel = new GraphPanel(graph, width, height);
        graphPanel.setPreferredSize(new Dimension(width, height));
        this.add(graphPanel, BorderLayout.CENTER);

        InfoPanel infoPanel = new InfoPanel(width / 3, height / 3);
        infoPanel.setPreferredSize(new Dimension(width / 3, height / 3));
        this.add(infoPanel, BorderLayout.EAST);

        KlickListener klickListener = new KlickListener(graphPanel,infoPanel);
        graphPanel.addMouseListener(klickListener);



        this.pack();
        this.setVisible(true);
    }
}
