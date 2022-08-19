package Maintenance;

import Maintenance.values.ToolBrand;
import Maintenance.values.ToolID;
import Maintenance.values.ToolName;
import Maintenance.values.ToolQuantity;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Tool extends Entity<ToolID> {
    private ToolName toolName;
    private ToolQuantity toolQuantity;
    private ToolBrand toolBrand;

    public Tool(ToolID entityId, ToolName toolName, ToolQuantity toolQuantity, ToolBrand toolBrand) {
        super(entityId);
        this.toolName = toolName;
        this.toolQuantity = toolQuantity;
        this.toolBrand = toolBrand;
    }
    public void ChangeName(ToolName toolName){
        this.toolName = Objects.requireNonNull(toolName);
    }

    public void ChangeQuantity(ToolQuantity toolQuantity){
        this.toolQuantity = Objects.requireNonNull(toolQuantity);
    }

    public void ChangeBrand(ToolBrand toolBrand){
        this.toolBrand = Objects.requireNonNull(toolBrand);
    }

    public ToolName toolName() {
        return toolName;
    }

    public ToolQuantity toolQuantity() {
        return toolQuantity;
    }

    public ToolBrand toolBrand() {
        return toolBrand;
    }
}
