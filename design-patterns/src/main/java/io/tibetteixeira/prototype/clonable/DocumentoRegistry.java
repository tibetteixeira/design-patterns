package io.tibetteixeira.prototype.clonable;

import java.util.HashMap;
import java.util.Map;

public class DocumentoRegistry {

    private static final DocumentoRegistry instance = new DocumentoRegistry();
    private final Map<String, Documento> registry = new HashMap<>();

    private DocumentoRegistry() {
    }

    public static DocumentoRegistry getInstance() {
        return instance;
    }

    public void criarModelo(String nome, String tipo, String visibilidade) {
        Documento documento = new Documento(nome, tipo, visibilidade, "Conteúdo base");
        registry.put(nome + tipo, documento);
    }

    public Documento buscarDocumento(String nome, String tipo) {
        if (registry.containsKey(nome + tipo))
            return registry.get(nome + tipo).clone();

        throw new RuntimeException("Modelo não encontrado");
    }
}
