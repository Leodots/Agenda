import com.formdev.flatlaf.extras.FlatSVGIcon;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() throws HeadlessException {

        initComponents();
        initUI();
    }

    private void initComponents() {

        createMenuBars();
        createContactTable();

    }

    private void createMenuBars() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        menu.add(new JMenuItem("Item 1"));
        menu.add(new JMenuItem("Item 2"));

        menuBar.add(menu);
        this.add(menuBar);
        this.setJMenuBar(menuBar);
    }

    private void initUI() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Agenda");
        this.setFocusable(true);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(600, 300));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setIconImage((new FlatSVGIcon("icons/camera-aperture.svg").getImage()));
    }

    private void createContactTable() {
    }

}
