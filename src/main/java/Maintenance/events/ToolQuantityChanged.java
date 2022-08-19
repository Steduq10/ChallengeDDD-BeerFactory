package Maintenance.events;


import Maintenance.values.ToolID;
import Maintenance.values.ToolQuantity;
import co.com.sofka.domain.generic.DomainEvent;

public class ToolQuantityChanged extends DomainEvent {
    private final ToolID toolID;
    private final ToolQuantity toolQuantity;

    public ToolQuantityChanged( ToolID toolID, ToolQuantity toolQuantity) {
        super("DDD.Maintenances.ToolQuantityChanged");
        this.toolID = toolID;
        this.toolQuantity = toolQuantity;
    }

    public ToolID getToolID() {
        return toolID;
    }

    public ToolQuantity getToolQuantity() {
        return toolQuantity;
    }
}
