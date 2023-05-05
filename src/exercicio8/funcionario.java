package exercicio8;

public class funcionario {
    public String nome;
    public String cargo;
    public Double salario;

    public void imprimirInformacoes(){
        System.out.println("Nome do funcionario: "+this.nome);
        System.out.println("Cargo do funcionario: "+this.cargo);
        System.out.println("Salario do funcionario: "+this.salario);
    }
}
