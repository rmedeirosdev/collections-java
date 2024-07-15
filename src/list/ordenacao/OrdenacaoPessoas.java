package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List <Pessoa> pessoaList = new ArrayList<>();

    public void adicionarPessoa (String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade () {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);

        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura () {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public void exibirPessoas (){
        System.out.println(pessoaList);
    }

    public static void main(String[] args) {
        OrdenacaoPessoas pessoas = new OrdenacaoPessoas();
        pessoas.adicionarPessoa("Pedro",14,1.89);
    }
}
