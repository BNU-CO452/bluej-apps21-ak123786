import java.util.ArrayList;
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Akes Ali
 * @version 0.1 19/Oct/2021
 */
public class Course
{
    public final static int MAXN_MODULES = 4;
    public final static int MAXN_STUDENTS = 4;
    
    public ArrayList<Module> modules;
    public ArrayList<Student>students;
    
    private String code;
    private String title;
    
    private Grades finalGrade;
     
    public Course()
    {
        this("BT1SFT1", "BSc Software Engineering");
    }
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        
        modules  = new ArrayList<Module>();
        students = new ArrayList<Student>();
        
        createModules();
    }

    /**
     * List of all created modules
     */
    public void createModules()
    {
        Module co452 = new Module ("CO452", "Programming Concepts");
        Module co450 = new Module ("CO450", "Computer Architecture");
        Module co456 = new Module ("CO456", "Web Developement");
        Module co454 = new Module ("CO454", "Digital Technology");
        addModule(co452);
        addModule(co450);
        addModule(co456);
        addModule(co454);
    }
    
        /**
     * List of all created students
     */
    public void createStudents()
    {
        Student akes = new Student ("Akes", 22012359);
        Student arbaaz = new Student ("Arbaaz", 22222222);
        Student mohammed = new Student ("Mohammed", 11111111);
        Student stefen = new Student ("Stefen", 44444444);
        addStudent(akes);
        addStudent(arbaaz);
        addStudent(mohammed);
        addStudent(stefen);
    }
    
    public void addModule(Module module)
    {
        if(modules.size() < MAXN_MODULES)
        {
            modules.add(module);
        }
    }
    
        public void addStudent(Student student)
    {
        if(students.size() < MAXN_MODULES)
        {
            students.add(student);
        }
    }
    
    /**
     * Converts the grades to marks
     */
    public Grades convertToGrade(int mark)
    {
        if(mark >= 0 && mark <= 39)
            return Grades.F;
        else if(mark >= 40 && mark <= 49)
            return Grades.D;
        else if(mark >= 50 && mark <= 59)
            return Grades.C;
        else if(mark >= 60 && mark <= 69)
            return Grades.B;
        else if(mark >=70 && mark <= 100)
            return Grades.A;
        else
            return Grades.NS;
    }
    
    /**
     * Calculation the average mark from the four module marks
     * and converts them into a final grade.
     */
    public Grades calculateGrade(ArrayList<ModuleMark> marks)
    {
        int total = 0;
        int finalMark = 0;
        for(ModuleMark mark : marks)
        {
            total = total + mark.getValue();
        }
        finalMark = total / MAXN_MODULES;
        finalGrade = convertToGrade(finalMark);
        return finalGrade;
    }
    
    /**
     * Prints out the details of a course and the
     * four modules
     */
    public void print()
    {
        System.out.println();
        System.out.println(" Course " + code + ": " + title);
        //System.out.println();
        
        printModules();
    }
    
    /**
     * Print the course's four modules
     */
    public void printModules()
    {
        for (Module module : modules)
        {
            module.print();
            module.printCredit();
        }
    }
    
    /**
     * Print the course's four students
     */
    public void printStudents()
    {
        for (Student student : students)
        {
            student.print();
        }
    }
}
