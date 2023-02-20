package guru_qa.tests.data;

public enum MenuItems {
    SERVICES ("Услуги"),
    SOLUTIONS("Отраслевые решения");

    private final String value;

    MenuItems(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
    }
