package com.yydongro.autosarcasm;

import java.util.*;

public class MessageManager {

    private final List<String> messages = Arrays.asList(
            "lmao",
            "loll",
            "lemon squeeze",
            "oops",
            "oof",
            "ripperoni",
            "yikes",
            "unlucky",
            "clean hit",
            "ggwp"
    );

    private final Set<String> used = new HashSet<String>();
    private final Random random = new Random();

    public void reset() {
        used.clear();
    }

    public String getNextMessage() {
        if (used.size() == messages.size()) {
            return "ggwp";
        }

        String pick = null;
        while (pick == null) {
            String candidate = messages.get(random.nextInt(messages.size()));
            if (!used.contains(candidate)) {
                pick = candidate;
                used.add(candidate);
            }
        }
        return pick;
    }
}
