package models.base;

import models.TodoState;

public class Todo extends Item {

  private TodoState state;


  public Todo(String title, String description, TodoState state) {
    setTitle(title);
    setDescription(description);
    setState(state);

  }

  public TodoState getState() {
    return state;
  }

  private void setState(TodoState state) {
    if(state==null){
      throw new NullPointerException();
    }
    this.state = state;
  }
  @Override
  public String toString() {
    return String.format("Title: %s, Description: %s, TodoState: %s\n",
        getTitle(), getDescription(), getState());
  }
}
