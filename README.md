# JavaFX Calculator (exam task)

A small JavaFX calculator written for an exam in June 2021. Type two integers and an operator separated by spaces (for example `12 * 4`), press the button, and the result appears below. It supports `+`, `-`, `*` and `/`. The UI labels are in Russian.

- `Main.java` loads the FXML view (`calc.fxml`).
- `Controller.java` parses the expression and computes the result.
- `Data.java` holds the operands and result.

**Run:** open the folder in IntelliJ IDEA as a Java project with the JavaFX SDK (15) as a library. Run `sample.Main` with the VM options `--module-path <path-to-javafx-sdk>/lib --add-modules javafx.controls,javafx.fxml`.

Экзаменационное задание, 2021.
