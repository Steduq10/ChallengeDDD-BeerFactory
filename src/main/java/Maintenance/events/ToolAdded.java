package Maintenance.events;

import Maintenance.values.ToolBrand;
import Maintenance.values.ToolID;
import Maintenance.values.ToolName;
import Maintenance.values.ToolQuantity;
import co.com.sofka.domain.generic.DomainEvent;

public class ToolAdded extends DomainEvent {
    private final ToolID toolID;
    private final ToolName toolName;
    private final ToolQuantity toolQuantity;
    private final ToolBrand toolBrand;

    public ToolAdded( ToolID toolID, ToolName toolName, ToolQuantity toolQuantity, ToolBrand toolBrand) {
        super("DDD.Maintenances.ToolAdded");
        this.toolID = toolID;
        this.toolName = toolName;
        this.toolQuantity = toolQuantity;
        this.toolBrand = toolBrand;
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
