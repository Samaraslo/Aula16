package model;

import dao.AlunosDAO;
import to.AlunoTO;

public class ModelAluno extends ModelCurso{
	private String nome;
   private String endereco;
   private String telefone;
   private String email;
   private String rg;
private int cpf;

//getters e setters

   public ModelAluno(){
     
   }

	public ModelAluno(String pNomeAluno, String pEndereco, String pTelefone, String pEmail, String pRg, int pCpf) {
	// TODO Auto-generated constructor stub
}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	 public void criar() {
		   AlunosDAO dao = new AlunosDAO();
		   AlunoTO to = new AlunoTO();
		   to.setNome(nome);
		   to.setEndereco(endereco);
		   to.setTelefone(telefone);
		   to.setEmail(email);
		   to.setRg(rg);
		   to.setCpf(cpf);
		   try {
			dao.Create(to);
		} catch (Exception e) {
			e.printStackTrace();
		}
		   }
		   public void atualizar() {
		   AlunosDAO dao = new AlunosDAO();
		   AlunoTO to = new AlunoTO();
		   to.setNome(nome);
		   to.setEndereco(endereco);
		   to.setTelefone(telefone);
		   to.setEmail(email);
		   to.setRg(rg);
		   to.setCpf(cpf);
		   try {
			dao.update(to);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   }
		   public void excluir() {
		   AlunosDAO dao = new AlunosDAO();
		   AlunoTO to = new AlunoTO();
		   to.setCpf(cpf);
		   try {
			dao.delet(to);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   }
		   

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ModelAluno other = (ModelAluno) obj;
	if (cpf != other.cpf)
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (endereco == null) {
		if (other.endereco != null)
			return false;
	} else if (!endereco.equals(other.endereco))
		return false;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	if (rg == null) {
		if (other.rg != null)
			return false;
	} else if (!rg.equals(other.rg))
		return false;
	if (telefone == null) {
		if (other.telefone != null)
			return false;
	} else if (!telefone.equals(other.telefone))
		return false;
	return true;
}

  
}//fim da classe Produto