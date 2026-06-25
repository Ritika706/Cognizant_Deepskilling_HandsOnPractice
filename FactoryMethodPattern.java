interface Document {
    void open();
}

class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Word Document Opened");
    }
}

class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("PDF Document Opened");
    }
}

class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Excel Document Opened");
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}

public class FactoryMethodPattern {

    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordFactory();
        DocumentFactory pdfFactory = new PdfFactory();
        DocumentFactory excelFactory = new ExcelFactory();

        Document doc1 = wordFactory.createDocument();
        Document doc2 = pdfFactory.createDocument();
        Document doc3 = excelFactory.createDocument();

        doc1.open();
        doc2.open();
        doc3.open();
    }
}