/*메인프레임처럼 프레임을 상하좌우로 나눈다*/
package t5_SWT;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BorderLayoutStudy extends JFrame {
  private JButton btn1, btn2, btn3, btn4, btnOK, btnExit;
  
  public BorderLayoutStudy() {
    super("SWT 보더레이아웃 학습");
    setSize(500, 200);
    setLocationRelativeTo(null);//가운데정렬
    setResizable(false);//화면고정
    
//기본레이아웃 BorderLayout은 생략해도 실행된다
//    BorderLayout layout = new BorderLayout();
//    setLayout(layout);

    btn1 = new JButton("동쪽");
    btn2 = new JButton("서쪽");
    btn3 = new JButton("남쪽");
    btn4 = new JButton("북쪽");
    
    JPanel pn = new JPanel();
    btnOK = new JButton("확인");
    btnExit = new JButton("종료");
    pn.setLayout(null);
    btnOK.setBounds(100, 30, 100, 30);//붙일 위치
    btnExit.setBounds(200, 30, 100, 30);//붙일 위치
    pn.add(btnOK);
    pn.add(btnExit);
    
    //BorderLayout제공 열거형상수(Enum) 사용
    add(btn1, BorderLayout.EAST);
    add(btn2, BorderLayout.WEST);
    add(btn3, BorderLayout.SOUTH);
    add(btn4, BorderLayout.NORTH);
    add(pn, BorderLayout.CENTER);
    
    //확인버튼 클릭
    btnOK.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "확인버튼을 눌렀습니다");
      }
    });
    
    //종료버튼 클릭
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
    BorderLayoutStudy a = new BorderLayoutStudy();
  }
}
