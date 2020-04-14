package view.activities;

import javax.swing.*;

public class About extends JFrame
{
    private static final String text = "";

    public About() {
        super();

        setTitle("About");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(320,180);
        setResizable(false);

        JPanel contentPane = new JPanel();
        JLabel about = new JLabel(text);

        contentPane.add(about);

        setContentPane(contentPane);
        setVisible(true);
    }

}
