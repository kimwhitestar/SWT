package t5_SWT;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Study extends JFrame {
  public Study() {
    super("SWT 메세지화면 중앙정렬");
    setSize(300, 100);
    
    //화면레이아웃
    FlowLayout layout = new FlowLayout();
    setLayout(layout);

    
    
    //윈도우 중앙에 화면프레임 출력
    setLocationRelativeTo(null); //화면프레임 가운데 정렬
    setResizable(false); //화면프레임 고정
    setVisible(true); //화면프레임 표시
    setDefaultCloseOperation(EXIT_ON_CLOSE); //화면프레임 닫기
  }
  public static void main(String[] args) {
    Study a = new Study();
  }
}
