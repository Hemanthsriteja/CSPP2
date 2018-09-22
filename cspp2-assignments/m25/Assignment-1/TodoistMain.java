import java.util.Scanner;
import java.util.Arrays;
/**
  * write your code below this comment
  */
/**.
 * Class for task.
 */
class Task {
    private String titles;
    private String assignedTo;
    private int time1;
    private boolean important1;
    private boolean urgent1;
    private String status1;
    /**.
     * Constructs the object.
     *
     * @param      title      The title
     * @param      name       The name
     * @param      time       The time
     * @param      important  The important
     * @param      urgent     The urgent
     * @param      status     The status
     */
    Task(String title, String name, int time, boolean important, boolean urgent, String status) throws Exception {
        if (title == null || title.equals(""))
            throw new Exception("Title not provided");
        if (!status.equals("todo") && !status.equals("done"))
            throw new Exception("Invalid status " + status);
        if (time < 0)
            throw new Exception("Invalid timeToComplete " + time);
        this.titles = title;
        this.assignedTo = name;
        this.time1 = time;
        this.important1 = important;
        this.urgent1 = urgent;
        this.status1 = status;
    }
    /**.
     * Gets the title.
     *
     * @return     The title.
     */
    public String getTitle() {
        return this.titles;
    }
    /**.
     * Gets the assign.
     *
     * @return     The assign.
     */
    public String getAssign() {
        return this.assignedTo;
    }
    /**.
     * Gets the time.
     *
     * @return     The time.
     */
    public int getTime() {
        return this.time1;
    }
    /**.
     * Gets the imp.
     *
     * @return     The imp.
     */
    /**.
     * Gets the imp.
     *
     * @return     The imp.
     */
    public boolean getImp() {
        return this.important1;
    }
    /**.
     * Gets the urgent.
     *
     * @return     The urgent.
     */
    public boolean getUrgent() {
        return this.urgent1;
    }
    /**.
     * Gets the status.
     *
     * @return     The status.
     */
    public String getStatus() {
        return this.status1;
    }
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String important = "";
        String urgent = "";
        if (getImp()) {
            important = "Important";
        } else {
            important = "Not Important";
        }
        if (getUrgent()) {
            urgent = "Urgent";
        } else {
            urgent = "Not Urgent";
        }
        return getTitle() + ", " + getAssign() + ", " + getTime() + ", " + important + ", " + urgent + ", " + getStatus();
    }
}

class Todoist {
    Task[] TaskArray;
    int size;
    Todoist() {
        TaskArray = new Task[10];
        size = 0;

    }
    public void addTask(Task var) {
        TaskArray[size++] = var;
    }
}
/**
 * Class for todoist main.
 */
public class TodoistMain {
    /**
     * Starts a test.
     */
    public static void startTest() {
        // Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
            case "task":
                testTask(tokens);
                break;
            // case "add-task":
            //  testAddTask(todo, tokens);
            //  break;
            // case "print-todoist":
            //  System.out.println(todo);
            //  break;
            // case "get-next":
            //  System.out.println(todo.getNextTask(tokens[1]));
            //  break;
            // case "get-next-n":
            //  int n = Integer.parseInt(tokens[2]);
            //  Task[] tasks = todo.getNextTask(tokens[1], n);
            //  System.out.println(Arrays.deepToString(tasks));
            //  break;
            // case "total-time":
            //  System.out.println(todo.totalTime4Completion());
            //  break;
            default:
                break;
            }
        }
    }
    // /**
    //  * method to test add task.
    //  *
    //  * @param      todo    The todo
    //  * @param      tokens  The tokens
    //  */
    // public static void testAddTask(final Todoist todo, final String[] tokens) {
    //  try {
    //      todo.addTask(createTask(tokens));
    //  } catch (Exception e) {
    //      System.out.println(e.getMessage());
    //  }
    // }
    /**
     * method to test the creation of task objects..
     *
     * @param      tokens  The tokens
     */
    public static void testTask(final String[] tokens) {
        try {
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**.
     * Creates a task object below.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public static Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        return new Task(
                   title, assignedTo, timeToComplete, important, urgent, status);
    }
    /**
     * main method given
     *
     * @param      args  The command line arguments
     */
    public static void main(final String[] args) {
        startTest();
    }
}
