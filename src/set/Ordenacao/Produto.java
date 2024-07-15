package set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    private String nome;
    private long cod;
    private double preco;
    private int quantidade;

    public Produto(String nome, long cod, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (cod ^ (cod >>> 32));
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (cod != other.cod)
            return false;
        return true;
    }

    public String toString() {
        return "Produto [nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

}

class ComparatorPorPreco implements Comparator<Produto> {

    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}
