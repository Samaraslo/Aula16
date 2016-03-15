package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import model.ModelArtes;
import to.CursoTO;
import factory.ConnectionFactory;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;


public class ArtesDAO{

   private Connection con;
   public String nome,dataIni,dataFim,horario, desc, livros;
   public int num;
   public double val;


   public ArtesDAO(){
   
      PreparedStatement pst = null;
      ResultSet rs = null;
   }
   
   public void Create(CursoTO to) throws Exception {
      try{
         String sql = "insert into tbartes (nomeCurso, dataInicio, dataTermino, horarioPrevisto, numeroDeVagas,valorCurso, descricaoMaterial, nomeDosLivros,disponivel) values (?,?,?,?,?,?,?,?,?)";
      
         con = ConnectionFactory.conector(); 
         PreparedStatement p = con.prepareStatement(sql);
         ModelArtes artes = new ModelArtes();
         p.setInt(1,to.getIdCurso());
         p.setString(2, to.getDataInicio());
         p.setString(3, to.getDataTermino());
         p.setString(4, to.getHorario());
         p.setInt(5, to.getNumeroVagas());
         p.setDouble(6, to.getValorCurso());
         p.setString(7, to.getDescricao());
         p.setString(8, to.getLivros());
         boolean disponivel = false;
		p.setBoolean(9, disponivel);
      
         int rowsInserted = p.executeUpdate();
         if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null,"O Curso "+nome+" foi inserido com sucesso!");
         } 
      
         ConnectionFactory.closeConnection(con); 
      }
      
      
      catch(SQLException ex){ 
         ex.printStackTrace();
        // JOptionPane.showMessageDialog(null,"N�o foi poss�vel cadastrar o curso "+nome+" pois ele j� existe no nosso banco de dados.");
      }
   }

   public void delet(CursoTO to) throws Exception {
      String sql = "delete from tbartes where idArtes = ?";
      con = ConnectionFactory.conector(); 
      PreparedStatement p = con.prepareStatement(sql);
      
      p.setInt(1, to.getIdCurso());
      
      int rowsInserted = p.executeUpdate();
      if (rowsInserted > 0) {
      
      
         int response = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o curso?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         if (response == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,"O Curso foi exclu�do com sucesso!");
         } 
      }
      ConnectionFactory.closeConnection(con);
   }

   public void update(CursoTO to) throws Exception {
      String sql ="update tbartes SET idArtes = ?,nomeCurso = ?, dataInicio = ?, dataTermino = ?,horarioPrevisto = ?,numeroDeVagas = ?,valorCurso = ?, descricaoMaterial = ?, nomeDosLivros = ? where idArtes = ?";
      
      con = ConnectionFactory.conector(); 
      PreparedStatement p = con.prepareStatement(sql);
     
      p.setInt(1, to.getIdCurso());
      p.setString(2, to.getNomeCurso());
      p.setString(3, to.getDataInicio());
      p.setString(4, to.getDataTermino());
      p.setString(5, to.getHorario());
      p.setInt(6, to.getNumeroVagas());
      p.setDouble(7, to.getValorCurso());
      p.setString(8,to.getDescricao());
      p.setString(9,to.getLivros());
      p.setInt(10, to.getIdCurso());
      
      
     
     
      int rowsInserted = p.executeUpdate();
      if (rowsInserted > 0) {
         JOptionPane.showMessageDialog(null,"O Curso "+nome+" foi alterado com sucesso!");
      } 
      
      ConnectionFactory.closeConnection(con);
   }
   
   public List<ModelArtes> recuperarFornecedoresPorNome(String nomeCurso) throws SQLException {  
   
      String sentencaSelect = "SELECT * FROM tbArtes WHERE disponivel = 1";  
      PreparedStatement p = con.prepareStatement(sentencaSelect);  
      ResultSet resultsetSelect = p.executeQuery();  
   
      List<ModelArtes> cursosArtes = new ArrayList<ModelArtes>();  
      while (resultsetSelect.next()) {  
         cursosArtes.add(recuperarObjeto(resultsetSelect));  
      }  
   
      resultsetSelect.close();  
      p.close();  
      return cursosArtes;  
   }  
  
   private ModelArtes recuperarObjeto(ResultSet resultsetSelect) {  
      try{
         ModelArtes mdArtes = new ModelArtes();  
         mdArtes.setId(resultsetSelect.getInt("idArtes"));  
         mdArtes.setNomeCurso(resultsetSelect.getString("nomeCurso"));  
      
         return mdArtes;  
      }
      catch(SQLException ex){
         ex.printStackTrace();
         return null; 
          
      }
   } 
    
}//fim da classe ProdutoDAO