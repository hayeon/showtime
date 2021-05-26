package Ticketing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

public class Ticket extends JFrame{

	private String[] lists = { "2021-05-16","2021-05-17"};
	//리스트 멤버변수로 선언
	private String[] times = { "오전 11:00", "오전 11:30","오후 12:00",};
	private JButton btn;
	private JButton btn1_1,btn1_2,btn1_3, btn1_4, btn1_5, btn1_6;
	private JButton btn2_1,btn2_2,btn2_3, btn2_4, btn2_5, btn2_6;
	private JSpinner spinner1,spinner2;
	private JButton btn1;
	private JLabel lbltitle;

	public Ticket(String title, int width, int height) {
		this.setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이아웃
		setLayout(null);
		setLayout(new GridLayout());
		setVisible(true);
	
		//포스터 패널
		JPanel p1 = new JPanel();
		p1.setBackground(Color.black);
		p1.setPreferredSize(new Dimension(200,400));
		add(p1, new BorderLayout().WEST);
			
		//영화 포스터
			ImageIcon icon = new ImageIcon("image/mone.jpg");
			JLabel lblImg = new JLabel(icon);
			lblImg.setBorder(BorderFactory.createEmptyBorder(60,0,0,0));
			p1.add(lblImg);
			
			//우측 패널
			JPanel p2 = new JPanel();
			p2.setLayout(null);
			p2.setBackground(Color.black);
			//p2.setPreferredSize(new Dimension(500,400));
			//add(p2, new BorderLayout().EAST);
			add(p2);
			
			//화살표
			/*ImageIcon icon2 = new ImageIcon("/leftarrow.jpg");
			JLabel lblImg2 = new JLabel(icon2);
			p2.add(lblImg2); */
			
			//date
			JLabel date = new JLabel("DATE");
			date.setForeground(Color.white); //글씨색
			//date.setBorder(BorderFactory.createEmptyBorder(10,0,30,100)); //위치설정
			date.setFont(new Font("American Captain",Font.BOLD, 30));
			date.setBounds(1, 20, 200, 100); //setbounds로 위치설정
			//date.setLocation(420, 50);
			p2.add(date);
			
			//스피너 추가
			SpinnerListModel listModel = new SpinnerListModel(lists);
			spinner1 = new JSpinner(listModel);
			spinner1.setBounds(80, 55, 120, 20); //setbounds로 크기와 위치설정
			p2.add(spinner1);
			
			//time
			JLabel time = new JLabel("TIME");
			time.setForeground(Color.white); //글씨색
			time.setFont(new Font("American Captain",Font.BOLD, 30));
			time.setBounds(1, 70, 200, 100); //setbounds로 위치설정
			p2.add(time);
			
			//시간 스피너 추가
			SpinnerListModel listModel2 = new SpinnerListModel(times);
			spinner2 = new JSpinner(listModel2);
			spinner2.setBounds(80, 110, 120, 20);
			p2.add(spinner2);
			
			//Adult:13,000 Kids:10,000
			JLabel price1 = new JLabel("Adult:13,000   Kids:10,000");
			price1.setForeground(Color.gray); //글씨색
			price1.setFont(new Font("American Captain",0, 20));
			price1.setBounds(1, 110, 200, 100);
			p2.add(price1);
			
			//adult
			JLabel adult = new JLabel("adult");
			adult.setForeground(Color.white); //글씨색
			adult.setFont(new Font("American Captain",Font.BOLD, 24));
			adult.setBounds(1, 150, 70, 100);
			p2.add(adult);
			
			//버튼추가
			
			/*for(int i=1; i<=6; i++) {
				btn1 = new JButton(Integer.toString(i));
				btn1.setBackground(Color.white);
				btn1.setSize(30, 30);
				btn1.setLocation(i*40, 185);
				p2.add(btn1);*/
			
			btn1_1 = new JButton("0");
			btn1_1.setBackground(Color.white);
			btn1_1.setFont(new Font("나눔스퀘어_ac Bold",Font.BOLD, 14));
			btn1_1.setBounds(70, 185, 30, 30);
			p2.add(btn1_1);
			
			btn1_2 = new JButton("1");
			btn1_2.setBackground(Color.white);
			btn1_2.setBounds(110, 185, 30, 30);
			p2.add(btn1_2);
			
			btn1_3 = new JButton("2");
			btn1_3.setBackground(Color.white);
			btn1_3.setBounds(150, 185, 30, 30);
			p2.add(btn1_3);
			
			
			btn1_4 = new JButton("3");
			btn1_4.setBackground(Color.white);
			btn1_4.setBounds(190, 185, 30, 30);
			p2.add(btn1_4);
			
			btn1_5 = new JButton("4");
			btn1_5.setBackground(Color.white);
			btn1_5.setBounds(230, 185, 30, 30);
			p2.add(btn1_5);
			
			//btn1_5 = new JButton("5");
			//btn1_5.setBackground(Color.white);
			//p2.add(btn1_5);
			
			btn1_6 = new JButton("6");
			btn1_6.setBackground(Color.white);
			//p2.add(btn1_6);

			
			//kids
			JLabel kids = new JLabel("kids");
			kids.setForeground(Color.white); //글씨색
			kids.setFont(new Font("American Captain",Font.BOLD, 25));
			kids.setBounds(1, 195, 70, 100);
			p2.add(kids);
			
			btn2_1 = new JButton("0");
			btn2_1.setBackground(Color.white);
			btn2_1.setBounds(70, 230, 30, 30);
			p2.add(btn2_1);
			
			btn2_2 = new JButton("1");
			btn2_2.setBackground(Color.white);
			btn2_2.setBounds(110, 230, 30, 30);
			p2.add(btn2_2);
			
			btn2_3 = new JButton("2");
			btn2_3.setBackground(Color.white);
			btn2_3.setBounds(150, 230, 30, 30);
			p2.add(btn2_3);
			
			btn2_4 = new JButton("3");
			btn2_4.setBackground(Color.white);
			btn2_4.setBounds(190, 230, 30, 30);
			p2.add(btn2_4);
			
			btn2_5 = new JButton("5");
			btn2_5.setBackground(Color.white);
			btn2_5.setBounds(230, 230, 30, 30);
			p2.add(btn2_5);
			
			btn2_6 = new JButton("6");
			btn2_6.setBackground(Color.white);
			//p2.add(btn2_6); */
			
			//total price lbl
			JLabel price2 = new JLabel("총 결제금액 28,000원");
			price2.setForeground(Color.white); //글씨색
			price2.setFont(new Font("나눔스퀘어_ac Bold",Font.BOLD, 20));
			price2.setBounds(1, 220, 190, 140);
			p2.add(price2); 

			// 좌석 선택 버튼
			btn = new JButton("좌석 선택"); 
			btn.setBackground(Color.white);
			btn.setForeground(Color.red);
			btn.setFont(new Font("나눔스퀘어_ac Bold",Font.BOLD, 15));
			btn.setBounds(60, 320, 140, 35);
			p2.add(btn);
			
	}
	
	public static void main(String[] args) {

		new Ticket("좌석 예매", 800, 440);

	}

}