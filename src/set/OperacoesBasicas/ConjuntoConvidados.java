package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados(Set<Convidado> convidadosSet) {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoporCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados(null);

        conjuntoConvidados.adicionarConvidado("Alice", 1234);
        conjuntoConvidados.adicionarConvidado("Bob", 1235);
        conjuntoConvidados.adicionarConvidado("Charlie", 1235);
        conjuntoConvidados.adicionarConvidado("David", 1236);

        System.out.println(
                "Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        // Exibindo os convidados no conjunto
        System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();

        // Removendo um convidado do conjunto por código de convite
        conjuntoConvidados.removerConvidadoporCodigoConvite(1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados()
                + " convidado(s) dentro do Set de Convidados após a remoção");

        // Exibindo os convidados atualizados no conjunto
        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();
    }
}
