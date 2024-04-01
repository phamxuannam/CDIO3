package abc;
import java.awt.*;
import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.*; 
public class PTBac1 extends JFrame{
    JTextField myTextField1, myTextField2;
    JLabel myLabel;
    public PTBac1(){
        super();
        this.setTitle("PT bậc nhất");//Tao khung
        this.setSize(300, 180);//Thiet lap kich thuoc khung
        this.setLayout(new GridLayout(4,2));//Thiết lập bố cục 4 hàng 2 cột
        this.add(new JLabel("Nhập a:"));
        myTextField1 = new JTextField();       
        this.add(myTextField1);
        this.add(new JLabel("Nhập b:"));
        myTextField2 = new JTextField();       
        this.add(myTextField2);
        this.add(new JLabel("Kết quả:"));
        myLabel = new JLabel(".....");
        this.add(myLabel);
        JButton b1 = new JButton("OK");
        b1.addActionListener((ActionEvent e) -> {
            try{
                double a = Double.parseDouble(myTextField1.getText());
                double b = Double.parseDouble(myTextField2.getText());            
                if (a == 0)
                    if (b == 0)
                        myLabel.setText("Vô số nghiệm");
                    else
                        myLabel.setText("Vô nghiệm");
                else           
                    myLabel.setText("" + (-b / a));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Lỗi định dạng số", "Error", JOptionPane.ERROR_MESSAGE);
                myTextField1.setText("");
                myTextField2.setText("");
            }
        });
        JButton b2 = new JButton("Cancel");
        b2.addActionListener((ActionEvent e) -> {
            System.exit(0);           
        });        
        this.add(b1);
        this.add(b2);
        this.setLocationRelativeTo(null);//Xuat hien giua man hinh
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Ket thuc chuong trinh khi dong frame
    }
    public static void main(String[] args){     
        PTBac1 abc = new PTBac1();
        abc.setVisible(true);
    }
}
