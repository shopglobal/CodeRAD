/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.rad.nodes;

import com.codename1.rad.models.Attribute;
import com.codename1.rad.models.Property;

/**
 *
 * @author shannah
 */
public class PropertyNode extends Node<Property> {
    
    public PropertyNode(Property value, Attribute... atts) {
        super(value, atts);
    }
    
}
