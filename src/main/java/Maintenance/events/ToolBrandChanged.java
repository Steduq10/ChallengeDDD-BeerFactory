package Maintenance.events;

import Maintenance.values.ToolBrand;
import Maintenance.values.ToolID;
import Maintenance.values.ToolName;
import Maintenance.values.ToolQuantity;
import co.com.sofka.domain.generic.DomainEvent;

public class ToolBrandChanged extends DomainEvent {
    private final ToolID toolID;
    private final ToolBrand toolBrand;

    public ToolBrandChanged( ToolID toolID, ToolBrand toolBrand) {
        super("DDD.Maintenance.ToolBrandChanged");
        this.toolID = toolID;
        this.toolBrand = toolBrand;
    }

    public ToolID getToolID() {
        return toolID;
    }

    public ToolBrand getToolBrand() {
        return toolBrand;
    }
}
