import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class checkboxdemo implements ItemListener {
    Checkbox checkbox1;
    Checkbox checkbox2;
    Checkbox checkbox3;
    String text ="";
    Label label;
    public checkboxdemo(){
        Frame frame = new Frame("AWT checkbox");
        Font font = new Font("SansSerif",Font.BOLD,12);
         checkbox1 = new Checkbox("java");
         checkbox2 = new Checkbox("python");
         checkbox3 = new Checkbox("C++");
         label = new Label();


         checkbox1.setBackground(Color.red);
         checkbox2.setBackground(Color.blue);
         checkbox3.setBackground(Color.cyan);
        checkbox1.setBounds(10,40,160,30);
        checkbox2.setBounds(10,80,160,30);
        checkbox3.setBounds(10,120,160,30);
        label.setBounds(10,160,160,100);
        checkbox1.setFont(font);
        checkbox2.setFont(font);
        checkbox3.setFont(font);
        label.setBackground(Color.orange);
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(checkbox3);
        frame.add(label);
        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);
        checkbox3.addItemListener(this);
        frame.setSize(400,350);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new checkboxdemo();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        text="";
        text +="Language :";
        text +="  java :" + checkbox1.getState();
        text +="  python :" + checkbox2.getState();
        text +="  C++ :" + checkbox3.getState();
        label.setText(text);

    }
}
