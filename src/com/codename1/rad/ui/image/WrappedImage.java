/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.rad.ui.image;

import com.codename1.ui.Image;

/**
 *
 * @author shannah
 */
public class WrappedImage extends AsyncImage {
    
    public WrappedImage(Image img) {
        complete(img);
    }
}
