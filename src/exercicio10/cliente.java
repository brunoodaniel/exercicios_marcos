package exercicio10;

public class cliente {
    public String nome;
    public String endereco;
    public int telefone;

    public void imprimirInformacoes(){
        System.out.println("O nome do cliente é: "+this.nome);
        System.out.println("O enredeço do cliente é: "+this.endereco);
        System.out.println("O telefone do cliente é: "+this.telefone);
    }
}
