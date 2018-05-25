import base.CommandParser;
import commands.Command;
import commands.CommandType;

import java.util.Arrays;

public class CommandParserImpl implements CommandParser {
  CommandType commandType;

  @Override
  public Command parseCommand(String commandString) {
    String[] commandParts = commandString.split(" ");
    String command = commandParts[0];
    switch (command.toLowerCase()) {
      case "add-todo": {
        commandType = CommandType.ADD_TODO;
        break;
      }
      case "add-task": {
        commandType = CommandType.ADD_TASK;
        break;
      }
      case "add-ticket": {
        commandType = CommandType.ADD_TICKET;
        break;
      }
      case "update-todo": {
        commandType = CommandType.UPDATE_TODO;
        break;
      }
      case "list-all": {
        commandType = CommandType.LIST_ALL;
        break;

      }
      case "list-todos-not-done": {
        commandType = CommandType.LIST_TODOS_NOT_DONE;
        break;
      }
      case "list-tickets": {
        commandType = CommandType.LIST_TICKETS;
        break;
      }
      case "list-tasks": {
        commandType = CommandType.LIST_TASKS;
        break;
      }


    }
    String[] args = Arrays.copyOfRange(commandParts, 1, commandParts.length);
    return new Command(commandType, args);
  }

}