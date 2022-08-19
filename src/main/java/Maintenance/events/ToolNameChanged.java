package Maintenance.events;


import Maintenance.values.ToolID;
import Maintenance.values.ToolName;
import co.com.sofka.domain.generic.DomainEvent;

public class ToolNameChanged extends DomainEvent {
    private final ToolID toolID;
    private final ToolName toolName;

    public ToolNameChanged( ToolID toolID, ToolName toolName) {
        super("DDD.Maintenance.ToolNameChanged");
        this.toolID = toolID;
        this.toolName = toolName;
    }

    public ToolID getToolID() {
        return toolID;
    }

    public ToolName getToolName() {
        return toolName;
    }
}
