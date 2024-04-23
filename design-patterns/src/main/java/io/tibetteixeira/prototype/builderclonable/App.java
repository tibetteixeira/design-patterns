package io.tibetteixeira.prototype.builderclonable;

public class App {
    public static void main(String[] args) {
        DocumentoRegistry registry = DocumentoRegistry.getInstance();

        registry.criarModelo("Tesouraria", "PDF", "RESTRITO");
        registry.criarModelo("Tesouraria", "XLSX", "CONFIDENCIAL");

        Documento tesourariaPDF = registry.buscarDocumento("Tesouraria", "PDF");
        tesourariaPDF = tesourariaPDF.cloneBuilder().comConteudo("Tesouraria em PDF Restrito").build();

        Documento tesourariaPDFRestrito = registry.buscarDocumento("Tesouraria", "PDF");
        tesourariaPDFRestrito = tesourariaPDFRestrito.cloneBuilder().comNome("Tesouraria v2").comConteudo("Tesouraria em PDF Confidencial").build();

        Documento tesourariaXLSX = registry.buscarDocumento("Tesouraria", "XLSX");
        tesourariaXLSX = tesourariaXLSX.cloneBuilder().comNome("Tesouraria v3").comConteudo("Tesouraria apenas para a diretoria").comVisibilidade("RESTRITO").build();

        Documento tesourariaXLSXRestrito = registry.buscarDocumento("Tesouraria", "XLSX");
        tesourariaXLSXRestrito = tesourariaXLSXRestrito.cloneBuilder().comNome("Tesouraria JSON").comConteudo("Tesouraria em JSON").comTipo("JSON").build();

        tesourariaPDF.imprimir();
        tesourariaPDFRestrito.imprimir();
        tesourariaXLSX.imprimir();
        tesourariaXLSXRestrito.imprimir();

        Documento tesourariaJson = registry.buscarDocumento("Tesouraria", "JSON");
    }
}
