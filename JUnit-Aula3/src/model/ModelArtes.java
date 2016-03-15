package model;



public class ModelArtes extends ModelCurso{
   private String descricaoMaterial;
   private String nomeDosLivros;

//getters e setters

   public ModelArtes(){
     
   }
   public void setDescricaoMaterial(String descricaoMaterial){
      this.descricaoMaterial = descricaoMaterial;
   }

   public String getDescricaoMaterial(){
      return this.descricaoMaterial;
   }
   
    public void setNomeDosLivros(String nomeDosLivros){
      this.nomeDosLivros = nomeDosLivros;
   }

   public String getNomeDosLivros(){
      return this.nomeDosLivros;
   }
}//fim da classe Produto