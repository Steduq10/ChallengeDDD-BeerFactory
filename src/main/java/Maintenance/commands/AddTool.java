package Maintenance.commands;

import Maintenance.values.*;
import co.com.sofka.domain.generic.Command;

public class AddTool extends Command {
    private final MaintenainceID maintenainceID;
    private final ToolID toolID;
    private final ToolName toolName;
    private final ToolQuantity toolQuantity;
    private final ToolBrand toolBrand;

    public AddTool(MaintenainceID maintenainceID, ToolID toolID, ToolName toolName, ToolQuantity toolQuantity, ToolBrand toolBrand) {
        this.maintenainceID = maintenainceID;
        this.toolID = toolID;
        this.toolName = toolName;
        this.toolQuantity = toolQuantity;
        this.toolBrand = toolBrand;
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

    public ToolQuantity getToolQuantity() {
        return toolQuantity;
    }

    public ToolBrand getToolBrand() {
        return toolBrand;
    }
}
