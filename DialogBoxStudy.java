package t5_SWT;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DialogBoxStudy extends JFrame {
  public DialogBoxStudy() {
    super("SWT Dialog 메세지화면 학습");
    setSize(500, 200);
    setLocationRelativeTo(null);//가운데정렬
    setResizable(false);//화면고정
    
    //화면레이아웃
    GridLayout layout = new GridLayout(2, 1);//'행,열'로 붙이기
    setLayout(layout);

    JPanel pn1 = new JPanel();
    JButton btn1 = new JButton("경고");
    JButton btn2 = new JButton("입력");
    JButton btn3 = new JButton("예/아니오");
    JButton btn4 = new JButton("예/아니오/취소");
    JButton btn5 = new JButton("메세지삭제");
    JButton btn6 = new JButton("종료");
    pn1.add(btn1);
    pn1.add(btn2);
    pn1.add(btn3);
    pn1.add(btn4);
    pn1.add(btn5);
    pn1.add(btn6);
    add(pn1);
    
    JPanel pn2 = new JPanel();
    JLabel lblMsg = new JLabel("메세지가 출력됩니다");
    pn2.add(lblMsg);
    add(pn2);
    
    //'경고버튼' 클릭하면 '경고메세지'로 출력 
    btn1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        lblMsg.setText("경고버튼을 눌렀습니다");
        
        //DialogBox를 활용한 메세지 출력
        JOptionPane.showMessageDialog(null, "경고합니다");//null:btn1 내 객체를 의미
      }
    });
    
    //'입력버튼' 클릭하면 '입력메세지' 출력
    btn2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        lblMsg.setText("입력버튼을 눌렀습니다");
        //JOptionPane.showInputDialog(null, "성명을 입력하세요");//null:btn1 내 객체를 의미
        String name = JOptionPane.showInputDialog(null, "성명을 입력하세요", 
            "성명 입력창",//제목
            JOptionPane.INFORMATION_MESSAGE);//아이콘
        if ( null != name )
          lblMsg.setText("성명 : " + name);
      }
    });
    
    //'예/아니오버튼'
    btn3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        lblMsg.setText("예/아니오 버튼을 눌렀습니다");
        int ans = JOptionPane.showConfirmDialog(null, "계속 진행합니까?", 
            "진행창",
            JOptionPane.YES_NO_OPTION,//진행창 예/아니오버튼
            JOptionPane.QUESTION_MESSAGE);//진행창 아이콘
        if(0 == ans) lblMsg.setText("작업을 계속 진행합니다");//YES
        else lblMsg.setText("작업을 종료합니다");//NO
      }
    });
    
    //'예/아니오/취소버튼'
    btn4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        lblMsg.setText("예/아니오/취소 버튼을 눌렀습니다");
        int ans = JOptionPane.showConfirmDialog(null, "계속 진행합니까?", 
            "진행창",
            JOptionPane.YES_NO_CANCEL_OPTION,//진행창 예/아니오/취소버튼
            JOptionPane.QUESTION_MESSAGE);//진행창 아이콘
        //0:예 1:아니오 2:취소
        if(0 == ans) lblMsg.setText("작업을 계속 진행합니다");//YES
        else if(1 == ans) lblMsg.setText("작업을 종료합니다");//NO
        else lblMsg.setText("작업을 취소합니다");//CANCEL
      }
    });
    
    
    //'메세지삭제버튼' 클릭하면 '메세지레이블내용' 삭제
    btn5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          lblMsg.setText("");
      }
    });
    
    //종료메소드
    btn6.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });//버튼-ActionListener필요
    
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }
  public static void main(String[] args) {
    DialogBoxStudy a = new DialogBoxStudy();
  }

}
