package map.Operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer> agendaContato;

    public AgendaContatos(Map<String, Integer> agendaContato) {
        this.agendaContato = new HashMap<>();
    }

    public void adicionarContato (String nome, Integer numero) {
        agendaContato.put(nome, numero);
    }

    public void removerContato (String nome) {
        if (!agendaContato.isEmpty()) {
            agendaContato.remove(nome);
        }
    }

    public void exibirContatos () {
        System.out.println(agendaContato);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContato.isEmpty()) {
          numeroPorNome = agendaContato.get(nome);
          if (numeroPorNome == null) {
            System.out.println("Contato não encontrado na agenda.");
          }
        } else {
          System.out.println("A agenda de contatos está vazia.");
        }
        return numeroPorNome;
      }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos(null);
    
        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 44444);
    
        agendaContatos.exibirContatos();
    
        // Remover um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();
    
        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);
    
        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
      }
}
