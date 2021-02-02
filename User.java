/* Contains name and job title.  Used to demonstrate data structures
   in Java. */
   class User {

    private String name;
    private String title;

    /* Constructor */
    public User(String name, String title) {
        this.name = name;
        this.title = title;
    }

    /* Override the toString function that every Java class
       has.  We return a string so that we can print objects
       using System.out.println. */
    public String toString() {
        return name + " (" + title + ")";
    }

}