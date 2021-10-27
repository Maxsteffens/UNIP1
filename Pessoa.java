package modelo;

/**
 *
 * @author max
 */
public class Pessoa {
    

    // atributos
    private String nome;
    private int telefone;
    //metodos acessoress
    public String getNome(){
    return nome;
    }
    public void setNome(String nome){
       if (!nome.equals("")){
           this.nome = nome;
                  }else{
           throw new IllegalArgumentException("O nome nao pode ser vazio");
       }
       }
    public int getTelefone(){
        return telefone;
           
    }
    public void setTelefone(int telefone){
        if (telefone >= 1000000){
            this.telefone = telefone;
        } else {
        throw new IllegalArgumentException("O Telefone deve ter mais de sete digtos");
        }
    }
        //construtor
    public Pessoa (String nome, int telefone){
    setNome (nome);
    setTelefone(telefone);
    }
    
}