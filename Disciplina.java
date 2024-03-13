public class Disciplina {
    String nome;
    int cargaHoraria;
    public Disciplina(String nome, int cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
    public static void main(String[] args) {
        // Exemplo de uso da classe Disciplina
        Disciplina disciplina = new Disciplina("POO", 60);
        System.out.println("Nome da disciplina: " + disciplina.nome);
        System.out.println("Carga horária da disciplina: " + disciplina.cargaHoraria);
    }
}
