package models.base;

public class Item {

  private String title;
  private String description;

  public Item() {

  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public void setTitle(String title) {
    if(title==null){
      throw new NullPointerException();
    }
    this.title = title;
  }

  public void setDescription(String description) {
    if(description==null){
      throw new NullPointerException();
    }
    this.description = description;
  }
}
