package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING_TASK = "DRIVING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";

    public final Task doTask(final String task) {
        return switch (task) {
            case DRIVING_TASK -> new DrivingTask("Drive", "To shop", "Car");
            case PAINTING_TASK -> new PaintingTask("Painting", "Blue", "Sky");
            case SHOPPING_TASK -> new ShoppingTask("Shopping", "Milk", 2);
            default -> null;
        };
    }
}
