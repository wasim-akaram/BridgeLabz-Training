package skillforge;



class Course 
{

    private String title;
    private Instructor instructor;
    private String[] modules;

    private double rating;             
    private int reviewCount;            

    // Constructor with default modules
    public Course(String title, Instructor instructor) 
    {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[] { "Introduction", "Core Concepts", "Final Project" };
        this.rating = 0.0;
        this.reviewCount = 0;
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) 
    {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.rating = 0.0;
        this.reviewCount = 0;
    }

    // Encapsulated rating logic
    protected void addRating(double newRating) 
    {
        rating = (rating * reviewCount + newRating) / (++reviewCount);
    }

    // Read-only access
    public double getRating() 
    {
        return rating;
    }

    public void showCourseDetails() 
    {
        System.out.println("Course: " + title);
        System.out.println("Instructor: " + instructor.name);
        System.out.println("Rating: " + rating);
    }
}

