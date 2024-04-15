import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        
        while (true) {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno:");
            if (nome == null) break;
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do aluno:"));

            Aluno aluno = new Aluno(nome, idade);
            arvore.inserir(aluno);

            int continuar = JOptionPane.showConfirmDialog(null, "Deseja inserir outro aluno?");
            if (continuar != JOptionPane.YES_OPTION) {
                break;
            }
        }

        String resultado = arvore.preOrderTraversal();
        JOptionPane.showMessageDialog(null, "Alunos cadastrados (Pré-ordem):\n" + resultado);
    }
}