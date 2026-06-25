// 2. Define Model Class
class Student {
    private String name;
    private String id;
    private String grade;

    public Student(String name, String id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}

// 3. Define View Class
class StudentView {
    public void displayStudentDetails(String studentName, String studentId, String studentGrade) {
        System.out.println("--- Student Record ---");
        System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentId);
        System.out.println("Grade: " + studentGrade);
        System.out.println("----------------------");
    }
}

// 4. Define Controller Class
class StudentController {
    private final Student model;
    private final StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    public String getStudentGrade() {
        return model.getGrade();
    }

    public void updateView() {
        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
    }
}

// 5. Test the MVC Implementation
public class MVCPattern {
    public static void main(String[] args) {
        // Fetch student record from dummy data/source
        Student model = new Student("Aman", "101", "A");
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        // Display initial details
        controller.updateView();

        // Update data through controller
        controller.setStudentName("Aman Kumar");
        controller.setStudentGrade("A+");

        // Display updated details
        System.out.println("\nAfter updating details:");
        controller.updateView();
    }
}