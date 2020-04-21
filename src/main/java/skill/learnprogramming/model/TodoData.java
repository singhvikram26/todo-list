package skill.learnprogramming.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TodoData {
        //== fields ==
    private static  int idValue = 1;
    private final List<TodoItem> items = new ArrayList<>();

    //== constructors ==
    public TodoData(){
        // add some dummy data, using the addItem method so it sets the id field
        addItems(new TodoItem("first","first details", LocalDate.now()));
        addItems(new TodoItem("second","second details", LocalDate.now()));
        addItems(new TodoItem("third","third details", LocalDate.now()));
        addItems(new TodoItem("fourth","fourth details", LocalDate.now()));
    }

    //== public methods ==
    public List<TodoItem> getItems()
    {
        return Collections.unmodifiableList(items);
    }

    public void addItems(@NonNull  TodoItem toAdd)
    {
        toAdd.setId(idValue);
        items.add(toAdd);
        idValue++;
    }

    public void removeItem(int id)
    {
        ListIterator<TodoItem> listIterator = items.listIterator();
        while (listIterator.hasNext()){
            TodoItem item = listIterator.next();
            if(item.getId() == id){
                listIterator.remove();
                break;
            }
        }
    }

    public TodoItem getItem(int id){
        for (TodoItem item: items){
            if (item.getId() == id)
            {
                return item;
            }
        }
        return null;
    }

    public void updateItem(@NonNull TodoItem toUpdate){
        ListIterator<TodoItem> listIterator = items.listIterator();
        while (listIterator.hasNext())
        {
            TodoItem item = listIterator.next();
            if (item.equals(toUpdate)){
                listIterator.set(toUpdate);
                break;
            }
        }

    }
}
