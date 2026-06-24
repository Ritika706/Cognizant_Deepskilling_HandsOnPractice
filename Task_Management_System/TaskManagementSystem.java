
class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }
}

public class TaskManagementSystem {

    private Task head;

    public void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
            return;
        }

        Task temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newTask;
    }

    public void searchTask(int id) {
        Task temp = head;

        while (temp != null) {
            if (temp.taskId == id) {
                System.out.println("Task Found: " + temp.taskName);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Task Not Found");
    }

    public void deleteTask(int id) {
        if (head == null) {
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Task temp = head;

        while (temp.next != null && temp.next.taskId != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void traverseTasks() {
        Task temp = head;

        while (temp != null) {
            System.out.println(
                    temp.taskId + " " +
                    temp.taskName + " " +
                    temp.status
            );
            temp = temp.next;
        }
    }
}