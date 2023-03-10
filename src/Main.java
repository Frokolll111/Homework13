public class Main {
    public static void main(String[] args) {
        task1 ();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        Book book1 = new Book("Найди меня",new Author("Энн","Фрейзер"),2022);
        System.out.println(new Book("Найди меня",new Author("Энн","Фрейзер"), 2022));
        book1.setYear(2023);
        System.out.println("Год переиздания книги - " + book1.getYear());
        Book book2 = new Book("Java для чайников", new Author("Барри","Бёрд"), 2019);
        System.out.println(new Book("Java для чайников",new Author("Барри","Бёрд"), 2019));
        book2.setYear(2020);
        System.out.println("Год переиздания книги - " + book2.getYear());
        Author c = new Author("Энн ", "Фрейзер");
        Author c2 = new Author("Барри", "Бёрд");
        System.out.println(c.equals(c2));
        Book c3 = new Book("Найди меня ", new Author("Энн", "Фрейзер"), 2022);
        Book c4 = new Book("Найди меня ", new Author("Барри", "Бёрд"), 2022);
        System.out.println(c3.equals(c4));
    }
}