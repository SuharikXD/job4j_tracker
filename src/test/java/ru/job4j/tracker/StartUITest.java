package ru.job4j.tracker;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        ArrayList<UserAction> actions = new ArrayList<>();
        actions.add(new ReplaceAction(out));
        actions.add(new ExitProgram(out));
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
        ArrayList<UserAction> actions = new ArrayList<>();
        actions.add(new DeleteAction(out));
        actions.add(new ExitProgram(out));
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
        ArrayList<UserAction> actions = new ArrayList<>();
        actions.add(new ExitProgram(out));
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
        ArrayList<UserAction> actions = new ArrayList<>();
        actions.add(new ShowAllAction(out));
        actions.add(new ExitProgram(out));
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
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        ArrayList<UserAction> actions = new ArrayList<>();
        actions.add(new FindByIdAction(out));
        actions.add(new ExitProgram(out));
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
        ArrayList<UserAction> actions = new ArrayList<>();
        actions.add(new FindByNameAction(out));
        actions.add(new ExitProgram(out));
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

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "0"}
        );
        Tracker tracker = new Tracker();
        ArrayList<UserAction> actions = new ArrayList<>();
        actions.add(new ExitProgram(out));
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), Matchers.is(
                "Menu." + ln
                        + "0. Exit Program" + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu." + ln
                        + "0. Exit Program" + ln
                        + "==== Exit Program ====" + ln
                )
        );
    }
}