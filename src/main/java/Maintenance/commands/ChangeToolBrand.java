package Maintenance.commands;

import Maintenance.values.MaintenainceID;
import Maintenance.values.ToolBrand;
import Maintenance.values.ToolID;
import Maintenance.values.ToolName;
import co.com.sofka.domain.generic.Command;

public class ChangeToolBrand extends Command {
    private final MaintenainceID maintenainceID;
    private final ToolID toolID;
    private final ToolBrand toolBrand;

    public ChangeToolBrand(MaintenainceID maintenainceID, ToolID toolID, ToolBrand toolBrand) {
        this.maintenainceID = maintenainceID;
        this.toolID = toolID;
        this.toolBrand = toolBrand;
    }

    public MaintenainceID getMaintenainceID() {
        return maintenainceID;
    }

    public ToolID getToolID() {
        return toolID;
    }

    public ToolBrand getToolBrand() {
        return toolBrand;
    }
}
