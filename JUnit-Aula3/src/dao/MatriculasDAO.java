package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import factory.ConnectionFactory;
import to.AlunoTO;
import to.MatriculasTO;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;



public class MatriculasDAO{

   private Connection con;
   
   public MatriculasDAO(){
   
   super(); 
    
      PreparedStatement pst = null;
      ResultSet rs = null;
   }
   
   public void Create(MatriculasTO to) throws Exception {
      try{
         String sql = "insert into tbMatricula (nomeAluno, dataMatricula, valor, statusPagamento, statusMatricula,cursosArtes,cursosInformatica) values (?,?,?,?,?,?,?)";
      
         con = ConnectionFactory.conector(); 
         PreparedStatement p = con.prepareStatement(sql);
         p.setString(1, to.getNomeAluno());
         p.setString(2, to.getDataMatricula());
         p.setString(3, to.getValor());
         p.setString(4, to.getStatusPagamento());
         p.setString(5, to.getStatusMatricula());
         p.setString(6, to.getCursosArtes());
         p.setString(7, to.getCursosInfo());
      
      
         int rowsInserted = p.executeUpdate();
         if (rowsInserted > 0) {
            
         } 
         ConnectionFactory.closeConnection(con);
      
      }
      catch(SQLException ex){ 
      
        ex.printStackTrace();
     }
   }

   public void update(MatriculasTO to) throws Exception {
      String sql ="update tbMatricula SET statusPagamento = ?,statusMatricula = ? where nomeAluno=?";
      
      con = ConnectionFactory.conector(); 
      PreparedStatement p = con.prepareStatement(sql);
     
      p.setString(1, to.getStatusPagamento());
      p.setString(2, to.getStatusMatricula());
      AlunoTO toA = null;
      p.setInt(3, toA.getCpf());
     
     
      int rowsInserted = p.executeUpdate();
           
      ConnectionFactory.closeConnection(con);
   }
   

   public void delet(String cpf) throws Exception {
      String sql = "delete from tbAlunos where cpf = ?";
      con = ConnectionFactory.conector(); 
      PreparedStatement p = con.prepareStatement(sql);
      
      p.setString(1, cpf);
      
      int rowsInserted = p.executeUpdate();
      if (rowsInserted > 0) {
         int response = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o aluno?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,"O Curso foi exclu�do com sucesso!");
         } 
      }
      ConnectionFactory.closeConnection(con);
   }

}