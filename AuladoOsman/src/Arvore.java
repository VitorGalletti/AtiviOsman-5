public class Arvore {
    private Nodo raiz;

    private class Nodo {
        Aluno aluno;
        Nodo esquerdo;
        Nodo direito;

        Nodo(Aluno aluno) {
            this.aluno = aluno;
            this.esquerdo = null;
            this.direito = null;
        }
    }

    public void inserir(Aluno aluno) {
        raiz = inserirRec(raiz, aluno);
    }

    private Nodo inserirRec(Nodo raiz, Aluno aluno) {
        if (raiz == null) {
            raiz = new Nodo(aluno);
            return raiz;
        }

        if (aluno.getIdade() < raiz.aluno.getIdade()) {
            raiz.esquerdo = inserirRec(raiz.esquerdo, aluno);
        } else if (aluno.getIdade() > raiz.aluno.getIdade()) {
            raiz.direito = inserirRec(raiz.direito, aluno);
        }

        return raiz;
    }

    public String preOrderTraversal() {
        return preOrderHelper(raiz);
    }

    private String preOrderHelper(Nodo raiz) {
        if (raiz == null) {
            return "";
        }
        return raiz.aluno.toString() + "\n" + preOrderHelper(raiz.esquerdo) + preOrderHelper(raiz.direito);
    }
}