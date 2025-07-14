package entidades;

import exception.ContatoInexistenteException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import massa.MassaDeDados;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
        this.contatos = MassaDeDados.listaDeContatos();
    }

    public void adcionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void listaDeContatos() {
        System.out.println();
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public void buscaContatoPorNome(String nomeBuscado) {
        Contato contatoRetornado = contatos.stream().filter(contato -> contato.getNome()
                .equalsIgnoreCase(nomeBuscado)).findFirst().get();
        System.out.println(contatoRetornado);
    }

    public void bucarContatoPorSobreNome(String sobreNomeBuscado) {
        List<Contato> encontrados = contatos.stream().filter(contato -> {
            String[] partes = contato.getNome().trim().split("\\s+");
            String sobrenome = partes[partes.length - 1];
            return sobrenome.equalsIgnoreCase(sobreNomeBuscado);
        }).collect(Collectors.toList());
        try {
            validarContatosEncontrados(encontrados);
            System.out.println();
            System.out.println("Contatos com o sobrenome " + sobreNomeBuscado.toUpperCase());
            for (Contato contato : encontrados) {
                System.out.println(contato);
            }
        } catch (ContatoInexistenteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void bucarContatoPeloPrimeiroNome(String inicialBuscada) {
        List<Contato> encontrados = contatos.stream().filter(contato -> {
            String[] partes = contato.getNome().trim().split("\\s+");
            String inicio = partes[0];
            return inicio.equalsIgnoreCase(inicialBuscada);
        }).collect(Collectors.toList());
        try {
            validarContatosEncontrados(encontrados);
            System.out.println();
            System.out.println("Contatos com o primeiro nome " + inicialBuscada.toUpperCase());
            imprimeListaDeContatos(encontrados);
        } catch (
                ContatoInexistenteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private void imprimeListaDeContatos(List<Contato> contatos) {
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    private void validarContatosEncontrados(List<Contato> contatosEncontrados) {
        if (contatosEncontrados.isEmpty()) {
            throw new ContatoInexistenteException("Contato não encontrado!");
        }
    }
}