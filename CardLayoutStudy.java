package t5_SWT;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CardLayoutStudy extends JFrame {
  private JPanel pn1, pn2;
  private JButton btn1, btn2, btn3, btn4;
  private JButton btnPrevious, btnNext, btnFirst, btnLast, btnOK, btnExit;
  
  public CardLayoutStudy() {
    super("SWT 카드레이아웃 학습");
    setSize(500, 200);
    setLocationRelativeTo(null);//가운데정렬
    setResizable(false);//화면고정
    
    //카드레이아웃의 기본은 위치를 모두 같은 곳에 덮어쓴다
    CardLayout layout = new CardLayout();
    setLayout(layout);
    
    btn1 = new JButton("봄");
    btn2 = new JButton("여름");
    btn3 = new JButton("가을");
    btn4 = new JButton("겨울");
    pn2 = new JPanel();
//    pn2.setBounds(400, 100, 500, 50);
    pn2.add(btn1);
    pn2.add(btn2);
    pn2.add(btn3);
    pn2.add(btn4);
    add(pn2);

    btnPrevious= new JButton("이전");
    btnNext= new JButton("다음");
    btnFirst= new JButton("처음");
    btnLast= new JButton("마지막");
    btnExit = new JButton("종료");
    pn1 = new JPanel();
    pn1.setBounds(0, 0, 500, 50);
    pn1.setBackground(Color.black);
    pn1.add(btnPrevious);
    pn1.add(btnNext);
    pn1.add(btnFirst);
    pn1.add(btnLast);
    pn1.add(btnExit);
    add(pn1);
    

    
//    btn1.setBackground(Color.pink);
//    btn2.setBackground(Color.blue);
//    btn3.setBackground(Color.red);
//    btn4.setBackground(Color.cyan);
//    
//    //ImageIcon("I:\\JavaGreen\\html5\\works\\images\\nimo.jpg");
//    btn1.setIcon(new ImageIcon("\\images\\nimo.jpg"));
//    btn1.addActionListener(new ActionListener() {
//      @Override
//      public void actionPerformed(ActionEvent e) {
//        JOptionPane.showMessageDialog(btn1, "봄 버튼 클릭");
//      }
//    });
//    btn2.addActionListener(new ActionListener() {
//      @Override
//      public void actionPerformed(ActionEvent e) {
//        JOptionPane.showMessageDialog(btn2, "여름 버튼 클릭");
//      }
//    });
//    btn3.addActionListener(new ActionListener() {
//      @Override
//      public void actionPerformed(ActionEvent e) {
//        JOptionPane.showMessageDialog(btn3, "가을 버튼 클릭");
//      }
//    });
//    btn4.addActionListener(new ActionListener() {
//      @Override
//      public void actionPerformed(ActionEvent e) {
//        JOptionPane.showMessageDialog(btn4, "겨울 버튼 클릭");
//      }
//    });
    
    btnPrevious.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        layout.previous(getContentPane());//곂친버튼 중 이전버튼(프레임) 보여주기
      }
    });
    btnNext.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        layout.next(getContentPane());//곂친버튼 중 다음버튼(프레임) 보여주기
      }
    });
    btnFirst.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        layout.first(getContentPane());//곂친버튼 중 처음버튼(프레임) 보여주기
      }
    });
    btnLast.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        layout.last(getContentPane());//곂친버튼 중 마지막버튼(프레임) 보여주기
      }
    });
    btnExit.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }
  public static void main(String[] args) {
    CardLayoutStudy a = new CardLayoutStudy();
  }
}
