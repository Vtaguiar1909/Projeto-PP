public class Funcionario {
    //Atributos
    private String nome; 
    private String matricula;
    private boolean administrador;
    private String senha;
    public Funcionario(){

    }
    public Funcionario(String nome,String matricula,boolean administrador, String senha){
        this.nome = nome;
        this.matricula = matricula;
        this.administrador = administrador;
        this.senha = senha;
    }
    //Getters & setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setAdministrador(boolean administrador){
        this.administrador = administrador;
    }
    public boolean getAdministrador(){
        return administrador;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return senha;
    }
}
