import base.CommandParser;
import base.ProjectManagementSystem;
import commands.Command;
import commands.CommandType;
import models.TicketPriority;
import models.TodoState;
import models.base.Item;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application {
  private final CommandParser commandParser;
  ProjectManagementSystem system;

  public Application(CommandParser commandParser, ProjectManagementSystem system) {
    this.system = system;
    this.commandParser = commandParser;
  }

  public void run() throws ParseException {
    Scanner in = new Scanner(System.in);
    while (true) {
      String commandString = in.nextLine();
      Command command = this.commandParser.parseCommand(commandString);
      if (command.getCommandType() == CommandType.EXIT) {
        break;
      }

      switch (command.getCommandType()) {
        case ADD_TODO:
          String title = command.getParams()[0];
          StringBuilder descriptionBuilder = new StringBuilder();
          int counter=1;
          String check;
          while(true) {
            check = command.getParams()[counter];
            if(check.equals("NOT")){
              break;
            }if(check.equals("DONE")){
              break;
            }
            descriptionBuilder.append(check);
            descriptionBuilder.append(" ");
            counter++;

          }
         String description = descriptionBuilder.toString();
         TodoState state;
         switch (check.toLowerCase()) {
           case "not":{
             state = TodoState.NOT_DONE;
             break;
           }default:
             state = TodoState.DONE;
         }
          system.addTodo(title, description, state);
          break;
        case ADD_TASK:
          DateFormat df = new SimpleDateFormat("dd-mm-yyyy");
          title = command.getParams()[0];
          description = command.getParams()[1];
          Date dueDate = df.parse(command.getParams()[2]);
          String stringPriority = command.getParams()[3];
          TicketPriority priority = TicketPriority.LOW_PRIORITY;
          if (stringPriority.equals("High Priority")) {
            priority = TicketPriority.HIGH_PRIORITY;
          }
          Date plannedTime = df.parse(command.getParams()[4]);
          String assignee = command.getParams()[5];
          system.addTask(title, description, dueDate, priority, plannedTime, assignee);
          break;
        case ADD_TICKET:
          df = new SimpleDateFormat("dd-mm-yyyy");
          title = command.getParams()[0];
          description = command.getParams()[1];
          dueDate = df.parse(command.getParams()[2]);
          stringPriority = command.getParams()[3];
          priority = TicketPriority.LOW_PRIORITY;
          if (stringPriority.equals("High Priority")) {
            priority = TicketPriority.HIGH_PRIORITY;
          }
          String sender = command.getParams()[4];
          String owner = command.getParams()[5];
          system.addTicket(title, description, dueDate, priority, sender, owner);
          break;
        case LIST_ALL:
          List<Item> allItems = system.listAll();
          for (Item item : allItems
              ) {
            System.out.print(item.toString());
          }
          break;
        case LIST_TASKS:
          List<Item> tasks = system.listTasks();
          for (Item item : tasks
              ) {
            System.out.print(item.toString());
          }
          break;
        case LIST_TODOS:
          List<Item> todos = system.listTodos();
          for (Item item : todos
              ) {
            System.out.print(item.toString());
          }
          break;
        case UPDATE_TODO:
          // TODO: your code here
          break;
        case LIST_TICKETS:
          List<Item> tickets = system.listTickets();
          for (Item item: tickets
               ) {
            System.out.print(item.toString());

          }
          break;
        case LIST_TODOS_NOT_DONE:
          List<Item> todoWithStates = system.listTodos(TodoState.NOT_DONE);
          for (Item item: todoWithStates
               ) {
            System.out.print(item.toString());
          }


          break;
      }
    }
  }
}
