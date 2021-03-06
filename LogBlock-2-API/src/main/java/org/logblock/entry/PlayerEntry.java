package org.logblock.entry;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class PlayerEntry extends AbstractEntry
{

    private final String name;

    public PlayerEntry(String name) {
        this.name = name;
    }

    public PlayerEntry(int id, String name)
    {
        super(id);
        this.name = name;
    }
}
