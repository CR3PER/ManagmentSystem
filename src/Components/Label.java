package Components;

import javax.swing.*;

public class Label extends JLabel {

    public Label(String text, int x, int y, int width, int height)
    {
        this.setText(text);
        this.setBounds(x,y,width,height);
    }
}