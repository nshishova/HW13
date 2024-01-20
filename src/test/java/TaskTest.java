import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {
    @Test
    public void SimpleTaskMatchesTrue() {
        SimpleTask task = new SimpleTask(2, "Сдать ДЗ");

        boolean expected = true;
        boolean actual = task.matches("ДЗ");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void SimpleTaskMatchesFalse() {
        SimpleTask task = new SimpleTask(5, "Сдать ДЗ");

        boolean expected = false;
        boolean actual = task.matches("дз");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void EpicMatchesTrue() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic task = new Epic(2, subtasks);

        boolean expected = true;
        boolean actual = task.matches("Молоко");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void EpicMatchesFalse() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic task = new Epic(2, subtasks);

        boolean expected = false;
        boolean actual = task.matches("паста");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MeetingMatchesTopicTrue() {
        Meeting task = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = task.matches("Выкатка 3й версии приложения");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MeetingMatchesProjectTrue() {
        Meeting task = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = task.matches("Приложение НетоБанка");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MeetingMatchesTopicFalse() {
        Meeting task = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = task.matches("Выкатка 5й версии приложения");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MeetingMatchesProjectFalse() {
        Meeting task = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = task.matches("Android app");
        Assertions.assertEquals(expected, actual);

    }
   @Test
    public void ReturnId(){
        Task task = new Task(7);
       int  expected = 7;
       int actual = task.getId();
       Assertions.assertEquals(expected, actual);
   }
    @Test
    public void ReturnId1(){
        Task task = new Task(0);
        int  expected = 0;
        int actual = task.getId();
        Assertions.assertEquals(expected, actual);
    }


}