package com.minerpg.element;

import java.util.ArrayList;
import java.util.List;

public class Equipment {
    public String name;
    public String description;

    public EquipmentType type;
    public Attribute attribute = new Attribute();
    public List<Skill> skillList = new ArrayList<>();
}
