/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companymanagement;

import Employeepanales.UpdateEmployee;
import static companymanagement.Conn.CreateConnection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author home
 */
public class Support {
     public static  PreparedStatement pstmt =null;
public static  Statement stmt =null;
   public static ResultSet rs = null ;
      /*  public static  void dml (String str ) throws SQLException, ClassNotFoundException{
    
       try{
            companymanagement.Conn.CreateConnection();
        Statement stt = companymanagement.Conn.CreateConnection().createStatement();
           stt.executeUpdate(str);
             JOptionPane.showMessageDialog(null, "done");}
       catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
             companymanagement.Conn.CreateConnection().close();}

    }*/


        
        
        
        
    //function to get String from sql
   public static void ex(String query) throws SQLException, ClassNotFoundException {
       
        
       

            CreateConnection().isClosed();
            CreateConnection();
           stmt= CreateConnection().createStatement();
            rs = stmt.executeQuery(query); 
           // stmt.close();
          //  rs.close();
              CreateConnection().close();                           
        }
     
       
  
      
          
     
     


    
    
    
    
    
//function to build Jtable from sql query
        public static  void exec (JTable table , String query ){
            Statement st = null;
             ResultSet rs = null;
    try
    {
        CreateConnection().isClosed();      
            st =  (Statement) CreateConnection().createStatement();
    
    rs = st.executeQuery(query);
    System.out.println("Result set");
   table.setModel(DbUtils.resultSetToTableModel(rs));
   JOptionPane.showMessageDialog(null, "tabled");
   System.out.println("tabled");
   rs.close();
CreateConnection().close();
  
    }
    catch(Exception ex)
    {
    JOptionPane.showMessageDialog(null, ex.toString());
    }
          finally {
 
    try {
        rs.close();
        st.close();
       // <-- This is important
    } catch (SQLException e) {
      /* handle exception */
    }                    
    } 
}
        
        
        
        
 /*       
public static void ud() throws ClassNotFoundException, SQLException{
      String selectSQL = "select first_name, last_name, salary,hire_date, manager_id from employee where employee_id =  ?";

Conn.CreateConnection();
            PreparedStatement preparedStatement = Conn.CreateConnection().prepareStatement(selectSQL);
preparedStatement.setInt(1, Integer.parseInt(UpdateEmployee.getText()));

// execute select SQL stetement
ResultSet rs = preparedStatement.executeQuery();

try {
  while (rs.next()) {
      
    String first_name0 = rs.getString("first_name");
    String last_name0 = rs.getString("last_name");
String salary0 = rs.getString("salary");
String hire_date0 = rs.getString("hire_date");
int manager_id0 = Integer.parseInt(rs.getString("manager_id"));
String department_name0 = rs.getString("department_name");

  }

  } catch (SQLException e1) {
    // TODO Auto-generated catch block
    e1.printStackTrace();
  } finally {
    preparedStatement.close();
    Conn.CreateConnection().close();
  }  }*/
        
   

 public  static void insert(int a2,String b2,String c2, int d2,int e2,int f2,String g2,String h2, String i2 ,String z2) {
         try {
             rs.close();
         CreateConnection().isClosed();
             String sql = "INSERT INTO employee(employee_id,first_name,last_name,salary ,department_id,manager_id,hire_date,gender,img,email) VALUES(?,?,?,?,?,?,?,?,?,?)";           
             pstmt =  CreateConnection().prepareStatement(sql); {
             pstmt.setString(2, b2);            pstmt.setString(3,c2 );
             pstmt.setInt(1, a2); pstmt.setInt(4, d2);pstmt.setInt(5, e2);pstmt.setInt(6, f2);
             pstmt.setString(7, g2);    pstmt.setString(8, h2);     pstmt.setString(9, i2);  pstmt.setString(10, z2);
             
             pstmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "Inserted");
             pstmt.close();
             CreateConnection().close();                        
         }                                     
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
         }
    
 }
 
  public  static void update(int a,String b,String c, int d,int e,int f,String g,String h2 ,String i ) {
       try {
              rs.close();
          CreateConnection().isClosed();
           String sql = "update  employee set employee_id = ?,"
                   + "first_name = ? ,last_name = ?,salary = ? ,department_id = ? ,manager_id = ?,hire_date= ?,gender = ?,img = ?  where employee_id = ? ";                              
          pstmt =  CreateConnection().prepareStatement(sql) ;{
           pstmt.setString(2, b);            pstmt.setString(3,c );
           pstmt.setInt(1, a); pstmt.setInt(4, d);pstmt.setInt(5, e);pstmt.setInt(6, f);
           pstmt.setString(7, g);    pstmt.setString(8, h2);     pstmt.setString(9, i);
           pstmt.setInt(10, a);
           
           
           
           pstmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Updated");
           pstmt.close();
           CreateConnection().close();
           
       }                                    
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
       }
  }
 
  
  
   public  static void delete( int x) {
         try {
                 rs.close();
             CreateConnection().isClosed();
             JOptionPane.showConfirmDialog(null, "Are you sure you want to delete ?");
             String sql = "delete from  employee  where employee_id = ?";                                    
             pstmt =  CreateConnection().prepareStatement(sql); {                         
             pstmt.setInt(1, x);            
             pstmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "Deleted");
             pstmt.close();
             CreateConnection().close();
             
         }    } catch (ClassNotFoundException ex) {
             Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
         }
   }
 
 
 
  public  static void insertmail(int a2,String b2,String c2, String d2,String e2,String f2 ) {
         try {
           
         CreateConnection().isClosed();
             String sql = "INSERT INTO email(email_id,send_to,cc,subject,message ,date) VALUES(?,?,?,?,?,?)";           
             pstmt =  CreateConnection().prepareStatement(sql); {
             pstmt.setString(2, b2);            pstmt.setString(3,c2 );
             pstmt.setInt(1, a2); pstmt.setString(4, d2);  pstmt.setString(5, e2);
              pstmt.setString(6 ,f2);
             
             pstmt.executeUpdate();
            // JOptionPane.showMessageDialog(null, "Message sent successfully....");
             pstmt.close();
             CreateConnection().close();                        
         }                                     
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
         }
    
 }
 
  /*public  static void updatemail(int a2,String b2,String c2, String d2,String e2 ) {
       try {
              rs.close();
          CreateConnection().isClosed();
           String sql = "update  email set email_id = ? ,to = ?,"
                   + "cc = ? ,subject = ?,message = ?  where email_id = ? ";                              
          pstmt =  CreateConnection().prepareStatement(sql) ;{
          pstmt.setString(2, b2);            pstmt.setString(3,c2 );
             pstmt.setInt(1, a2); pstmt.setString(4, d2);  pstmt.setString(5, e2); pstmt.setInt(6, a2);
           
           
           
           pstmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Updated");
           pstmt.close();
           CreateConnection().close();
           
       }                                    
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
       }
  }
 
  
  
   public  static void deletemail( int x) {
         try {
                 rs.close();
             CreateConnection().isClosed();
             String sql = "delete from  email  where email_id = ?";                                    
             pstmt =  CreateConnection().prepareStatement(sql); {                         
             pstmt.setInt(1, x);            
             pstmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "Deleted");
             pstmt.close();
             CreateConnection().close();
             
         }    } catch (ClassNotFoundException ex) {
             Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
         }
   }*/
 

  public  static void insertCustomer(int a2,String b2,String c2, String d2, String e2, String f2,String g2) {
         try {
             rs.close();
         CreateConnection().isClosed();
             String sql = "INSERT INTO customer(customer_id,first_name,last_name,address_state ,email_address,gender,img) VALUES(?,?,?,?,?,?,?);";           
             pstmt =  CreateConnection().prepareStatement(sql); {
             pstmt.setString(2, b2);            pstmt.setString(3,c2 );
             pstmt.setInt(1, a2); pstmt.setString(4, d2);pstmt.setString(5, e2);pstmt.setString(6, f2);
             pstmt.setString(7, g2);   
             
             pstmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "Inserted");
             pstmt.close();
             CreateConnection().close();                        
         }                                     
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
         }
    
 }
 
  public  static void updateCustomer(int a2,String b2,String c2, String d2, String e2, String f2,String g2 ) {
       try {
              rs.close();
          CreateConnection().isClosed();
           String sql = "update  customer set customer_id = ?,"
                   + "first_name = ? ,last_name = ?,address_state = ? ,email_address = ? ,gender = ?,img = ?  where customer_id = ? ";                              
          pstmt =  CreateConnection().prepareStatement(sql) ;{
          pstmt.setString(2, b2);            pstmt.setString(3,c2 );
             pstmt.setInt(1, a2); pstmt.setString(4, d2);pstmt.setString(5, e2);pstmt.setString(6, f2);
             pstmt.setString(7, g2);    pstmt.setInt(8, a2);
            pstmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Updated");
           pstmt.close();
           CreateConnection().close();
           
       }                                    
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
       }
  }
 
  
  
   public  static void deleteCustomer( int x) {
         try {
                 rs.close();
             CreateConnection().isClosed();
             JOptionPane.showConfirmDialog(null, "Are you want to delete ?");
             String sql = "delete from  customer  where customer_id = ?";                                    
             pstmt =  CreateConnection().prepareStatement(sql); {                         
             pstmt.setInt(1, x);            
             pstmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "Deleted");
             pstmt.close();
             CreateConnection().close();
             
         }    } catch (ClassNotFoundException ex) {
             Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(Support.class.getName()).log(Level.SEVERE, null, ex);
         }
   }
  
  
  
  
  
}


