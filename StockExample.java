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

        JPanel outer = new JPanel(new FlowLayout());
        JPanel upper = new JPanel(new CardLayout());
        JPanel lower = new JPanel(new GridLayout(1,2));




        // visibility
        upper.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLUE));
        lower.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));

        outer.add(upper);
        outer.add(lower);
        this.add(outer);








        this.setCursor(Cursor.CROSSHAIR_CURSOR);
        //do this last?
        this.setVisible(true);
    }
}



public static void main(String[] args)
{
    StockExample s = new StockExample("title",600,600,600,300);
}
