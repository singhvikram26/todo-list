package skill.learnprogramming.service;

import lombok.Getter;
import org.springframework.stereotype.Service;
import skill.learnprogramming.model.TodoData;
import skill.learnprogramming.model.TodoItem;

@Service
public class TodoItemServiceImpl implements TodoItemService {
    // == fields ==
    @Getter
    public final TodoData data = new TodoData();

    @Override
    public void addItem(TodoItem todoItem) {
        data.addItems(todoItem);
    }

    @Override
    public void removeItem(Integer id) {
        data.removeItem(id);
    }

    @Override
    public TodoItem getItem(Integer id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(TodoItem toUpdate) {
        data.updateItem(toUpdate);
    }

    @Override
    public TodoData getData() {
        return data;
    }
}
