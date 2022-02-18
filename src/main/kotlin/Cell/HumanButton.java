package Cell;

import javafx.scene.control.Button;

public class HumanButton extends Button {
    public Cell cell;
    public HumanButton() {
        super();
        setMinHeight(30.0);
        setMinWidth(30.0);
        this.cell = new Cell(this);
    }
}
