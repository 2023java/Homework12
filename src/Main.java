public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и Мир",levTolstoy,1867);
        System.out.println(warAndPeace.getBookName());
        System.out.println(warAndPeace.getAuthorN().getAuthorName() + " " +warAndPeace.getAuthorN().getAuthorSurname());
        System.out.println(warAndPeace.getPublishingYear());

        Author alexanderPushkin = new Author("Александр", "Пушкин");
        Book medniyVsadnik = new Book("Медный всадник",alexanderPushkin,1833);
        System.out.println(medniyVsadnik.getBookName());
        System.out.println(medniyVsadnik.getAuthorN().getAuthorName() + " " +medniyVsadnik.getAuthorN().getAuthorSurname());
        System.out.println(medniyVsadnik.getPublishingYear());

        warAndPeace.setPublishingYear(2002);
        System.out.println(warAndPeace.publishingYear);

        System.out.println(warAndPeace);
        System.out.println(medniyVsadnik);








    }
}