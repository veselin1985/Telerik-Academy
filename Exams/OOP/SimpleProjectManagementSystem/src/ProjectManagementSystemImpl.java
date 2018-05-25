import base.ProjectManagementSystem;
import models.TicketPriority;
import models.TodoState;
import models.base.Item;
import models.base.Task;
import models.base.Ticket;
import models.base.Todo;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;


public class ProjectManagementSystemImpl implements ProjectManagementSystem {

  private List<Item> list;

  public ProjectManagementSystemImpl() {

    List<Item> list = new ArrayList<>();
  }

  @Override
  public void addTicket(String title, String description, Date dueDate, TicketPriority priority, String sender, String owner) {
    if (list == null) {
      list = new ArrayList<>();
    }
    Item ticket = new Ticket(title, description, dueDate, priority, sender, owner);
    list.add(ticket);
  }

  @Override
  public void addTodo(String title, String description, TodoState state) {
    if (list == null) {
      list = new ArrayList<>();
    }
    Item todo = new Todo(title, description, state);
    list.add(todo);

  }

  @Override
  public void addTask(String title, String description, Date dueDate, TicketPriority priority, Date plannedTime, String assignee) {
    if (list == null) {
      list = new ArrayList<>();
    }
    Item task = new Task(title, description, dueDate, priority, plannedTime, assignee);
    list.add(task);
  }

  @Override
  public List<Item> listAll() {
    return this.list;
  }

  @Override
  public List<Item> listTickets() {
    List<Item> listItems = this.list;
    List<Item> tickets = new ArrayList<>();
    for (Item item : listItems) {
      if (item instanceof Ticket) {
        tickets.add(item);
      }
    }
    return tickets;
  }

  @Override
  public List<Item> listTodos() {
    List<Item> listItems = this.list;
    List<Item> todos = new ArrayList<>();
    for (Item item : listItems) {
      if (item instanceof Todo) {
        todos.add(item);
      }
    }
    return todos;
  }

  @Override
  public List<Item> listTodos(TodoState state) {
    List<Item> todos = this.list;
    List<Item> todosWithState = new ArrayList<>();
    {
      for (Item item : todos
          ) {
        if ((item instanceof Todo)) {
          Item todo;
          todo = item;
          if (((Todo) todo).getState() == state) {
            todosWithState.add(item);
          }
        }
      }
    }return todosWithState;
  }

  @Override
  public List<Item> listTasks() {
    List<Item> listItems = this.list;
    List<Item> tasks = new ArrayList<>();
    for (Item item : listItems) {
      if (item instanceof Task) {
        tasks.add(item);
      }
    }
    return tasks;
  }

  @Override
  public List<Item> searchByTitleOrDescription(String pattern) {
    List<Item> all = this.list;
    List<Item> found = new ArrayList<>();

    for (Item item : all) {

      if (item.getTitle().contains(pattern)) {
        found.add(item);
      } else if (item.getDescription().contains(pattern)) {
        found.add(item);
      }
    }
    return found;
  }

  @Override
  public void changeTodoState() {

  }

  public List<Item> getList() {
    return list;
  }
}
