package net.caprazzi.giddone.hook;

import net.caprazzi.giddone.hook.PostReceiveHook;

public class QueueElement {
    private final int id;
    private final PostReceiveHook value;

    public QueueElement(int id, PostReceiveHook value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public PostReceiveHook getValue() {
        return value;
    }
}
