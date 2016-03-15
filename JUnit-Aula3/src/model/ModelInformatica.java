package model;



public class ModelInformatica extends ModelCurso{
   private String descricaoSoftware;
    private int numeroLaboratorios;
//getters e setters
   public void setDescricaoSoftware(String descricaoSoftware){
      this.descricaoSoftware = descricaoSoftware;
   }

   public String getDescricaoSoftware(){
      return this.descricaoSoftware;
   }
   
    public void setNumeroLaboratorios(int numeros){
      this.numeroLaboratorios = numeros;
   }

   public int getNumeroLaboratorios(){
      return this.numeroLaboratorios;
   }
}//fim da classe Produto