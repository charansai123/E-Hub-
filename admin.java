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

public class admin{
	JFrame admin;
	JPanel po1,po2,po3,po4,po5,po6,po7,po8,po9,po10,p0,p1,p2,p3;
	JMenuBar M;
	JMenu M1,M2,M3,M4;
    JMenuItem m1,m2,m3,m4,m5,m6,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;
    JButton br1,br2,br3,b1,b2,b3,b4,b5,b6;
	JLabel l0,l1,l2,l3,l4,l5,l6,l7,lo1,lo2,lo3;
	JLabel ql1,ql2,ql3,ql4,ql5,ql6,ql7,ql8,ql9,ql10;
	JTextField t1,t2,t3,t4,t5;
	JTable t;
	Font f1 = new Font("SansSerif", Font.BOLD, 15);
    Font f2 = new Font("SansSerif", Font.PLAIN, 15);
    Font f3 = new Font("SansSerif", Font.BOLD, 20);
	admin() throws SQLException{
		swings s=new swings();
		admin =new JFrame("Admin");
		M = new JMenuBar();
		M1 = new JMenu("Goto");
		M2 = new JMenu("Func");
		M3 = new JMenu("Others");
		M4 = new JMenu("Queries");
		m1 = new JMenuItem("View client details");m1.setFont(f2);
        m2 = new JMenuItem("View programmer details");m2.setFont(f2);
        m3 = new JMenuItem("Software details");m3.setFont(f2);
        m4 = new JMenuItem("Logout");
        m5 = new JMenuItem("Home");
        q1 = new JMenuItem("Query 1");q1.setFont(f2);
        q2 = new JMenuItem("Query 2");q2.setFont(f2);
        q3 = new JMenuItem("Query 3");q3.setFont(f2);
        q4 = new JMenuItem("Query 4");q4.setFont(f2);
        q5 = new JMenuItem("Query 5");q5.setFont(f2);
        q6 = new JMenuItem("Query 6");q6.setFont(f2);
        q7 = new JMenuItem("Query 7");q7.setFont(f2);
        q8 = new JMenuItem("Query 8");q8.setFont(f2);
        q9 = new JMenuItem("Query 9");q9.setFont(f2);
        q10 = new JMenuItem("Query 10");q10.setFont(f2);
        M4.add(q1);M4.add(q2);M4.add(q3);M4.add(q4);M4.add(q5);M4.add(q6);M4.add(q7);M4.add(q8);M4.add(q9);M4.add(q10);
        M2.add(m1);M2.add(m2);M2.add(m3);M3.add(m4);M1.add(m5);
        M.add(M1);M.add(M2);M.add(M4);M.add(Box.createHorizontalGlue());M.add(M3);
		p0 = new JPanel(new BorderLayout());p0.setBounds(0,0,400,400);p0.setBackground(Color.cyan);
		l0 = new JLabel("Welcome to");l0.setFont(f3);l0.setBounds(135, 100, 200, 40);
		l1 = new JLabel("Software Management System");l1.setFont(f3);l1.setBounds(50, 135, 300, 40);
		p0.add(l0);p0.add(l1);
		
		p1 = new JPanel();p1.setBounds(0,0,400,400);p1.setBackground(Color.cyan);
		l2 = new JLabel("Client id: ");l2.setFont(f1);l2.setBounds(50, 20, 150, 40);
		t1 = new JTextField();t1.setFont(f2);t1.setBounds(200,20,150,40);
		br1 = new JButton("Reset");br1.setFont(f1);br1.setBounds(50,70,100,40);br1.setBackground(Color.orange);
		b1 = new JButton("Search");b1.setFont(f1);b1.setBounds(200,70,100,40);b1.setBackground(Color.orange);
		l5 = new JLabel("Or");l5.setFont(f1);l5.setBounds(175,110,100,40);
		lo1= new JLabel("Output: ");lo1.setFont(f1);lo1.setBounds(0,200,100,40);
		b4 = new JButton("Get All Details");b4.setFont(f1);b4.setBounds(90,150,200,40);b4.setBackground(Color.orange);
		p1.add(l2);p1.add(t1);p1.add(br1);p1.add(b1);p1.add(l5);p1.add(b4);p1.add(lo1);
		
		p2 = new JPanel();p2.setBounds(0,0,400,400);p2.setBackground(Color.cyan);
		l3 = new JLabel("Programmer id: ");l3.setFont(f1);l3.setBounds(50, 20, 150, 40);
		t2 = new JTextField();t2.setFont(f2);t2.setBounds(200,20,150,40);
		br2 = new JButton("Reset");br2.setFont(f1);br2.setBounds(50,70,100,40);br2.setBackground(Color.orange);
		b2 = new JButton("Search");b2.setFont(f1);b2.setBounds(200,70,100,40);b2.setBackground(Color.orange);
		l6 = new JLabel("Or");l6.setFont(f1);l6.setBounds(175,110,100,40);
		lo2= new JLabel("Output: ");lo2.setFont(f1);lo2.setBounds(0,200,100,40);
		b5 = new JButton("Get All Details");b5.setFont(f1);b5.setBounds(90,150,200,40);b5.setBackground(Color.orange);
		p2.add(l3);p2.add(t2);p2.add(br2);p2.add(b2);p2.add(l6);p2.add(b5);p2.add(lo2);
		
		p3 = new JPanel();p3.setBounds(0,0,400,400);p3.setBackground(Color.cyan);
		l4 = new JLabel("Software Name: ");l4.setFont(f1);l4.setBounds(50, 20, 150, 40);
		t3 = new JTextField();t3.setFont(f2);t3.setBounds(200,20,150,40);
		br3 = new JButton("Reset");br3.setFont(f1);br3.setBounds(50,70,100,40);br3.setBackground(Color.orange);
		b3 = new JButton("Search");b3.setFont(f1);b3.setBounds(200,70,100,40);b3.setBackground(Color.orange);
		l7 = new JLabel("Or");l7.setFont(f1);l7.setBounds(175,110,100,40);
		lo3= new JLabel("Output: ");lo3.setFont(f1);lo3.setBounds(0,200,100,40);
		b6 = new JButton("Get All Details");b6.setFont(f1);b6.setBounds(90,150,200,40);b6.setBackground(Color.orange);
		p3.add(l4);p3.add(t3);p3.add(br3);p3.add(b3);p3.add(l7);p3.add(b6);p3.add(lo3);
		
		po1 = new JPanel();po1.setBounds(0,0,400,400);po1.setBackground(Color.cyan);
		po2 = new JPanel();po2.setBounds(0,0,400,400);po2.setBackground(Color.cyan);
		po3 = new JPanel();po3.setBounds(0,0,400,400);po3.setBackground(Color.cyan);
		po4 = new JPanel();po4.setBounds(0,0,400,400);po4.setBackground(Color.cyan);
		po5 = new JPanel();po5.setBounds(0,0,400,400);po5.setBackground(Color.cyan);
		po6 = new JPanel();po6.setBounds(0,0,400,400);po6.setBackground(Color.cyan);
		po7 = new JPanel();po7.setBounds(0,0,400,400);po7.setBackground(Color.cyan);
		po8 = new JPanel();po8.setBounds(0,0,400,400);po8.setBackground(Color.cyan);
		po9 = new JPanel();po9.setBounds(0,0,400,400);po9.setBackground(Color.cyan);
		po10 = new JPanel();po10.setBounds(0,0,400,400);po10.setBackground(Color.cyan);
		ql1= new JLabel("<html>Query:<br>Retrieving the id of programmers who know <br>more than 2 programming languages.<br><br>Result:</html>");ql1.setBounds(10, 20, 400, 100);ql1.setFont(f1);
		ql2= new JLabel("<html>Query:<br>Details of name of the software and the project<br> leader's id are required.<br><br>Result:</html>");ql2.setBounds(10, 20, 400, 100);ql2.setFont(f1);
		ql3= new JLabel("<html>Query:<br>All the personal details of client CL01 are required.<br><br>Result:</html>");ql3.setBounds(10, 20, 400, 100);ql3.setFont(f1);
		ql4= new JLabel("<html>Query:<br>Number of programmers working in each project<br> are required.<br><br>Result:</html>");ql4.setBounds(10, 20, 400, 100);ql4.setFont(f1);
		ql5= new JLabel("<html>Query:<br>Retrieving the names of the softwares which are<br> finished implementing.<br><br>Result:</html>");ql5.setBounds(10, 20, 400, 100);ql5.setFont(f1);
		ql6= new JLabel("<html>Query:<br>Increasing the salary of programmers whose<br> salary is less than 1 lakh by 20%.<br><br>Result:</html>");ql6.setBounds(10, 20, 400, 100);ql6.setFont(f1);
		ql7= new JLabel("<html>Query:<br>The id and name of the persons whose name<br> starts with D are required.<br><br>Result:</html>");ql7.setBounds(10, 20, 400, 100);ql7.setFont(f1);
		ql8= new JLabel("<html>Query:<br>The name of the software and month of the clients<br> request where month is greater than 5 are<br> required.<br><br>Result:</html>");ql8.setBounds(10, 20, 400, 120);ql8.setFont(f1);
		ql9= new JLabel("<html>Query:<br>The id of the programmers whose salary is in the<br> range of 1 lakh to 3 lakhs exclusively are<br> required.<br><br>Result:</html>");ql9.setBounds(10, 20, 400, 120);ql9.setFont(f1);
		ql10= new JLabel("<html>Query:<br>The name of the software that both programmers<br> PR1 And PR5 working is required.<br><br>Result:</html>");ql10.setBounds(10, 20, 400, 100);ql10.setFont(f1);
		
		admin.setJMenuBar(M);
		admin.add(p0);admin.add(p1);admin.add(p2);admin.add(p3);
		admin.add(po1);admin.add(po2);admin.add(po3);admin.add(po4);admin.add(po5);admin.add(po6);admin.add(po7);admin.add(po8);admin.add(po9);admin.add(po10);
		p0.setLayout(null);
		p1.setLayout(null);
		p2.setLayout(null);
		p3.setLayout(null);
		po1.setLayout(null);po2.setLayout(null);po3.setLayout(null);po4.setLayout(null);po5.setLayout(null);
		po6.setLayout(null);po7.setLayout(null);po8.setLayout(null);po9.setLayout(null);po10.setLayout(null);
		p0.setVisible(true);
		p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        po1.setVisible(false);po2.setVisible(false);po3.setVisible(false);po4.setVisible(false);po5.setVisible(false);
        po6.setVisible(false);po7.setVisible(false);po8.setVisible(false);po9.setVisible(false);po10.setVisible(false);
        admin.setVisible(true);
        admin.setSize(400,400);admin.setBounds(550, 230, 400, 400);
        admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        admin.setResizable(false);
		ActionListener x=new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {
	        	if(e.getSource()==m1) {
	        		p0.setVisible(false);
	        		p1.setVisible(true);
	                p2.setVisible(false);
	                p3.setVisible(false);
	                po1.setVisible(false);po2.setVisible(false);po3.setVisible(false);po4.setVisible(false);po5.setVisible(false);
	                po6.setVisible(false);po7.setVisible(false);po8.setVisible(false);po9.setVisible(false);po10.setVisible(false);
	        	}
	        	if(e.getSource()==m2) {
	        		p0.setVisible(false);
	        		p1.setVisible(false);
	                p2.setVisible(true);
	                p3.setVisible(false);
	                po1.setVisible(false);po2.setVisible(false);po3.setVisible(false);po4.setVisible(false);po5.setVisible(false);
	                po6.setVisible(false);po7.setVisible(false);po8.setVisible(false);po9.setVisible(false);po10.setVisible(false);
	        	}
	        	if(e.getSource()==m3) {
	        		p0.setVisible(false);
	        		p1.setVisible(false);
	                p2.setVisible(false);
	                p3.setVisible(true);
	                po1.setVisible(false);po2.setVisible(false);po3.setVisible(false);po4.setVisible(false);po5.setVisible(false);
	                po6.setVisible(false);po7.setVisible(false);po8.setVisible(false);po9.setVisible(false);po10.setVisible(false);
	        	}
	        	if(e.getSource()==m4) {
	        		try {
	                    if (s.resultSet != null) s.resultSet.close();
	                    if (s.statement != null) s.statement.close();
	                    if (s.connect != null) s.connect.close();
	                } 
	                catch (Exception e1) {}
	        		finally{
	        			if(JOptionPane.showConfirmDialog(admin,"Are you sure you want to logout?", "Exit?",JOptionPane.YES_NO_OPTION,
		                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
							try {login l = new login();l.log.setVisible(true);}
							catch (SQLException e1) {e1.printStackTrace();}
		        			finally{admin.setVisible(false);}
		        		}
	        		}
	        	}
	        	if(e.getSource()==m5) {
	        		p0.setVisible(true);
	        		p1.setVisible(false);
        	        p2.setVisible(false);
        	        p3.setVisible(false);
        	        po1.setVisible(false);po2.setVisible(false);po3.setVisible(false);po4.setVisible(false);po5.setVisible(false);
        	        po6.setVisible(false);po7.setVisible(false);po8.setVisible(false);po9.setVisible(false);po10.setVisible(false);
	        	}
	        	if(e.getActionCommand()=="Reset") {
        			t1.setText("");
        			t2.setText("");
        			t3.setText("");
	        	}
	        	if(e.getSource()==b1) {
	        		try{
	        			String id=t1.getText();
	        			s.preparedStatement = s.connect.prepareStatement("select client_id,name,addr,street,pincode,phno1,phno2 from Client natural join Person where client_id=?;");
	        	        s.preparedStatement.setString(1,id);
	        	        s.resultSet=s.preparedStatement.executeQuery();
	            		String column[]={"ID" , "Name" , "Address","Street" ,"Pincode" , "Phno1" , "Phno2"}; 
	        	    	String[][] rows=new String[1][7];
	        	    	s.resultSet.next();
        	            rows[0][0] = s.resultSet.getString("client_id");
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
	            		JOptionPane.showMessageDialog(admin,"Search Failed.","Error",JOptionPane.WARNING_MESSAGE);
	            	}
	        	}
	        	if(e.getSource()==b2) {
	        		try{
	        			String id=t2.getText();
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
	        			p2.add(sp);
	            	}catch(Exception e1) {
	            		System.out.println(e1);
	            		JOptionPane.showMessageDialog(admin,"Search Failed.","Error",JOptionPane.WARNING_MESSAGE);
	            	}
	        	}
	        	if(e.getSource()==b3) {
	        		try{
	        			String id=t3.getText();
	        			s.preparedStatement = s.connect.prepareStatement("select client_id,leader_id,sname,status,doc,do_release from Software where sname=?;");
	        	        s.preparedStatement.setString(1,id);
	        	        s.resultSet=s.preparedStatement.executeQuery();
	            		String column[]={"Client id" ,"Leader id", "Name" , "Status", "doc" ,"do_release"}; 
	        	    	String[][] rows=new String[1][6];
	        	    	s.resultSet.next();
        	            rows[0][0] = s.resultSet.getString("client_id");
        	            rows[0][1] = s.resultSet.getString("leader_id");
        	            rows[0][2] = s.resultSet.getString("sname");
        	            rows[0][3] = s.resultSet.getString("status");
        	            rows[0][4] = String.valueOf(s.resultSet.getDate("doc"));
        	            rows[0][5] = String.valueOf(s.resultSet.getDate("do_release"));
	        	    	t=new JTable(rows,column);t.setBackground(Color.white);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,240,400,40);sp.setBackground(Color.cyan);
	        			t.setFocusable(false);
	        			p3.add(sp);
	            	}catch(Exception e1) {
	            		System.out.println(e1);
	            		JOptionPane.showMessageDialog(admin,"Search Failed.","Error",JOptionPane.WARNING_MESSAGE);
	            	}
	        	}
	        	if(e.getSource()==b4) {
	        		try{
	        			s.preparedStatement = s.connect.prepareStatement("select client_id,name,addr,street,pincode,phno1,phno2 from Client natural join Person;");
	        	        s.resultSet=s.preparedStatement.executeQuery();
	        	        int i=0;
	        	    	while (s.resultSet.next()) i++;
	            		String column[]={"ID" , "Name" , "Address","Street" ,"Pincode" , "Phno1" , "Phno2"}; 
	        	    	String[][] rows=new String[i][7];
	        	    	s.resultSet=s.preparedStatement.executeQuery();
	        	    	i=0;
	        	    	while(s.resultSet.next()){
	        	    		rows[i][0] = s.resultSet.getString("client_id");
	        	            rows[i][1] = s.resultSet.getString("name");
	        	            rows[i][2] = s.resultSet.getString("addr");
	        	            rows[i][3] = s.resultSet.getString("street");
	        	            rows[i][4] = s.resultSet.getString("pincode");
	        	            rows[i][5] = String.valueOf(s.resultSet.getLong("phno1"));
	        	            rows[i][6] = String.valueOf(s.resultSet.getLong("phno2"));
	        	            i++;
	        	    	}
	        	    	t=new JTable(rows,column);t.setBackground(Color.white);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,240,400,20*i);sp.setBackground(Color.cyan);
	        			t.setFocusable(false);
	        			p1.add(sp);
	            	}catch(Exception e1) {
	            		System.out.println(e1);
	            		JOptionPane.showMessageDialog(admin,"Search Failed.","Error",JOptionPane.WARNING_MESSAGE);
	            	}
	        	}
	        	if(e.getSource()==b5) {
	        		try{
	        			s.preparedStatement = s.connect.prepareStatement("select prog_id,name,addr,street,pincode,phno1,phno2 from Programmer natural join Person;");
	        	        s.resultSet=s.preparedStatement.executeQuery();
	        	        int i=0;
	        	    	while (s.resultSet.next()) i++;
	            		String column[]={"ID" , "Name" , "Address","Street" ,"Pincode" , "Phno1" , "Phno2"}; 
	        	    	String[][] rows=new String[i][7];
	        	    	s.resultSet=s.preparedStatement.executeQuery();
	        	    	i=0;
	        	    	while(s.resultSet.next()){
	        	    		rows[i][0] = s.resultSet.getString("prog_id");
	        	            rows[i][1] = s.resultSet.getString("name");
	        	            rows[i][2] = s.resultSet.getString("addr");
	        	            rows[i][3] = s.resultSet.getString("street");
	        	            rows[i][4] = s.resultSet.getString("pincode");
	        	            rows[i][5] = String.valueOf(s.resultSet.getLong("phno1"));
	        	            rows[i][6] = String.valueOf(s.resultSet.getLong("phno2"));
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
	            		JOptionPane.showMessageDialog(admin,"Search Failed.","Error",JOptionPane.WARNING_MESSAGE);
	            	}
	        	}
	        	if(e.getSource()==b6) {
	        		try{
	        			s.preparedStatement = s.connect.prepareStatement("select client_id,leader_id,sname,status,doc,do_release from Software;");
	        	        s.resultSet=s.preparedStatement.executeQuery();
	        	        int i=0;
	        	    	while (s.resultSet.next()) i++;
	            		String column[]={"Client id" ,"Leader id", "Name" , "Status", "doc" ,"do_release"}; 
	        	    	String[][] rows=new String[i][6];
	        	    	s.resultSet=s.preparedStatement.executeQuery();
	        	    	i=0;
	        	    	while(s.resultSet.next()){
	        	    		rows[i][0] = s.resultSet.getString("client_id");
	        	            rows[i][1] = s.resultSet.getString("leader_id");
	        	            rows[i][2] = s.resultSet.getString("sname");
	        	            rows[i][3] = s.resultSet.getString("status");
	        	            rows[i][4] = String.valueOf(s.resultSet.getDate("doc"));
	        	            rows[i][5] = String.valueOf(s.resultSet.getDate("do_release"));
	        	            i++;
	        	    	}
	        	    	t=new JTable(rows,column);t.setBackground(Color.white);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,240,400,25*i);sp.setBackground(Color.cyan);
	        			t.setFocusable(false);
	        			p3.add(sp);
	            	}catch(Exception e1) {
	            		System.out.println(e1);
	            		JOptionPane.showMessageDialog(admin,"Search Failed.","Error",JOptionPane.WARNING_MESSAGE);
	            	}
	        	}
	        	if(e.getSource()==q1) {
	        		p0.setVisible(false);
	        		p1.setVisible(false);
        	        p2.setVisible(false);
        	        p3.setVisible(false);
        	        po1.setVisible(true);po2.setVisible(false);po3.setVisible(false);po4.setVisible(false);po5.setVisible(false);
        	        po6.setVisible(false);po7.setVisible(false);po8.setVisible(false);po9.setVisible(false);po10.setVisible(false);
        	        po1.add(ql1);
        	        try{
	        			s.preparedStatement = s.connect.prepareStatement("select prog_id from Prog_lang group by prog_id having count(prog_lang)>2;");
	        	        s.resultSet=s.preparedStatement.executeQuery();
	        	        int i=0;
	        	    	while (s.resultSet.next()) i++;
	            		String column[]={"Programmer id"}; 
	        	    	String[][] rows=new String[i][1];
	        	    	s.resultSet=s.preparedStatement.executeQuery();
	        	    	i=0;
	        	    	while(s.resultSet.next()){
	        	    		rows[i][0] = s.resultSet.getString("prog_id");
	        	            i++;
	        	    	}
	        	    	t=new JTable(rows,column);t.setBackground(Color.white);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,140,400,28*i);sp.setBackground(Color.cyan);
	        			t.setFocusable(false);
	        			po1.add(sp);
	            	}catch(Exception e1) { }
	        	}
	        	if(e.getSource()==q2) {
	        		p0.setVisible(false);
	        		p1.setVisible(false);
        	        p2.setVisible(false);
        	        p3.setVisible(false);
        	        po1.setVisible(false);po2.setVisible(true);po3.setVisible(false);po4.setVisible(false);po5.setVisible(false);
        	        po6.setVisible(false);po7.setVisible(false);po8.setVisible(false);po9.setVisible(false);po10.setVisible(false);
        	        po2.add(ql2);
        	        try{
	        			s.preparedStatement = s.connect.prepareStatement("select sname,leader_id from Software order by doc;");
	        	        s.resultSet=s.preparedStatement.executeQuery();
	        	        int i=0;
	        	    	while (s.resultSet.next()) i++;
	            		String column[]={"Software name","Leader id"}; 
	        	    	String[][] rows=new String[i][2];
	        	    	s.resultSet=s.preparedStatement.executeQuery();
	        	    	i=0;
	        	    	while(s.resultSet.next()){
	        	    		rows[i][0] = s.resultSet.getString("sname");
	        	            rows[i][1] = s.resultSet.getString("leader_id");
	        	            i++;
	        	    	}
	        	    	t=new JTable(rows,column);t.setBackground(Color.white);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,140,400,20*i);sp.setBackground(Color.cyan);
	        			t.setFocusable(false);
	        			po2.add(sp);
	            	}catch(Exception e1) { }
	        	}
	        	if(e.getSource()==q3) {
	        		p0.setVisible(false);
	        		p1.setVisible(false);
        	        p2.setVisible(false);
        	        p3.setVisible(false);
        	        po1.setVisible(false);po2.setVisible(false);po3.setVisible(true);po4.setVisible(false);po5.setVisible(false);
        	        po6.setVisible(false);po7.setVisible(false);po8.setVisible(false);po9.setVisible(false);po10.setVisible(false);
        	        po3.add(ql3);
        	        try{
	        			s.preparedStatement = s.connect.prepareStatement("select client_id,name,addr,street,pincode,phno1,phno2 from Person natural join Client where client_id='CL01';");
	        	        s.resultSet=s.preparedStatement.executeQuery();
	        	        String column[]={"ID" , "Name" , "Address","Street" ,"Pincode" , "Phno1" , "Phno2"}; 
	        	    	String[][] rows=new String[1][7];
	        	    	s.resultSet.next();
        	            rows[0][0] = s.resultSet.getString("client_id");
        	            rows[0][1] = s.resultSet.getString("name");
        	            rows[0][2] = s.resultSet.getString("addr");
        	            rows[0][3] = s.resultSet.getString("street");
        	            rows[0][4] = s.resultSet.getString("pincode");
        	            rows[0][5] = String.valueOf(s.resultSet.getLong("phno1"));
        	            rows[0][6] = String.valueOf(s.resultSet.getLong("phno2"));
	        	    	t=new JTable(rows,column);t.setBackground(Color.white);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,140,400,40);sp.setBackground(Color.cyan);
	        			t.setFocusable(false);
	        			po3.add(sp);
	            	}catch(Exception e1) { }
	        	}
	        	if(e.getSource()==q4) {
	        		p0.setVisible(false);
	        		p1.setVisible(false);
        	        p2.setVisible(false);
        	        p3.setVisible(false);
        	        po1.setVisible(false);po2.setVisible(false);po3.setVisible(false);po4.setVisible(true);po5.setVisible(false);
        	        po6.setVisible(false);po7.setVisible(false);po8.setVisible(false);po9.setVisible(false);po10.setVisible(false);
        	        po4.add(ql4);
        	        try{
	        			s.preparedStatement = s.connect.prepareStatement("select sname,count(prog_id) from Developed_by group by sname;");
	        	        s.resultSet=s.preparedStatement.executeQuery();
	        	        int i=0;
	        	    	while (s.resultSet.next()) i++;
	            		String column[]={"Software name","No. of Employees"}; 
	        	    	String[][] rows=new String[i][2];
	        	    	s.resultSet=s.preparedStatement.executeQuery();
	        	    	i=0;
	        	    	while(s.resultSet.next()){
	        	            rows[i][0] = s.resultSet.getString("sname");
	        	            rows[i][1] = String.valueOf(s.resultSet.getInt("count"));
	        	            i++;
	        	    	}
	        	    	t=new JTable(rows,column);t.setBackground(Color.white);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,140,400,22*i);sp.setBackground(Color.cyan);
	        			t.setFocusable(false);
	        			po4.add(sp);
	            	}catch(Exception e1) { }
	        	}
	        	if(e.getSource()==q5) {
	        		p0.setVisible(false);
	        		p1.setVisible(false);
        	        p2.setVisible(false);
        	        p3.setVisible(false);
        	        po1.setVisible(false);po2.setVisible(false);po3.setVisible(false);po4.setVisible(false);po5.setVisible(true);
        	        po6.setVisible(false);po7.setVisible(false);po8.setVisible(false);po9.setVisible(false);po10.setVisible(false);
        	        po5.add(ql5);
        	        try{
	        			s.preparedStatement = s.connect.prepareStatement("select sname from Software where status='Completed';");
	        	        s.resultSet=s.preparedStatement.executeQuery();
	        	        int i=0;
	        	    	while (s.resultSet.next()) i++;
	            		String column[]={"Software Name"}; 
	        	    	String[][] rows=new String[i][1];
	        	    	s.resultSet=s.preparedStatement.executeQuery();
	        	    	i=0;
	        	    	while(s.resultSet.next()){
	        	    		rows[i][0] = s.resultSet.getString("sname");
	        	            i++;
	        	    	}
	        	    	t=new JTable(rows,column);t.setBackground(Color.white);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,140,400,40*i);sp.setBackground(Color.cyan);
	        			t.setFocusable(false);
	        			po5.add(sp);
	            	}catch(Exception e1) { }
	        	}
	        	if(e.getSource()==q6) {
	        		p0.setVisible(false);
	        		p1.setVisible(false);
        	        p2.setVisible(false);
        	        p3.setVisible(false);
        	        po1.setVisible(false);po2.setVisible(false);po3.setVisible(false);po4.setVisible(false);po5.setVisible(false);
        	        po6.setVisible(true);po7.setVisible(false);po8.setVisible(false);po9.setVisible(false);po10.setVisible(false);
        	        po6.add(ql6);
        	        try{
	        			s.preparedStatement = s.connect.prepareStatement("update Programmer set salary=salary*1.2 where salary<100000;");
	        			s.preparedStatement.executeUpdate();
	        			s.preparedStatement = s.connect.prepareStatement("select prog_id,salary from Programmer salary<100000;");
	        			s.resultSet=s.preparedStatement.executeQuery();
	        	        int i=0;
	        	    	while (s.resultSet.next()) i++;
	            		String column[]={"Programmer id"}; 
	        	    	String[][] rows=new String[i][2];
	        	    	s.resultSet=s.preparedStatement.executeQuery();
	        	    	i=0;
	        	    	while(s.resultSet.next()){
	        	    		rows[i][0] = s.resultSet.getString("prog_id");
	        	            rows[i][1] = String.valueOf(s.resultSet.getFloat("salary"));
	        	            i++;
	        	    	}
	        	    	t=new JTable(rows,column);t.setBackground(Color.white);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,140,400,20*i);sp.setBackground(Color.cyan);
	        			t.setFocusable(false);
	        			po6.add(sp);
	            	}catch(Exception e1) { }
	        	}
	        	if(e.getSource()==q7) {
	        		p0.setVisible(false);
	        		p1.setVisible(false);
        	        p2.setVisible(false);
        	        p3.setVisible(false);
        	        po1.setVisible(false);po2.setVisible(false);po3.setVisible(false);po4.setVisible(false);po5.setVisible(false);
        	        po6.setVisible(false);po7.setVisible(true);po8.setVisible(false);po9.setVisible(false);po10.setVisible(false);
        	        po7.add(ql7);
        	        try{
	        			s.preparedStatement = s.connect.prepareStatement("select id,name from Person where name like 'D%';");
	        	        s.resultSet=s.preparedStatement.executeQuery();
	        	        int i=0;
	        	    	while (s.resultSet.next()) i++;
	            		String column[]={"ID","Name"}; 
	        	    	String[][] rows=new String[i][2];
	        	    	s.resultSet=s.preparedStatement.executeQuery();
	        	    	i=0;
	        	    	while(s.resultSet.next()){
	        	    		rows[i][0] = s.resultSet.getString("id");
	        	            rows[i][1] = s.resultSet.getString("name");
	        	            i++;
	        	    	}
	        	    	t=new JTable(rows,column);t.setBackground(Color.white);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,140,400,28*i);sp.setBackground(Color.cyan);
	        			t.setFocusable(false);
	        			po7.add(sp);
	            	}catch(Exception e1) { }
	        	}
	        	if(e.getSource()==q8) {
	        		p0.setVisible(false);
	        		p1.setVisible(false);
        	        p2.setVisible(false);
        	        p3.setVisible(false);
        	        po1.setVisible(false);po2.setVisible(false);po3.setVisible(false);po4.setVisible(false);po5.setVisible(false);
        	        po6.setVisible(false);po7.setVisible(false);po8.setVisible(true);po9.setVisible(false);po10.setVisible(false);
        	        po8.add(ql8);
        	        try{
	        			s.preparedStatement = s.connect.prepareStatement("select sname,to_char(do_request,'Month') from Client natural join Software where extract(month from do_request)>5;");
	        	        s.resultSet=s.preparedStatement.executeQuery();
	        	        int i=0;
	        	    	while (s.resultSet.next()) i++;
	            		String column[]={"Software Name","Request Month"}; 
	        	    	String[][] rows=new String[i][2];
	        	    	s.resultSet=s.preparedStatement.executeQuery();
	        	    	i=0;
	        	    	while(s.resultSet.next()){
	        	    		rows[i][0] = s.resultSet.getString("sname");
	        	            rows[i][1] = s.resultSet.getString("to_char");
	        	            i++;
	        	    	}
	        	    	t=new JTable(rows,column);t.setBackground(Color.white);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,160,400,28*i);sp.setBackground(Color.cyan);
	        			t.setFocusable(false);
	        			po8.add(sp);
	            	}catch(Exception e1) { }
	        	}
	        	if(e.getSource()==q9) {
	        		p0.setVisible(false);
	        		p1.setVisible(false);
        	        p2.setVisible(false);
        	        p3.setVisible(false);
        	        po1.setVisible(false);po2.setVisible(false);po3.setVisible(false);po4.setVisible(false);po5.setVisible(false);
        	        po6.setVisible(false);po7.setVisible(false);po8.setVisible(false);po9.setVisible(true);po10.setVisible(false);
        	        po9.add(ql9);
        	        try{
	        			s.preparedStatement = s.connect.prepareStatement("select prog_id from Programmer where salary between 100000 and 300000;");
	        	        s.resultSet=s.preparedStatement.executeQuery();
	        	        int i=0;
	        	    	while (s.resultSet.next()) i++;
	            		String column[]={"Programmer id"}; 
	        	    	String[][] rows=new String[i][1];
	        	    	s.resultSet=s.preparedStatement.executeQuery();
	        	    	i=0;
	        	    	while(s.resultSet.next()){
	        	    		rows[i][0] = s.resultSet.getString("prog_id");
	        	            i++;
	        	    	}
	        	    	t=new JTable(rows,column);t.setBackground(Color.white);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,160,400,22*i);sp.setBackground(Color.cyan);
	        			t.setFocusable(false);
	        			po9.add(sp);
	            	}catch(Exception e1) { }
	        	}
	        	if(e.getSource()==q10) {
	        		p0.setVisible(false);
	        		p1.setVisible(false);
        	        p2.setVisible(false);
        	        p3.setVisible(false);
        	        po1.setVisible(false);po2.setVisible(false);po3.setVisible(false);po4.setVisible(false);po5.setVisible(false);
        	        po6.setVisible(false);po7.setVisible(false);po8.setVisible(false);po9.setVisible(false);po10.setVisible(true);
        	        po10.add(ql10);
        	        try{
	        			s.preparedStatement = s.connect.prepareStatement("(select sname from Developed_by where prog_id='PR1') intersect (select sname from Developed_by where prog_id='PR5');");
	        	        s.resultSet=s.preparedStatement.executeQuery();
	        	        int i=0;
	        	    	while (s.resultSet.next()) i++;
	            		String column[]={"Software name"}; 
	        	    	String[][] rows=new String[i][1];
	        	    	s.resultSet=s.preparedStatement.executeQuery();
	        	    	i=0;
	        	    	while(s.resultSet.next()){
	        	    		rows[i][0] = s.resultSet.getString("sname");
	        	            i++;
	        	    	}
	        	    	t=new JTable(rows,column);t.setBackground(Color.white);
	        	        JTableHeader tableHeader = t.getTableHeader();
	        	        tableHeader.setBackground(Color.orange);
	        			JScrollPane sp=new JScrollPane(t);sp.setBounds(0,140,400,40*i);sp.setBackground(Color.cyan);
	        			t.setFocusable(false);
	        			po10.add(sp);
	            	}catch(Exception e1) { }
	        	}
	        }
		};
		m5.addActionListener(x);
		m4.addActionListener(x);
		m1.addActionListener(x);
	    m2.addActionListener(x);
	    m3.addActionListener(x);
	    br1.addActionListener(x);
	    b1.addActionListener(x);
	    br2.addActionListener(x);
	    b2.addActionListener(x);
	    br3.addActionListener(x);
	    b3.addActionListener(x);
	    b4.addActionListener(x);
	    b5.addActionListener(x);
	    b6.addActionListener(x);
	    q1.addActionListener(x);
	    q2.addActionListener(x);
	    q3.addActionListener(x);
	    q4.addActionListener(x);
	    q5.addActionListener(x);
	    q6.addActionListener(x);
	    q7.addActionListener(x);
	    q8.addActionListener(x);
	    q9.addActionListener(x);
	    q10.addActionListener(x);
	}
}