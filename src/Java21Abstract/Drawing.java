package Java21Abstract;

import javax.swing.*;
import java.awt.*;

public class Drawing {
    public static void main(String[] args) {

        JFrame jFrame=new JFrame();    //1
        jFrame.setSize(2000,2000);  //2
        MyDrawing m=new MyDrawing();  // 7
        jFrame.add(m);//8
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);   //3

    }
}
class  MyDrawing extends Canvas {

    @Override
    public void paint(Graphics g) {   //4
        g.setColor(Color.PINK);
        for (int i=100; i<600; i=i+50)//5

        g.fillOval(i,200,500,500);   //6

    }

}