/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myhospital;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Administrator
 */
public class RoomJFrame extends javax.swing.JFrame {

    /**
     * Creates new form RoomJFrame
     */
    
     private String SelectQueryFieldStr = "病患编号";
     private static DBProcess db = null;
     private Vector mainVector = null;
     private Vector titleVector = null;
     private Vector mainVector2 = null;
     private Vector titleVector2 = null;
     private String name = "xx";
     private String room = "xx";
     private String sPAT_NO = null;
     private String sPC_STATE = null;
    
    public RoomJFrame() {
        db = new DBProcess();
        initComponents();
        mainVector = new Vector();
        titleVector = new Vector();
        mainVector2 = new Vector();
        titleVector2 = new Vector();
        titleVector.add("病患编号");
	titleVector.add("姓名");
	titleVector.add("性别");
        titleVector.add("科室");
        titleVector.add("主治医生");
        titleVector2.add("病房号");
        titleVector2.add("占用情况");
        queryAllRoomsProcess();
        queryAllProcess();
        
        jL_Hello.setText("欢迎您！"+HosLoginJDialog.DEPT_NAME_True+"："+HosLoginJDialog.PAS_USER_True);
        setLocationRelativeTo(null);
        setB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Room1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Room2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTF_QueryField = new javax.swing.JTextField();
        jB_Query = new javax.swing.JButton();
        jB_QueryAll = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTF_Date1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTF_Date2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTF_Date3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jL_Room = new javax.swing.JLabel();
        jB_CheckIn = new javax.swing.JButton();
        jL_Hello = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu_Main = new javax.swing.JMenu();
        jMenu_Login = new javax.swing.JMenu();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 550));

        jTable_Room1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "病患编号", "姓名", "性别", "科室", "主治医生"
            }
        ));
        jTable_Room1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Room1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Room1);

        jTable_Room2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "病房号", "占用状况"
            }
        ));
        jTable_Room2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Room2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Room2);
        jTable_Room2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel1.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel1.setText("未登记住院的病患");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel2.setText("病房空闲情况");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel3.setText("查询并登记入住");

        jLabel4.setText("查询方式");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "编号", "病患姓名", "科室", "主治医生" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel5.setText("=");

        jB_Query.setText("查询");
        jB_Query.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_QueryActionPerformed(evt);
            }
        });

        jB_QueryAll.setText("显示全部病患");
        jB_QueryAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_QueryAllActionPerformed(evt);
            }
        });

        jLabel6.setText("请点击一个左表中的病患和一个右表的病房，登记住院...");

        jTF_Date1.setText("2018");

        jLabel7.setText("年");

        jTF_Date2.setText("12");

        jLabel8.setText("月");

        jTF_Date3.setText("27");

        jLabel9.setText("日");

        jL_Room.setText("为xx病患登记入住xx病房");

        jB_CheckIn.setText("确定入住病房");
        jB_CheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CheckInActionPerformed(evt);
            }
        });

        jL_Hello.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jL_Hello.setText("欢迎您！");

        jLabel10.setFont(new java.awt.Font("微软雅黑", 0, 30)); // NOI18N
        jLabel10.setText("病房管理");

        jMenuBar1.setMinimumSize(new java.awt.Dimension(70, 35));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(70, 35));

        jMenu1.setText("窗口切换");
        jMenu1.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N

        jMenu_Main.setText("回到主菜单");
        jMenu_Main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_MainMouseClicked(evt);
            }
        });
        jMenu1.add(jMenu_Main);

        jMenu_Login.setText("切换账户");
        jMenu_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_LoginMouseClicked(evt);
            }
        });
        jMenu1.add(jMenu_Login);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(216, 216, 216))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(135, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jL_Hello, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel3)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_QueryField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Query)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_QueryAll))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTF_Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Date3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jB_CheckIn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jL_Hello))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTF_QueryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Query)
                    .addComponent(jB_QueryAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTF_Date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTF_Date2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTF_Date3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jL_Room))
                .addGap(18, 18, 18)
                .addComponent(jB_CheckIn)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        switch (evt.getStateChange()) {  
                case ItemEvent.SELECTED:  
                	SelectQueryFieldStr = (String) evt.getItem();  
                        System.out.println("选中：" + SelectQueryFieldStr);  
                        break;  
                case ItemEvent.DESELECTED:  
                        System.out.println("取消选中：" + evt.getItem());  
                        break;  
        }
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jB_QueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_QueryActionPerformed
        // TODO add your handling code here:
        //设置sql语句
        String sqlWord = jTF_QueryField.getText().trim();
        String sql = null;
        sql = "USE MyHospital; " +
              "SELECT PATIENT.PAT_NO,PAT_NAME,PAT_SEX,DEPT.DEPT_NAME,EMP_NAME " +
              "FROM PATIENT,PATIENT_CURE,EMPLOYEE,DEPT " +
              "WHERE PATIENT.PAT_NO=PATIENT_CURE.PAT_NO AND PATIENT_CURE.EMP_NO=EMPLOYEE.EMP_NO AND PATIENT_CURE.DEPT_NO=DEPT.DEPT_NO " +
              "AND PATIENT.PAT_NO NOT IN(SELECT PAT_NO " +
              "FROM CHECK_IN) " ;
        if(SelectQueryFieldStr.equals("编号")){
            sql += "AND PATIENT.PAT_NO='" + sqlWord + "';"; 
        }
        else if(SelectQueryFieldStr.equals("科室")){
            sql += "AND DEPT_NAME='" + sqlWord + "';";
        }
        else if(SelectQueryFieldStr.equals("病患姓名")){
            sql += "AND PAT_NAME='" + sqlWord + "';";
        }
        else if(SelectQueryFieldStr.equals("主治医生")){
            sql += "AND EMP_NAME='" + sqlWord + "';";
        }
        
        //连接并获取数据
        db.connect();
        ResultSet rs = null;
        rs = db.executeQuery(sql);
        
        //将数据展示到表格上
        try {
            DefaultTableModel dtm = (DefaultTableModel)jTable_Room1.getModel();
            mainVector.clear();
            while(rs.next()){
                Vector v = new Vector();
		v.add(rs.getString("PAT_NO"));
		v.add(rs.getString("PAT_NAME"));
                if(rs.getString("PAT_SEX").equals("1"))
                    v.add("女");
                else
                    v.add("男");
                v.add(rs.getString("DEPT_NAME"));
		v.add(rs.getString("EMP_NAME"));
                mainVector.add(v);
            }

            dtm.setDataVector(mainVector, titleVector);
            jTable_Room1.updateUI();
                
        } catch (SQLException ex) {
            System.out.println("SQLError.sql = " + sql);
            Logger.getLogger(CureJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //将查询框内容置空
        jTF_QueryField.setText("");
    }//GEN-LAST:event_jB_QueryActionPerformed

    private void jB_QueryAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_QueryAllActionPerformed
        // TODO add your handling code here:
        queryAllProcess();
    }//GEN-LAST:event_jB_QueryAllActionPerformed

    private void jTable_Room1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Room1MouseClicked
        // TODO add your handling code here:
        int row = ((JTable) evt.getSource()).rowAtPoint(evt.getPoint()); // 获得行位置
	System.out.println("Room1_mouseClicked(). row = " + row);
	Vector v = new Vector();
	v = (Vector) mainVector.get(row);
        
        name = (String) v.get(1);
        sPAT_NO = (String) v.get(0);
        jL_Room.setText("为【" + name+ "】病患登记入住【" + room + "】病房");     
    }//GEN-LAST:event_jTable_Room1MouseClicked

    private void jTable_Room2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Room2MouseClicked
        // TODO add your handling code here:
        int row = ((JTable) evt.getSource()).rowAtPoint(evt.getPoint()); // 获得行位置
	System.out.println("Room2_mouseClicked(). row = " + row);
	Vector v = new Vector();
	v = (Vector) mainVector2.get(row);
        
        room = (String) v.get(0);
        sPC_STATE = (String) v.get(1);
        if(sPC_STATE.equals("空闲"))
            sPC_STATE = "1";
        else
            sPC_STATE = "0";
        jL_Room.setText("为【" + name+ "】病患登记入住【" + room + "】病房");   
    }//GEN-LAST:event_jTable_Room2MouseClicked

    private void jB_CheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CheckInActionPerformed
        // TODO add your handling code here:
        //insert&UPDATE 
        String sql = null;
        
        if(sPAT_NO.isEmpty() || room.equals("xx") ){
            JOptionPane.showMessageDialog(null,"请选择病患和入住病床","错误",JOptionPane.ERROR_MESSAGE);
        }
        else if(sPC_STATE.equals("0")){
            JOptionPane.showMessageDialog(null,"请选择空闲的病床","错误",JOptionPane.ERROR_MESSAGE);
        }
        else{
            //SQL
            String sPR_NO = room;
            String sCI_DATE = null;
            sCI_DATE = jTF_Date1.getText() +"-"+ jTF_Date2.getText() +"-"+ jTF_Date3.getText();
            sql = "USE MyHospital; INSERT INTO CHECK_IN (PAT_NO,PR_NO,CI_DATE) " +
                  //"VALUES('1812210065','0002','2018-12-27'); ";
                  "VALUES('"+sPAT_NO+"','"+sPR_NO+"','"+sCI_DATE+"'); ";
            System.out.println("insertProcess(). sql = " + sql);
            
            //连接并获取数据
            db.connect();
            
            //操作
            try{
			if (db.executeUpdate(sql) < 1) {
				System.out.println("insertProcess(). insert database failed.");
			}
		}catch(Exception e){
			System.out.println("e = " + e);
			JOptionPane.showMessageDialog(null,"数据操作错误","错误",JOptionPane.ERROR_MESSAGE);
		}
            
            ///////////////////////////////////UPDATE//////////////////////////////////////////////////////////////
            //SQL
            sql = "UPDATE PATIENT_ROOM SET PR_STATE=0 " +
                  "WHERE PR_NO='"+sPR_NO+"';";
            System.out.println("updateProcess.sql = "+sql);
            
            //执行
            try{
		if (db.executeUpdate(sql) < 1) {
			System.out.println("updateProcess(). update database failed.");
		}
	    }catch(Exception e){
		System.out.println("e = " + e);
		JOptionPane.showMessageDialog(null,"数据操作错误","错误",JOptionPane.ERROR_MESSAGE);
	    }            

            queryAllRoomsProcess();
            queryAllProcess(); 
        } 
    }//GEN-LAST:event_jB_CheckInActionPerformed

    private void jMenu_MainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_MainMouseClicked
        // TODO add your handling code here:
        new HospitalJFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu_MainMouseClicked

    private void jMenu_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_LoginMouseClicked
        // TODO add your handling code here:
        new HosLoginJDialog().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu_LoginMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RoomJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomJFrame().setVisible(true);
            }
        });
    }
    
    private void queryAllProcess(){
        //设置sql语句
        String sql = null;
        sql = "USE MyHospital; " +
              "SELECT PATIENT.PAT_NO,PAT_NAME,PAT_SEX,DEPT.DEPT_NAME,EMP_NAME " +
              "FROM PATIENT,PATIENT_CURE,EMPLOYEE,DEPT " +
              "WHERE PATIENT.PAT_NO=PATIENT_CURE.PAT_NO AND PATIENT_CURE.EMP_NO=EMPLOYEE.EMP_NO AND PATIENT_CURE.DEPT_NO=DEPT.DEPT_NO " +
              "AND PATIENT.PAT_NO NOT IN(SELECT PAT_NO " +
              "FROM CHECK_IN); ";

        //连接并获取数据
        db.connect();
        ResultSet rs = null;
        rs = db.executeQuery(sql);
        
        //将数据展示到表格上
        try {
            DefaultTableModel dtm = (DefaultTableModel)jTable_Room1.getModel();
            mainVector.clear();
            while(rs.next()){
                Vector v = new Vector();
		v.add(rs.getString("PAT_NO"));
		v.add(rs.getString("PAT_NAME"));
                if(rs.getString("PAT_SEX").equals("1"))
                    v.add("女");
                else
                    v.add("男");
                v.add(rs.getString("DEPT_NAME"));
		v.add(rs.getString("EMP_NAME"));
                mainVector.add(v);
            }

            dtm.setDataVector(mainVector, titleVector);
            jTable_Room1.updateUI();
        } catch (SQLException ex) {
            System.out.println("SQLError.sql = " + sql);
            Logger.getLogger(CureJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void queryAllRoomsProcess(){
        //设置sql语句
        String sql = null;
        sql = "USE MyHospital;SELECT * FROM PATIENT_ROOM;";
        
        //连接并获取数据
        db.connect();
        ResultSet rs = null;
        rs = db.executeQuery(sql);
        
        //将数据展示到表格上
        try {
            DefaultTableModel dtm = (DefaultTableModel)jTable_Room2.getModel();
            mainVector2.clear();
            while(rs.next()){
                Vector v = new Vector();
                v.add(rs.getString("PR_NO"));
                if(rs.getString("PR_STATE").equals("1"))
                    v.add("空闲");
                else
                    v.add("使用中");
                mainVector2.add(v);
            }
        
            dtm.setDataVector(mainVector2, titleVector2);
            jTable_Room2.updateUI();
            
        } catch (SQLException ex) {
            System.out.println("SQLError.sql = " + sql);
            Logger.getLogger(CureJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setB(){
         ImageIcon img = new ImageIcon("F:/UsingItems/MyHospital/back.jpg");//这是背景图片////////////////////////////////
         JLabel imgLabel = new JLabel(img);//将背景图放在标签里。
           this.getLayeredPane().add(imgLabel, new Integer(Integer.MIN_VALUE));//注意这里是关键，将背景标签添加到jfram的LayeredPane面板里。
           imgLabel.setBounds(0,0,img.getIconWidth(), img.getIconHeight());//设置背景标签的位置
           Container cp=this.getContentPane();
           cp.setLayout(new BorderLayout());
           ((JPanel)cp).setOpaque(false); //注意这里，将内容面板设为透明。这样LayeredPane面板中的背景才能显示出来。
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_CheckIn;
    private javax.swing.JButton jB_Query;
    private javax.swing.JButton jB_QueryAll;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jL_Hello;
    private javax.swing.JLabel jL_Room;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu_Login;
    private javax.swing.JMenu jMenu_Main;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTF_Date1;
    private javax.swing.JTextField jTF_Date2;
    private javax.swing.JTextField jTF_Date3;
    private javax.swing.JTextField jTF_QueryField;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable_Room1;
    private javax.swing.JTable jTable_Room2;
    // End of variables declaration//GEN-END:variables
}

