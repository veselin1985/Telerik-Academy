import base.CommandParser;
import base.ProjectManagementSystem;


import java.text.ParseException;


public class Main {
  public static void main(String[] args) throws ParseException {
    CommandParser parser = new CommandParserImpl();
    ProjectManagementSystem system = new ProjectManagementSystemImpl();
    Application app = new Application(parser, system);
    app.run();



  }
}