package data;

public enum ColorData {

    WHITE("белый"),
    BLACK("черный"),
    BRAUN("коричневый"),
    GRAY("серый");

    private String name;

    ColorData(String name) {
        this.name = name;
    }

    // Метод для поиска enum по name
    public static ColorData fromString(String text) {
        for (ColorData color : ColorData.values()) {
            if (color.name.equalsIgnoreCase(text)) {
                return color;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

