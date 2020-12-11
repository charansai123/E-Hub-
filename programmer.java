package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

public class programmer{
	JFrame programmer;
	JPanel po,p0,p1,p2,p3;
	JMenuBar M;
	JMenu M1,M2,M3;
    JMenuItem m1,m2,m3,m4,m5,m6;
    JButton br1,br2,br3,b1,b2,b3,b4,b5;
	JLabel l0,l1,l2,l3,l4,lo1,lo2;
	JTextField t1,t2,t3,t4,t5;
	JTable t;
	Font f1 = new Font("SansSerif", Font.BOLD, 15);
    Font f2 = new Font("SansSerif", Font.PLAIN, 15);
    Font f3 = new Font("SansSerif", Font.BOLD, 20);
	programmer() throws SQLException{
		swings s=new swings();
		programmer =new JFrame("Programmer");
		M = new JMenuBar();
		M1 = new JMenu("Goto");
		M2 = new JMenu("Func");
		M3 = new JMenu("Others");
		m1 = new JMenuItem("View personal details");m1.setFont(f2);
        m2 = new JMenuItem("View Works on");m2.setFont(f2);
        m4 = new JMenuItem("Logout");
        m5 = new JMenuItem("Home");
        M2.add(m1);M2.add(m2);M3.add(m4);M1.add(m5);
        M.add(M1);M.add(M2);M.add(Box.createHorizontalGlue());M.add(M3);
		p0 = new JPanel(new BorderLayout());p0.setBounds(0,0,400,400);p0.setBackground(Color.cyan);
		l0 = new JLabel("Welcome to");l0.setFont(f3);l0.setBounds(135, 100, 200, 40);
		l1 = new JLabel("Software Management System");l1.setFont(f3);l1.setBounds(50, 135, 300, 40);
		p0.add(l0);p0.add(l1);
		p1 = new JPanel();p1.setBounds(0,0,400,400);p1.setBackground(Color.cyan);
		l2 = new JLabel("Programmer id: ");l2.setFont(f1);l2.setBounds(50, 20, 150, 40);
		t1 = new JTextField();t1.setFont(f2);t1.setBounds(200,20,150,40);
		br1 = new JButton("Reset");br1.setFont(f1);br1.setBounds(50,70,100,40);br1.setBackground(Color.orange);
		b1 = new JButton("Search");b1.setFont(f1);b1.setBounds(200,70,100,40);b1.setBackground(Color.orange);
		lo1= new JLabel("Output: ");lo1.setFont(f1);lo1.setBounds(0,200,100,40);
		p1.add(l2);p1.add(t1);p1.add(br1);p1.add(b1);p1.add(lo1);
		p2 = new JPanel();p2.setBounds(0,0,400,400);p2.setBackground(Color.cyan);
		l3 = new JLabel("Programmer id: ");l3.setFont(f1);l3.setBounds(50, 20, 150, 40);
		t2 = new JTextField();t2.setFont(f2);t2.setBounds(200,20,150,40);
		br2 = new JButton("Reset");br2.setFont(f1);br2.setBounds(50,70,100,40);br2.setBackground(Color.orange);
		b2 = new JButton("Search");b2.setFont(f1);b2.setBounds(200,70,100,40);b2.setBackground(Color.orange);
		lo2= new JLabel("Output: ");lo2.setFont(f1);lo2.setBounds(0,200,100,40);
		p2.add(l3);p2.add(t2);p2.add(br2);p2.add(b2);p2.add(lo2);
		programmer.setJMenuBar(M);
		programmer.add(p0);programmer.add(p1);programmer.add(p2);
		p0.setLayout(null);
		p1.setLayout(null);
		p2.setLayout(null);
		p0.setVisible(true);
		p1.setVisible(false);
        p2.setVisible(false);
        programmer.setVisible(true);
        programmer.setSize(400,400);programmer.setBounds(550, 230, 400, 400);
        programmer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        programmer.setResizable(false);
		ActionListener x=new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {
	        	if(e.getSource()==m1) {
	        		p0.setVisible(false);
	        		p1.setVisible(true);
	                p2.setVisible(false);
	        	}
	        	if(e.getSource()==m2) {
	        		p0.setVisible(false);
	        		p1.setVisible(false);
	                p2.setVisible(true);
	        	}
	        	if(e.getSource()==m4) {
	        		try {
	                    if (s.resultSet != null) s.resultSet.close();
	                    if (s.statement != null) s.statement.close();
	                    if (s.connect != null) s.connect.close();
	                } 
	                catch (Exception e1) {}
	        		finally{
	        			if(JOptionPane.showConfirmDialog(programmer,"Are you sure you want to logout?", "Exit?",JOptionPane.YES_NO_OPTION,
		                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
							try {login l = new login();l.log.setVisible(true);}
							catch (SQLException e1) {e1.printStackTrace();}
		        			finally{programmer.setVisible(false);}
		        		}
	        		}
	        	}
	        	if(e.getSource()==m5) {
	        		p0.setVisible(true);
	        		p1.setVisible(false);
        	        p2.setVisible(false);
	        	}
	        	if(e.getActionCommand()=="Reset") {
        			t1.setText("");
        			t2.setText("");
	        	}
	        	if(e.getSource()==b1) {
	        		try{
	        			String id=t1.getText();
	        			s.preparedStatement = s.connect.prepareStatement("select prog_id,name,addr,street,pincode,phno1,phno2 from Programmer natural join Person where prog_id=?;");
	        	        s.preparedStatement.setString(1,id);
	        	        s.resultSet=s.preparedStatement.executeQuery();
	            		String column[]={"ID" , "Name" , "Address","Street" ,"Pincode" , "Phno1" , "Phno2"}; 
	        	    	String[][] rows=new String[1][7];
	        	    	s.resultSet.next();
        	            rows[0][0] = s.resultSet.getString("prog_id");
        	            rows[0][1] = s.resultSet.getString("name");
        	            rows[0][2] = s.resultSet.getString("addr");
        	            rows[0][3] = s.resultSet.getString("street");
        	            rows[0][4] = s.resultSet.getString("pincode");
        	            rows[0][5] = String.valueOf(s.resultSet.getLong("phno1"));
        	            rows[0][6] = String.valueOf(s.resultSet.getLong("phno2"));
	        	    	t=new JTable(rows,column);t.setBackground(Color.white);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,240,400,40);sp.setBackground(Color.cyan);
	        			t.setFocusable(false);
	        			p1.add(sp);
	            	}catch(Exception e1) {
	            		System.out.println(e1);
	            		JOptionPane.showMessageDialog(programmer,"Search Failed.","Error",JOptionPane.WARNING_MESSAGE);
	            	}
	        	}
	        	if(e.getSource()==b2) {
	        		try{
	        			String id=t2.getText();
	        			s.preparedStatement = s.connect.prepareStatement("select prog_id,sname,status,doc,do_release from Programmer natural join Developed_by natural join Software where prog_id=?;");
	        	        s.preparedStatement.setString(1,id);
	        	        s.resultSet=s.preparedStatement.executeQuery();
	        	        int i=0;
	        	    	while (s.resultSet.next()) i++;
	            		String column[]={"ID" , "Name" , "Status","doc" ,"do_release"}; 
	        	    	String[][] rows=new String[i][5];
	        	    	s.resultSet=s.preparedStatement.executeQuery();
	        	    	i=0;
	        	    	while(s.resultSet.next()) {
	        	            rows[i][0] = s.resultSet.getString("prog_id");
	        	            rows[i][1] = s.resultSet.getString("sname");
	        	            rows[i][2] = s.resultSet.getString("status");
	        	            rows[i][3] = String.valueOf(s.resultSet.getDate("doc"));
	        	            rows[i][4] = String.valueOf(s.resultSet.getDate("do_release"));
	        	            i++;
	        	    	}
	        	    	t=new JTable(rows,column);t.setBackground(Color.white);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,240,400,20*i);sp.setBackground(Color.cyan);
	        			t.setFocusable(false);
	        			p2.add(sp);
	            	}catch(Exception e1) {
	            		System.out.println(e1);
	            		JOptionPane.showMessageDialog(programmer,"Search Failed.","Error",JOptionPane.WARNING_MESSAGE);
	            	}
	        	}
	        }
		};
		m5.addActionListener(x);
		m4.addActionListener(x);
		m1.addActionListener(x);
	    m2.addActionListener(x);
	    br1.addActionListener(x);
	    b1.addActionListener(x);
	    br2.addActionListener(x);
	    b2.addActionListener(x);
	}
}
