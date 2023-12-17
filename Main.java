public class Main {
    public static void main(String[] args) {
        ProgrammingBook[] programmingBooks = new ProgrammingBook[]{
                new ProgrammingBook("A1", "Code 1", 30, "ADMIN 1", "Java", "Spring"),
                new ProgrammingBook("B2", "Code 2", 20, "ADMIN 2", "Python", "None"),
                new ProgrammingBook("C3", "Code 3", 10, "ADMIN 3", "JavaScript", "Node.js"),
                new ProgrammingBook("D4", "Code 4", 15, "ADMIN 4", "C ++", "None"),
                new ProgrammingBook("F5", "Code 5", 20, "ADMIN 5", "Java", "None")
        };
        FictionBook[] fictionBooks = {
                new FictionBook("01", "The Hobbit", 100, "J.R.R. Tolkien", "Gỉa tuởng 1"),
                new FictionBook("02", "Harry Potter", 20, "J. K. Rowling", "Gỉa tưởng 2"),
                new FictionBook("03", "Những tấm lòng cao cả", 30, "Edmondo De Amicis", "Tiểu Thuyết"),
                new FictionBook("04", "Bố Già", 40, "Mario Puzo", "Chính kịch"),
                new FictionBook("05", " Dune", 50, "Frank Herbert", "Viễn tưởng 1")
        };
        int tongTien = 0;
        for (Book sach : programmingBooks) {
            tongTien += sach.getPrice();
        }
        for (Book sach : fictionBooks) {
            tongTien += sach.getPrice();
        }
        System.out.println("10 cuốn sách có giá : " + tongTien + " $");

        int bookJava = 0;
        for (ProgrammingBook sach : programmingBooks) {
            if ("Java".equals(sach.getLanguage())) {
                bookJava++;
            }
        }
        System.out.println("Số sách ProgrammingBook có ngôn ngữ Java: " + bookJava);

        int bookVienTuong = 0;
        for (FictionBook sach : fictionBooks) {
            if ("Viễn tưởng 1".equals(sach.getCategory())) {
                bookVienTuong++;
            }
        }
        System.out.println("Số sách FictionBook có thể loại Viễn tưởng 1: " + bookVienTuong);
        int countPrice = 0;
        for (FictionBook sach : fictionBooks) {
            if (sach.getPrice() < 100) {
                countPrice++;
            }
        }
        System.out.println("Số sách FictionBook có giá < 100: " + countPrice);
    }
}


