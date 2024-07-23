package io.tibetteixeira.creational.prototype.clonable;

public class App {
    public static void main(String[] args) {
        DocumentoRegistry registry = DocumentoRegistry.getInstance();

        registry.criarModelo("Tesouraria", "PDF", "RESTRITO");
        registry.criarModelo("Tesouraria", "XLSX", "RESTRITO");

        Documento tesourariaPDF = registry.buscarDocumento("Tesouraria", "PDF");
        tesourariaPDF.setConteudo("Tesouraria em PDF Restrito");

        Documento tesourariaPDFRestrito = registry.buscarDocumento("Tesouraria", "PDF");
        tesourariaPDFRestrito.setConteudo("Tesouraria em PDF Confidencial");

        Documento tesourariaXLSX = registry.buscarDocumento("Tesouraria", "XLSX");
        tesourariaXLSX.setConteudo("Tesouraria em XLSX Restrito");

        Documento tesourariaXLSXRestrito = registry.buscarDocumento("Tesouraria", "XLSX");
        tesourariaXLSXRestrito.setConteudo("Tesouraria em XLSX Confidencial");

        tesourariaPDF.imprimir();
        tesourariaPDFRestrito.imprimir();
        tesourariaXLSX.imprimir();
        tesourariaXLSXRestrito.imprimir();

        Documento tesourariaJson = registry.buscarDocumento("Tesouraria", "JSON");
    }
}
