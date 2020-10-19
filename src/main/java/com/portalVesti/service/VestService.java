/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portalVesti.service;

import com.portalVesti.model.KategorijaEntity;
import com.portalVesti.model.VestEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author Katica
 */

public interface VestService {
    boolean save(VestEntity vest);
    VestEntity findByKategorija(KategorijaEntity kategorija);
}
