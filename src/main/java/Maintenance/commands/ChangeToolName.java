package Maintenance.commands;

import Maintenance.values.*;
import co.com.sofka.domain.generic.Command;

public class ChangeToolName extends Command {
    private final MaintenainceID maintenainceID;
    private final ToolID toolID;
    private final ToolName toolName;

    public ChangeToolName(MaintenainceID maintenainceID, ToolID toolID, ToolName toolName) {
        this.maintenainceID = maintenainceID;
        this.toolID = toolID;
        this.toolName = toolName;
    }

    public MaintenainceID getMaintenainceID() {
        return maintenainceID;
    }

    public ToolID getToolID() {
        return toolID;
    }

    public ToolName getToolName() {
        return toolName;
    }
}
