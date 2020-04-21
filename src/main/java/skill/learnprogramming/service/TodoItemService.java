package skill.learnprogramming.service;

import skill.learnprogramming.model.TodoData;
import skill.learnprogramming.model.TodoItem;

public interface TodoItemService {
     void addItem(TodoItem todoItem);
     void removeItem(Integer id);
     TodoItem getItem(Integer id);
     void updateItem(TodoItem toUpdate);
     TodoData getData();
}
