package models.base;

import models.TicketPriority;

import java.util.Date;

public class Ticket extends Item {

  private Date dueDate;
  private TicketPriority priority;
  private String sender;
  private String owner;

  public Ticket(String title, String description, Date dueDate, TicketPriority priority, String sender, String owner) {
    setTitle(title);
    setDescription(description);
    setDueDate(dueDate);
    setPriority(priority);
    setSender(sender);
    setOwner(owner);
  }

  public Date getDueDate() {
    return dueDate;
  }

  public TicketPriority getPriority() {
    return priority;
  }

  public String getSender() {
    return sender;
  }

  public String getOwner() {
    return owner;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  public void setPriority(TicketPriority priority) {
    this.priority = priority;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  @Override
  public String toString() {
    return String.format("Title: %s, Description: %s, DueDate: %s, Priority: %s, Sender: %s, Owner: %s\n",
        getTitle(), getDescription(), getDueDate(), getPriority(), getSender(), getOwner());
  }
}
