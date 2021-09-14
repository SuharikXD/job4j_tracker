package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit Program" + System.lineSeparator() +
                        "==== Exit Program ====" + System.lineSeparator()
        ));
    }

    @Test
    public void FindAllItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item firstItem = tracker.add(new Item("first item"));
        Item secondItem = tracker.add(new Item("second item"));
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = {
                new ShowAllAction(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() +
                "0. Show all items" + System.lineSeparator() +
                "1. Exit Program" + System.lineSeparator() +
                "=== Show all items ====" + System.lineSeparator() +
                firstItem + System.lineSeparator() +
                secondItem + System.lineSeparator() +
                "Menu." + System.lineSeparator() +
                "0. Show all items" + System.lineSeparator() +
                "1. Exit Program" + System.lineSeparator() +
                "==== Exit Program ====" + System.lineSeparator()
        ));
    }

    @Test
    public void FindByIdItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("first item"));
        Input in = new StubInput(
                new String[]{"0", "1", "1"}
        );
        UserAction[] actions = {
                new FindByIdAction(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() +
                "0. Find by id" + System.lineSeparator() +
                "1. Exit Program" + System.lineSeparator() +
                "=== Find item by id ====" + System.lineSeparator() +
                item + System.lineSeparator() +
                "Menu." + System.lineSeparator() +
                "0. Find by id" + System.lineSeparator() +
                "1. Exit Program" + System.lineSeparator() +
                "==== Exit Program ====" + System.lineSeparator()
        ));
    }

    @Test
    public void FindByNameItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("first item"));
        Input in = new StubInput(
                new String[]{"0", "first item", "1"}
        );
        UserAction[] actions = {
                new FindByNameAction(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator() +
                "0. Find items by name" + System.lineSeparator() +
                "1. Exit Program" + System.lineSeparator() +
                "=== Find items by name ====" + System.lineSeparator() +
                item + System.lineSeparator() +
                "Menu." + System.lineSeparator() +
                "0. Find items by name" + System.lineSeparator() +
                "1. Exit Program" + System.lineSeparator() +
                "==== Exit Program ====" + System.lineSeparator()
        ));
    }
}