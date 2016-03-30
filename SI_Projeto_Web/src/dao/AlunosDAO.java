package dao;

import java.sql.PreparedStatement;
import dao.AlunosDAO;
import to.AlunoTO;
import model.ModelArtes;
import factory.ConnectionFactory;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;


public class AlunosDAO{

   private Connection con;
   
   public AlunosDAO(){
      PreparedStatement pst = null;
      ResultSet rs = null;
   }
   
   public void Create(AlunoTO to) throws Exception {
      try{
         String sql = "insert into tbAlunos (nomeAluno, endereco, telefone, email, rg,cpf) values (?,?,?,?,?,?)";
      
         con = ConnectionFactory.conector(); 
         PreparedStatement p = con.prepareStatement(sql);
         ModelArtes artes = new ModelArtes();
         p.setString(1, to.getNome());
         p.setString(2, to.getEndereco());
         p.setString(3, to.getTelefone());
         p.setString(4, to.getEmail());
         p.setString(5, to.getRg());
         p.setInt(6, to.getCpf());
      
      
         int rowsInserted = p.executeUpdate();
         if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null,"O Aluno "+to.getNome()+" foi inserido com sucesso!");
         } 
         ConnectionFactory.closeConnection(con);
      
      }
      catch(SQLException ex){ 
      
         JOptionPane.showMessageDialog(null,"N�o foi poss�vel cadastrar o Aluno "+to.getNome()+" pois ele j� existe no nosso banco de dados.");
      }
   }

   public void update(AlunoTO to) throws Exception {
      String sql ="update tbAlunos SET idAluno = ?,nomeAluno = ?, endereco = ?, telefone = ?,email = ?,rg = ?, cpf=? where cpf=?";
      
      con = ConnectionFactory.conector(); 
      PreparedStatement p = con.prepareStatement(sql);
     
      p.setInt(1, to.getCpf());
      p.setString(2, to.getNome());
      p.setString(3, to.getEndereco());
      p.setString(4, to.getTelefone());
      p.setString(5, to.getEmail());
      p.setString(6, to.getRg());
      p.setInt(7, to.getCpf());
      p.setInt(8, to.getCpf());
     
     
      int rowsInserted = p.executeUpdate();
      if (rowsInserted > 0) {
         JOptionPane.showMessageDialog(null,"O Aluno "+to.getNome()+" foi alterado com sucesso!");
      } 
      
      ConnectionFactory.closeConnection(con);
   }
   

   public void delet(AlunoTO to) throws Exception {
      String sql = "delete from tbAlunos where cpf = ?";
      con = ConnectionFactory.conector(); 
      PreparedStatement p = con.prepareStatement(sql);
      
      p.setInt(1, to.getCpf());
      
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
   
   public AlunoTO carregarAluno(int paramCpf){
	   AlunoTO to = new AlunoTO();
	      con = ConnectionFactory.conector();  
	      String sqlRead = "select * from tbAlunos where cpf=?"; 
	   			
	      try{
	      
	         PreparedStatement p = con.prepareStatement(sqlRead);   
	         p.setInt(1,paramCpf);
	         ResultSet rs = p.executeQuery();
	      
	         if (rs.next()) {
	            paramCpf  =   rs.getInt("idAluno");
	            to.setNome(rs.getString("nomeAluno")); 
	            to.setEndereco(rs.getString("endereco"));
	            to.setTelefone(rs.getString("telefone"));
	            to.setEmail(rs.getString("email"));
	            to.setRg(rs.getString("rg"));
	            to.setCpf(rs.getInt("cpf"));
	          
	            //setInTextFields(paramCpf,nome,endereco,telefone,email,rg,cpf);
	         
	         }
	         else{
	            JOptionPane.showMessageDialog(null,"Ops, n�o encontramos esse CPF.");
	            
	         }
	         p.close();     
	      }       
	      
	      catch(Exception e) {
	         e.printStackTrace();
	      }
	   
	      try{
	      
	      } 
	      catch(Exception e) {
	         e.printStackTrace();
	      }
	      return to;
	   }

}//fim da classe ProdutoDAO