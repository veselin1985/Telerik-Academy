package models.base;

import models.TicketPriority;

import java.util.Date;

public class Task extends Item {

  private Date dueDate;
  private TicketPriority priority;
  private Date plannedTime;
  private String assignee;


  public Task(String title, String description, Date dueDate, TicketPriority priority, Date plannedTime, String assignee) {
    setTitle(title);
    setDescription(description);
    setDueDate(dueDate);
    setPriority(priority);
    setPlannedTime(plannedTime);
    setAssignee(assignee);

  }

  public Date getDueDate() {
    return dueDate;
  }

  public TicketPriority getPriority() {
    return priority;
  }

  public Date getPlannedTime() {
    return plannedTime;
  }

  public String getAssignee() {
    return assignee;
  }

  public void setDueDate(Date dueDate) {
    if (dueDate == null) {
      throw new NullPointerException();
    }
    this.dueDate = dueDate;
  }

  public void setPriority(TicketPriority priority) {
    if (priority == null) {
      throw new NullPointerException();
    }
    this.priority = priority;
  }

  public void setPlannedTime(Date plannedTime) {
    if (plannedTime == null) {
      throw new NullPointerException();
    }

    this.plannedTime = plannedTime;
  }

  public void setAssignee(String assignee) {
    if (assignee == null) {
      throw new NullPointerException();
    }
    this.assignee = assignee;
  }

  @Override
  public String toString() {
    return String.format("Title: %s, Description: %s, DueDate: %s, Priority: %s, PlannedTime: %s, Assignee: %s\n",
        getTitle(), getDescription(), getDueDate(), getPriority(), getPlannedTime(), getAssignee());
  }
}
