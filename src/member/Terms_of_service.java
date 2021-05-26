package member;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Terms_of_service extends JFrame implements ActionListener {

	private JPanel JP;
	private JButton btnCancle, btnOk;
	private JCheckBox JC_1;

	public Terms_of_service(String title, int width, int height) {
		this.setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setVisible(true);

		// 배경 패널
		JP = new JPanel();
		JP.setBackground(Color.white);

		JP.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		add(JP);
		// 타이틀
		JLabel lbltitle = new JLabel("SHOWTIME");
		lbltitle.setForeground(Color.red); // 글씨색
		lbltitle.setFont(new Font("American Captain", Font.BOLD, 40));

		JP.add(lbltitle);

		// 체크박스
		JC_1 = new JCheckBox("ShowTime 이용약관, 개인정보 수집 및 이용" + "\r\n" + "프로모션 정보 수신에 동의합니다.");
		JP.add(JC_1);

		// TEXTAREA
		JTextArea JT = new JTextArea("개인정보보호법에 따라 SHOWTIME에 회원가입 신청하시는" + "\r\n" + " 분께 수집하는 개인정보의 항목, " + "\r\n"
				+ "개인정보의 수집 및 이용목적, 개인정보의 보유 및 이용기간, " + "\r\n" + "동의 거부권 및 동의 거부 시 불이익에 관한" + "\r\n"
				+ " 사항을 안내 드리오니 자세히 읽은 후 동의하여 주시기 바랍니다.\r\n" + "\r\n" + "1. 수집하는 개인정보\r\n"
				+ "이용자는 회원가입을 하지 않아도 정보 검색, 뉴스 보기 등  " + "\r\n" + "대부분의 서비스를 회원과 동일하게 " + "\r\n"
				+ "이용할 수 있습니다. 이용자가 메일, 캘린더, 카페, 블로그 등과 같이 " + "\r\n" + "개인화 혹은 회원제 서비스를 이용하기" + "\r\n"
				+ " 위해 회원가입을 할 경우, SHOWTIME는 서비스 이용을 위해 필요한 " + "\r\n" + "최소한의 개인정보를 수집합니다.\r\n" + "\r\n"
				+ "회원가입 시점에 SHOWTIME 이용자로부터 수집하는 개인정보는 아래와 같습니다.\r\n" + "- 회원 가입 시에 ‘아이디, 비밀번호, 이름, 생년월일, 성별, 휴대전화번호’를 "
				+ "\r\n" + "필수항목으로 수집합니다. \r\n" + "\r\n" + "서비스 이용 과정에서 이용자로부터 수집하는 개인정보는 아래와 같습니다.\r\n"
				+ "SHOWTIME 내의 개별 서비스 이용, 이벤트 응모 및 경품 신청 과정에서 " + "\r\n" + "해당 서비스의 이용자에 한해 추가 " + "\r\n"
				+ "개인정보 수집이 발생할 수 있습니다. 추가로 개인정보를 수집할 경우에는 해당 개인정보 수집 " + "\r\n" + "시점에서 이용자에게 ‘수집하는 개" + "\r\n"
				+ "인정보 항목, 개인정보의 수집 및 이용목적, 개인정보의 보관기간’에 대해 " + "\r\n" + "안내드리고 동의를 받습니다.\r\n" + "\r\n"
				+ "서비스 이용 과정에서 IP 주소, 쿠키, 서비스 이용 기록, 기기정보, " + "\r\n" + "위치정보가 생성되어 수집될 수 있습니다. 또한 이미지 " + "\r\n"
				+ "및 음성을 이용한 검색 서비스 등에서 이미지나 음성이 수집될 수 있습니다.\r\n" + "구체적으로 1) 서비스 이용 과정에서 이용자에 관한 정보를 자동화된 방법으로 "
				+ "\r\n" + "생성하여 이를 저장(수집)하거나,\r\n" + "2) 이용자 기기의 고유한 정보를 원래의 값을 확인하지 못 하도록 안전하게 " + "\r\n"
				+ "변환하여 수집합니다. 서비스 이용 과정에서 " + "위치정보가 수집될 수 있으며,\r\n" + "이와 같이 수집된 정보는 개인정보와의 연계 여부 등에 따라 개인정보에"
				+ "\r\n" + " 해당할 수 있고, 개인정보에 해당하지 않을 수도 있습니다.\r\n" + "2. 수집한 개인정보의 이용\r\n"
				+ "SHOWTIME 및 관련 제반 서비스(모바일 웹/앱 포함)의 회원관리, " + "\r\n" + "서비스 개발・제공 및 향상, 안전한 인터넷 이용환경 구축 등 " + "\r\n"
				+ "아래의 목적으로만 개인정보를 이용합니다.\r\n" + "\r\n" + "- 회원 가입 의사의 확인, 연령 확인 ,, 이용자 식별, 회원탈퇴" + "\r\n"
				+ " 의사의 확인 등 회원관리를 위하여 개인정보를 이용합니다.\r\n" + "관심에 기반한 이용자간 관계의 형성, 지인 및 관심사 등에 기반한 " + "\r\n"
				+ "맞춤형 서비스 제공 등 신규 서비스 요소의 발굴 및" + "\r\n" + " 기존 서비스 개선 등을 위하여 개인정보를 이용합니다.\r\n"
				+ "- 법령 및 네이버 이용약관을 위반하는 회원에 대한 이용 제한 조치, " + "\r\n" + "부정 이용 행위를 포함하여 서비스의 원활한" + "\r\n"
				+ " 운영에 지장을 주는 행위에 대한 방지 및 제재, 계정도용 및 " + "\r\n" + "부정거래 방지, 약관 개정 등의 고지사항 전달," + "\r\n"
				+ " 분쟁조정을 위한 기록 보존, 민원처리 등 이용자 보호 및 " + "\r\n" + "서비스 운영을 위하여 개인정보를 이용합니다.\r\n"
				+ "- 유료 서비스 제공에 따르는 본인인증, 구매 및 요금 결제," + "\r\n" + " 상품 및 서비스의 배송을 위하여 개인정보를 이용합니다.\r\n"
				+ "- 이벤트 정보 및 참여기회 제공, 광고성 정보 제공 등 마케팅 " + "\r\n" + "및 프로모션 목적으로 개인정보를 이용합니다.\r\n"
				+ "- 서비스 이용기록과 접속 빈도 분석, 서비스 이용에 대한 통계, " + "\r\n" + "서비스 분석 및 통계에 따른 맞춤 서비스 제공 및 " + "\r\n"
				+ "광고 게재 등에 개인정보를 이용합니다.\r\n" + "- 보안, 프라이버시, 안전 측면에서 이용자가 안심하고 이용할 수 있는 " + "\r\n"
				+ "서비스 이용환경 구축을 위해 개인정보를 이용합니다.\r\n" + "3. 개인정보의 보관기간\r\n"
				+ "회사는 원칙적으로 이용자의 개인정보를 회원 탈퇴 시 지체없이 파기하고 있습니다.\r\n" + "단, 이용자에게 개인정보 보관기간에 대해 별도의 동의를 얻은 경우, " + "\r\n"
				+ "또는 법령에서 일정 기간 정보보관 의무를 " + "\r\n" + "부과하는 경우에는 해당 기간 동안 개인정보를 안전하게 보관합니다.\r\n" + "\r\n"
				+ "이용자에게 개인정보 보관기간에 대해 회원가입 시 또는 서비스 가입 시 동의를 얻은 경우는 아래와 같습니다.\r\n" + "- 부정 가입 및 이용 방지\r\n"
				+ "부정 이용자의 가입인증 휴대전화번호 또는 DI : 탈퇴일로부터 6개월 보관\r\n"
				+ "탈퇴한 이용자의 휴대전화번호(복호화가 불가능한 일방향 암호화(해시처리)) : 탈퇴일로부터 6개월 보관\r\n" + "\r\n"
				+ "- 스마트플레이스 분쟁 조정 및 고객문의 대응\r\n" + "휴대전화번호:등록/수정/삭제 요청 시로부터 최대1년\r\n"
				+ "암호화처리(해시처리)한DI :혜택 제공 종료일로부터6개월 보관\r\n" + "\r\n" + "ID : 서비스 탈퇴 후 6개월 보관\r\n" + "\r\n"
				+ "전자상거래 등에서의 소비자 보호에 관한 법률, 전자금융거래법, 통신비밀보호법 등 법령에서 일정기간 정보의 " + "\r\n"
				+ "보관을 규정하는 경우는 아래와 같습니다. ShowTime는 이 기간 동안 법령의 규정에 따라 개인정보를 보관하며, " + "\r\n"
				+ "본 정보를 다른 목적으로는 절대 이용하지 않습니다.\r\n" + "- 전자상거래 등에서 소비자 보호에 관한 법률\r\n"
				+ "계약 또는 청약철회 등에 관한 기록: 5년 보관\r\n" + "대금결제 및 재화 등의 공급에 관한 기록: 5년 보관\r\n"
				+ "소비자의 불만 또는 분쟁처리에 관한 기록: 3년 보관\r\n" + "- 전자문서 및 전자거래 기본법\r\n"
				+ "공인전자주소를 통한 전자문서 유통에 관한 기록 : 10년 보관\r\n" + "- 통신비밀보호법\r\n" + "로그인 기록: 3개월\r\n" + "\r\n"
				+ "참고로 SHOWTIMED은 ‘개인정보 유효기간제’에 따라 1년간 서비스를 이용하지 않은 회원의 개인정보를 " + "\r\n" + "별도로 분리 보관하여 관리하고 있습니다.\r\n"
				+ "\r\n" + "4. 개인정보 수집 및 이용 동의를 거부할 권리\r\n"
				+ "이용자는 개인정보의 수집 및 이용 동의를 거부할 권리가 있습니다. 회원가입 시 수집하는 최소한의 개인정보," + "\r\n"
				+ " 즉, 필수 항목에 대한 수집 및 이용 동의를 거부하실 경우, 회원가입이 어려울 수 있습니다.", 20, 40);
		JT.setEditable(false); // 편집불가하게 만듬
		JScrollPane scrollPane = new JScrollPane(JT, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); // 양쪽에 스크롤 붙이
		JP.add(scrollPane);

		// 취소버튼
		btnCancle = new JButton("취소");
		btnCancle.setBackground(Color.gray);
		btnCancle.setFont(new Font("나눔스퀘어_ac Bold", Font.BOLD, 20));
		btnCancle.setForeground(Color.white); // 글씨색
		btnCancle.setPreferredSize(new Dimension(90, 40)); // 버튼 사이즈
		btnCancle.setSize(80, 100);
		JP.add(btnCancle);
		btnCancle.addActionListener(this);

		// 확인 버튼
		btnOk = new JButton("확인");
		btnOk.setBackground(Color.red);
		btnOk.setFont(new Font("나눔스퀘어_ac Bold", Font.BOLD, 20));
		btnOk.setPreferredSize(new Dimension(90, 40)); // 버튼 사이즈
		btnOk.addActionListener(this);
		JP.add(btnOk);

		setVisible(true);
	}

	public static void main(String[] args) {

		new Terms_of_service("이용약관", 500, 600);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
	
		if(obj == btnOk) {
			if(JC_1.isSelected()) { //이용약관 동의 시 
				System.out.println("회원가입창 이동");
				}
			
			else { //이용약관에 동의하지 않았을 경우
				JOptionPane.showMessageDialog(this, " 이용약관과 개인정보 수집 및 이용에 대한 안내 모두 동의해주세요.", 
						"메시지",JOptionPane.INFORMATION_MESSAGE);
				}
		}
		else  { //취소를 누를 시 창이 닫힘
			dispose();
			}
			
		}
}
				
