import javax.swing.*;
import java.awt.*;

public static class StockExample extends JFrame {



    public StockExample(String title, int w, int h, int pos_x,int pos_y){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(w,h);
        this.setAlwaysOnTop(true);
        this.setLocation(pos_x,pos_y);

        //grid layout (one large box at the top and 2 small ones for buying and selling at the bottom

        JPanel top = new JPanel();
        top.setBackground(new Color(200, 220, 255));
        top.add(new JLabel("Top (2/3)"));

        JPanel bottom = new JPanel();
        bottom.setBackground(new Color(255, 220, 200));

        JPanel btmGridouter = new JPanel(new GridLayout(1,2));

        btmGridouter.add(new JLabel("Bottom (1/3 pt1)"));

        bottom.add(btmGridouter);


        JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, top, bottom);
        split.setResizeWeight(0.667);



        // visibility
//        top.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLUE));
//        bottom.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));


        this.add(split,BorderLayout.CENTER);








        this.setCursor(Cursor.CROSSHAIR_CURSOR);
        //do this last?
        this.setVisible(true);
    }
}



public static void main(String[] args)
{
    StockExample s = new StockExample("title",600,600,600,300);
}
