
public class Main {
    public static void main(String[] args) {

        TaskManagementSystem taskList = new TaskManagementSystem();

        taskList.addTask(101, "Design UI", "Pending");
        taskList.addTask(102, "Develop Backend", "In Progress");
        taskList.addTask(103, "Testing", "Pending");

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearching Task 102:");
        taskList.searchTask(102);

        System.out.println("\nDeleting Task 102:");
        taskList.deleteTask(102);

        System.out.println("\nRemaining Tasks:");
        taskList.traverseTasks();
    }
}