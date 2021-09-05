package study.oopch3;

public class EnCapsulation {
    StringBuffer buffer = new StringBuffer();

    private String line = "================================================\n";
    private String title = "  이릅 \t 주소 \t\t 전화번호 \n";

    private void makeFooter() {
        buffer.append(line);
    }

    private void makeHeader() {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody() {
        buffer.append("James \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-2222-3333 \t");
        buffer.append("Tomas \t");
        buffer.append("NewYork US \t");
        buffer.append("010-7777-0997 \n");
    }

    public String getReport() {
        makeHeader();
        generateBody();
        makeFooter();

        return buffer.toString();
    }
}
