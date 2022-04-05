package t5_SWT;

import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")//직렬화가 아니어도 에러아님 
public class SWTBoardWrite extends JFrame implements WindowListener {
  private JLabel lbl = null;
  
  public SWTBoardWrite() {
    //setTitle("SWT 게시판 학습");
    super("SWT 게시판 학습");
    /*setSize(1000, 600);//프레임 크기*/
    setBounds(100, 50, 1000, 600);//화면 left(x)여백, top(y)여백, 넓이, 높이

    //화면레이아웃
    FlowLayout layout = new FlowLayout();
    setLayout(layout);
    
    //화면프레임에 레이블 붙이기
    lbl = new JLabel();
    lbl.setText("작성자");
    add(lbl);
    lbl = new JLabel();
    lbl.setText("제목");
    add(lbl);
    lbl = new JLabel();
    lbl.setText("내용");
    add(lbl);
    lbl = new JLabel();
    lbl.setText("사진첨부");
    add(lbl);
    
    //화면프레임에 체크박스 붙이기
    JCheckBox chk1 = new JCheckBox("첨부1");
    add(chk1);
    JCheckBox chk2 = new JCheckBox("첨부2");
    add(chk2);
    JCheckBox chk3 = new JCheckBox("첨부3");
    add(chk3);

    //화면프레임에 라디오버튼 붙이기
    JRadioButton rdo1 = new JRadioButton("공개");
    add(rdo1);
    JRadioButton rdo2 = new JRadioButton("비공개");
    add(rdo2);
    
    //화면프레임에 버튼 붙이기
    JButton btn1 = new JButton("저장");
    add(btn1);
    JButton btn2 = new JButton("취소");
    add(btn2);
    JButton btn3 = new JButton("닫기");
    add(btn3);

    
    
    
    
    
    
    
    //윈도우 중앙에 화면프레임 출력
    setLocationRelativeTo(null); //화면프레임 가운데 정렬
    setResizable(false); //화면프레임 고정
    setVisible(true); //화면프레임 표시
    
    //이벤트 : 화면프레임 닫기 
    /*//Listener(윈도우 감시자) 호출
    addWindowListener(this);//이벤트 발생되면 Listener가 감지되서 JVM에게 알림*/
    /*
    //Adapter(윈도우 감시자) 사용
    //Adapter는 내가 필요한 것만 직접 관리
    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);;
      }
    });//익명클래스 생성
    */
    //Adapter로 화면종료만 직접 만들었던것을 JFrame에서 분리해서 제공
    setDefaultCloseOperation(EXIT_ON_CLOSE);//JFrame제공 화면종료
  }
  public static void main(String[] args) {
    SWTBoardWrite board = new SWTBoardWrite();
  }
  @Override
  public void windowOpened(WindowEvent e) {
  }
  @Override //종료버튼 눌렀을때
  public void windowClosing(WindowEvent e) {
    //System.exit(0);
  }
  @Override
  public void windowClosed(WindowEvent e) {
  }
  @Override
  public void windowIconified(WindowEvent e) {
  }
  @Override
  public void windowDeiconified(WindowEvent e) {
  }
  @Override
  public void windowActivated(WindowEvent e) {
  }
  @Override
  public void windowDeactivated(WindowEvent e) {
  }
}
