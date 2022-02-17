package Cell;

import javafx.scene.control.Button;

public class SeaButton extends Button {
    public Cell cell;
    public SeaButton() {
        super();
        setMinHeight(30.0);
        setMinWidth(30.0);
        this.cell = new Cell(this);
    }
}
