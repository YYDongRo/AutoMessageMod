# AutoMessageMod (Forge 1.8.9)

**AutoMessageMod** is a lightweight Forge 1.8.9 client-side mod that automatically sends a random message from a list that you can edit in Hypixel Bedwars whenever you kill a player.  

Each message is unique per game to avoid duplicates and always stays within Hypixel’s chat rules.

---

## Features
- Detects Bedwars kill messages involving the player.
- Sends a random message from the string in the code.
- No repeated messages within the same game.
- Automatically activates when “**The game starts in 5 seconds**” appears.
- Sends messages instantly without opening chat.
- Fully client-side and low resource usage.

---

## Example Messages
***lmao*, *lolll*, *lemon squeeze*, *easy peasy*, *nice try buddy***

(You can customize the message list in `MessageManager.java`.)

---

## Build Instructions

Jave file path: ```src/main/java/com/YYDongRo/AutoMessage```

## Customization

- Open `MessageManager.java`
- Edit the list:

```java
private static final String[] MESSAGES = {
    "lmao",
    "lolll",
    "lemon squeeze",
    "nice try buddy"
};
```

- To compile the mod:
  
`
./gradlew build
`

- Your built JAR will appear in:

`
build/libs/
`










