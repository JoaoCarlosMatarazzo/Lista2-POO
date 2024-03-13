public class Principal {
    public static void main(String[] args){
        Disciplina disciplina = new Disciplina("POO", 60);
        Aluno aluno = new Aluno("Athena",54321,7.5,8.0,6.5,7.0,7.0, disciplina);

        double media = aluno.calcularMedia();
        String situacao = aluno.situacaoAluno();

        System.out.println("Nome do aluno: " + aluno.nome);
        System.out.println("Matrícula do aluno: " + aluno.matricula);
        System.out.println("Média do aluno: " + media);
        System.out.println("Situação do aluno: " + situacao);
    }
}
