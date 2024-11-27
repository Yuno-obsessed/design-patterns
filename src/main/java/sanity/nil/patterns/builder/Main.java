package sanity.nil.patterns.builder;

public class Main {

    public static void main(String[] args) {
        ExcelWorkbookBuilder builder = new ExcelWorkbookBuilder();
        ExcelSheetBuilder sheetBuilder = new ExcelSheetBuilder();
        WorkbookDirector director = new WorkbookDirector(builder, sheetBuilder);
        Workbook standardWorkbook = director.buildStandardWorkbook();
        System.out.println(standardWorkbook.toString());
    }
}
