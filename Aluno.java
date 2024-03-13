public class Aluno {
    String nome;
    int matricula;
    double nota_mat;
    double nota_fis;
    double nota_quim;
    double nota_geo;
    double nota_por;
    private Disciplina disciplina;

    public Aluno(String nome, int matricula, double nota_mat,double nota_fis,double nota_quim,double nota_geo,double nota_por, Disciplina disciplina ){
        this.nome=nome;
        this.matricula = matricula;
        this.nota_mat=nota_mat;
        this.nota_fis=nota_fis;
        this.nota_quim=nota_quim;
        this.nota_geo=nota_geo;
        this.nota_por=nota_por;
        this.disciplina = disciplina;
    }

    public double calcularMedia(){
        return (nota_mat+nota_fis+nota_quim+nota_geo+nota_por)/5;
    }
    public String situacaoAluno(){
        double media = calcularMedia();
        if (media >= 6){
            return "Aprovado";
        }
        else
            return "Reprovado";
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public static void main(String[] args){
      Disciplina disciplina = new Disciplina("POO", 60);
      Aluno aluno = new Aluno("João",12345,7.5,8.0,6.5,7.0,7.0, disciplina);
        System.out.println("Média do aluno: " + aluno.calcularMedia());
        System.out.println("Situação do aluno: " + aluno.situacaoAluno());
    }
}
