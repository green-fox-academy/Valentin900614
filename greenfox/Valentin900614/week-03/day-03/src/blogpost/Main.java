package blogpost;

public class Main {
    public static void main(String[] args) {

        BlogPost a = new BlogPost();
        a.authorName = "John Doe";
        a.title = "Lorem Ipsum";
        a.publicationDate = "2000.05.04.";
        a.text = "Lorem ipsum dolor sit amet.";

        BlogPost b = new BlogPost();
        b.authorName = "Tim Urban";
        b.title = "Wait but why";
        b.publicationDate = "2010.10.10.";
        b.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

        BlogPost c = new BlogPost();
        c.authorName = "William Turton";
        c.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        c.publicationDate = "2017.03.28.";
        c.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

    }
}
