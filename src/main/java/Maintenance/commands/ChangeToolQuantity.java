package Maintenance.commands;

import Maintenance.values.*;
import co.com.sofka.domain.generic.Command;

public class ChangeToolQuantity extends Command {
    private final MaintenainceID maintenainceID;
    private final ToolID toolID;
    private final ToolQuantity toolQuantity;

    public ChangeToolQuantity(MaintenainceID maintenainceID, ToolID toolID, ToolQuantity toolQuantity) {
        this.maintenainceID = maintenainceID;
        this.toolID = toolID;
        this.toolQuantity = toolQuantity;
    }

    public MaintenainceID getMaintenainceID() {
        return maintenainceID;
    }

    public ToolID getToolID() {
        return toolID;
    }

    public ToolQuantity getToolQuantity() {
        return toolQuantity;
    }
}
